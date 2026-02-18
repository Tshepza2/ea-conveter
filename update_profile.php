<?php
require_once __DIR__ . '/php-includes/auth.php';

// Simple profile update handler. Stores updates in a JSON file and updates session.
$userId = $CURRENT_USER['id'] ?? null;
if (!$userId) {
    header('Location: index.php');
    exit;
}

$userDB = __DIR__ . '/php-includes/users.json';
if (!file_exists($userDB)) {
    file_put_contents($userDB, json_encode(new stdClass(), JSON_PRETTY_PRINT));
}

$users = json_decode(file_get_contents($userDB), true) ?: [];
$user = $users[$userId] ?? [];

// process logo upload (if present)
if (!empty($_FILES['logo']) && $_FILES['logo']['error'] === UPLOAD_ERR_OK) {
    $tmp = $_FILES['logo']['tmp_name'];
    $name = $_FILES['logo']['name'];
    $ext = strtolower(pathinfo($name, PATHINFO_EXTENSION));
    $allowed = ['jpg','jpeg','png','gif'];
    if (in_array($ext, $allowed)) {
        $uploadsDir = __DIR__ . '/../uploads/';
        if (!is_dir($uploadsDir)) {
            mkdir($uploadsDir, 0755, true);
        }
        $filename = time() . '_' . bin2hex(random_bytes(6)) . '.' . $ext;
        $dest = $uploadsDir . $filename;
        if (move_uploaded_file($tmp, $dest)) {
            $user['avatar'] = '../uploads/' . $filename;
        }
    }
}

// process text fields
if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    if (isset($_POST['fullname'])) {
        $user['fullname'] = trim(strip_tags($_POST['fullname']));
        $_SESSION['fullname'] = $user['fullname'];
    }
    if (isset($_POST['displayname'])) {
        $user['displayname'] = trim(strip_tags($_POST['displayname']));
        $_SESSION['displayname'] = $user['displayname'];
    }
    if (isset($_POST['phone'])) {
        $user['phone'] = trim(strip_tags($_POST['phone']));
        $_SESSION['phone'] = $user['phone'];
    }
    // Do not change email here (form disables it). If needed, add validation.
}

$users[$userId] = $user;
file_put_contents($userDB, json_encode($users, JSON_PRETTY_PRINT), LOCK_EX);

// set flash message
$_SESSION['flash'] = 'Profile updated successfully.';

header('Location: profile.php');
exit;

?>
