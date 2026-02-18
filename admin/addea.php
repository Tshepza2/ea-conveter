<?php
require_once __DIR__ . '/php-includes/auth.php';
require_once __DIR__ . '/php-includes/api_config.php';

if ($_SERVER['REQUEST_METHOD'] !== 'POST') {
    header('Location: EA.php');
    exit;
}

$name = isset($_POST['ea']) ? trim($_POST['ea']) : '';
$platform = isset($_POST['platform']) ? trim($_POST['platform']) : 'mt4';

$payload = ['name' => $name, 'platform' => $platform];

$ch = curl_init(rtrim($API_BASE_URL, '/') . '/admin/api/ea/create');
curl_setopt($ch, CURLOPT_POST, true);
curl_setopt($ch, CURLOPT_POSTFIELDS, json_encode($payload));
curl_setopt($ch, CURLOPT_HTTPHEADER, ['Content-Type: application/json']);
curl_setopt($ch, CURLOPT_RETURNTRANSFER, true);
$resp = curl_exec($ch);
$http = curl_getinfo($ch, CURLINFO_HTTP_CODE);
if ($resp === false) {
    $err = curl_error($ch);
    curl_close($ch);
    $message = 'Error contacting API: ' . htmlspecialchars($err);
} else {
    curl_close($ch);
    $data = json_decode($resp, true);
    if ($http >= 200 && $http < 300 && isset($data['data'])) {
        $ea = $data['data'];
        $message = sprintf('EA created: <strong>%s</strong> (id: %s)', htmlspecialchars($ea['name']), htmlspecialchars($ea['id']));
    } else {
        $errMsg = isset($data['detail']) ? $data['detail'] : ($data['message'] ?? 'Unknown API error');
        $message = 'API error: ' . htmlspecialchars($errMsg);
    }
}

?>
<!doctype html>
<html>
  <head>
    <meta charset="utf-8" />
    <title>Add EA - Result</title>
    <link rel="stylesheet" href="css/vertical-layout-light/style.css">
  </head>
  <body>
    <div class="container">
      <h3>Add EA Result</h3>
      <div class="card">
        <div class="card-body">
          <p><?php echo $message; ?></p>
          <p><a href="EA.php" class="btn btn-primary">Back</a></p>
        </div>
      </div>
    </div>
  </body>
</html>
