<?php
require_once __DIR__ . '/php-includes/auth.php';
require_once __DIR__ . '/php-includes/api_config.php';

if ($_SERVER['REQUEST_METHOD'] !== 'POST') {
    header('Location: key.php');
    exit;
}

$name = isset($_POST['name']) ? trim($_POST['name']) : '';
$ea = isset($_POST['ea']) ? intval($_POST['ea']) : 0;
$plan = isset($_POST['plan']) ? intval($_POST['plan']) : 30;

$payload = ['ea_id' => $ea, 'duration_days' => $plan];

$ch = curl_init(rtrim($API_BASE_URL, '/') . '/admin/api/licences/generate');
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
        $lic = $data['data'];
        $message = sprintf('Licence created: <strong>%s</strong> (expires: %s) Phone secret: <code>%s</code>', htmlspecialchars($lic['key']), htmlspecialchars($lic['expires']), htmlspecialchars($lic['phone_secret']));
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
    <title>Generate Key - Result</title>
    <link rel="stylesheet" href="css/vertical-layout-light/style.css">
  </head>
  <body>
    <div class="container">
      <h3>Generate Licence Result</h3>
      <div class="card">
        <div class="card-body">
          <p><?php echo $message; ?></p>
          <p><a href="key.php" class="btn btn-primary">Back</a></p>
        </div>
      </div>
    </div>
  </body>
</html>
