<?php
// Simple auth check include for admin pages
session_start();

if (!isset($_SESSION['user_id'])) {
    // If user is not logged in, redirect to login page
    header('Location: ../index.php');
    exit;
}

// Optionally, expose current user info globally
$CURRENT_USER = [
    'id' => $_SESSION['user_id'] ?? null,
    'email' => $_SESSION['email'] ?? null,
    'displayname' => $_SESSION['displayname'] ?? null,
    'fullname' => $_SESSION['fullname'] ?? null,
];
?>
