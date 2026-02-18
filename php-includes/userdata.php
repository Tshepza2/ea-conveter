<?php
// Load user details from JSON store and expose helpful variables
// This assumes the including file already ran `auth.php` and session is started.
$userId = $CURRENT_USER['id'] ?? null;
$userDB = __DIR__ . '/users.json';
$stored = [];
if (file_exists($userDB)) {
    $stored = json_decode(file_get_contents($userDB), true) ?? [];
}
$userData = $stored[$userId] ?? [];
$fullnameVal = htmlspecialchars($userData['fullname'] ?? $CURRENT_USER['fullname'] ?? '', ENT_QUOTES);
$displaynameVal = htmlspecialchars($userData['displayname'] ?? $CURRENT_USER['displayname'] ?? '', ENT_QUOTES);
$phoneVal = htmlspecialchars($userData['phone'] ?? '', ENT_QUOTES);
$avatar = htmlspecialchars($userData['avatar'] ?? '../uploads/default-avatar.png', ENT_QUOTES);
?>
