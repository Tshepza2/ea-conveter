<?php
// Login page: if already logged in, redirect to home
session_start();
if (isset($_SESSION['user_id'])) {
    header('Location: home.php');
    exit;
}
?>
<html lang="en"><head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Sign In | EA PURSUIT</title>
    <link href="https://fonts.googleapis.com/css2?family=Orbitron:wght@400;700&amp;display=swap" rel="stylesheet">
    <link rel="stylesheet" href="https://cdn.materialdesignicons.com/4.8.95/css/materialdesignicons.min.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="./assets/css/login.css">
    <link rel="shortcut icon" href="assets/sitelogo.png">
    <link rel="icon" href="assets/sitelogo.png">
    <style>
        body {
            background-color: #000000; /* Black background */
            color:rgb(0, 0, 0); /* White text */
            font-family: 'Orbitron', sans-serif;
        }

        .login-card {
            background-color: #000000; /* Black background */
            border: 1px solid rgb(0, 26, 255); /* Red border */
            box-shadow: 0 0 15px rgb(0, 26, 255); /* Red shadow */
        }

        .login-card-img {
            width: 100%;
            height: 100%;
            object-fit: cover;
            filter: drop-shadow(0 0 10px rgb(0, 26, 255)); /* Red shadow */
        }

        .card-body {
            padding: 2rem;
        }

        .brand-wrapper h1 {
            color: rgb(0, 26, 255); /* Red text */
            text-shadow: 0 0 5px rgb(0, 26, 255); /* Red shadow */
            font-weight: 700;
        }

        .brand-wrapper pre p {
            color: rgb(0, 26, 255); /* Red text */
            text-shadow: 0 0 3px rgb(0, 26, 255); /* Red shadow */
            font-style: italic;
        }

        .login-card-description {
            color: rgb(0, 26, 255); /* Red text */
            text-shadow: 0 0 3px rgb(0, 26, 255); /* Red shadow */
            font-weight: 400;
            font-size: 1.5rem;
        }

        .form-control {
            background-color: #000000; /* Black background */
            border: 1px solid rgb(0, 26, 255); /* Red border */
            color: rgb(0, 26, 255); /* White text */
            text-shadow: 0 0 2px rgb(0, 26, 255); /* Red shadow */
        }

        .form-control::placeholder {
            color: rgb(0, 26, 255); /* White placeholder */
            opacity: 0.7;
        }

        .form-control:focus {
            background-color: #000000; /* Black background */
            border-color: rgb(0, 26, 255); /* Red border */
            color: rgb(0, 26, 255); /* White text */
            box-shadow: 0 0 10px rgb(0, 26, 255); /* Red shadow */
        }

        #login {
            background-color: rgb(0, 26, 255); /* Red background */
            color: #000000; /* Black text */
            border: none;
            text-shadow: 0 0 5px #000000; /* Black shadow */
            transition: all 0.3s ease;
            font-weight: 700;
        }

        #login:hover {
            box-shadow: 0 0 15px rgb(0, 26, 255); /* Red shadow */
            transform: scale(1.05);
        }

        #login:active {
            transform: scale(0.95);
        }

        .forgot-password-link {
            color: rgb(0, 26, 255); /* Red text */
            text-shadow: 0 0 3px rgb(0, 26, 255); /* Red shadow */
            transition: all 0.3s ease;
        }

        .forgot-password-link:hover {
            text-shadow: 0 0 10px rgb(0, 26, 255); /* Red shadow */
        }

        .login-card-footer-text {
            color: rgb(0, 26, 255); /* Red text */
            text-shadow: 0 0 3px rgb(0, 26, 255); /* Red shadow */
        }

        .login-card-footer-text a {
            color: rgb(0, 26, 255); /* Red text */
            text-shadow: 0 0 3px rgb(0, 26, 255); /* Red shadow */
            transition: all 0.3s ease;
        }

        .login-card-footer-text a:hover {
            text-shadow: 0 0 10px rgb(0, 26, 255); /* Red shadow */
        }

        .login-card-footer-nav a {
            color: rgb(0, 26, 255); /* Red text */
            text-shadow: 0 0 3px rgb(0, 26, 255); /* Red shadow */
            transition: all 0.3s ease;
        }

        .login-card-footer-nav a:hover {
            text-shadow: 0 0 10px rgb(0, 26, 255); /* Red shadow */
        }
    </style>
</head>
<body>
    <main class="d-flex align-items-center min-vh-100 py-3 py-md-0">
        <div class="container">
            <div class="card login-card">
                <div class="row no-gutters">
                    <div class="col-md-5">
                        <img src="https://s1.1zoom.me/big0/961/434216-Kycb.jpg" alt="login" class="login-card-img img-fluid">
                    </div>
                    <div class="col-md-7">
                        <div class="card-body">
                            <div class="brand-wrapper">
                                <h1 class="logo" style="font-weight: bold;">EA PURSUIT Mentor</h1>
                                <pre><p style="font-weight: bold; font-style: italic;">Admin Dashboard</p></pre>
                            </div>
                            <p class="login-card-description">Sign In</p>
                            <form action="home.php" method="post">
                                <div class="form-group">
                                    <label for="email" class="sr-only">Email</label>
                                    <input type="email" name="email" id="email" class="form-control" placeholder="Email" required="">
                                </div>
                                <div class="form-group mb-4">
                                    <label for="password" class="sr-only">Password</label>
                                    <input type="password" name="password" id="password" class="form-control" placeholder="***********" required="">
                                </div>
                                <input name="login" id="login" class="btn btn-block login-btn mb-4" type="submit" value="Login">
                            </form>
                            <a href="#!" class="forgot-password-link">Forgot password?</a>
                            <p class="login-card-footer-text">Only admins with an account! <a href="mentorsignup.php" class="text-reset">Sign Up</a></p>
                            <nav class="login-card-footer-nav">
                                <a href="#!">Terms of use.</a>
                                <a href="#!">Privacy policy.</a>
                                <a href="" target="_blank"></a>
                            </nav>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </main>
    <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>

<script>'undefined'=== typeof _trfq || (window._trfq = []);'undefined'=== typeof _trfd && (window._trfd=[]),_trfd.push({'tccl.baseHost':'secureserver.net'},{'ap':'cpbh-mt'},{'server':'p3plmcpnl495948'},{'dcenter':'p3'},{'cp_id':'10248081'},{'cp_cl':'8'}) // Monitoring performance to make your website faster. If you want to opt-out, please contact web hosting support.</script><script src="https://img1.wsimg.com/traffic-assets/js/tccl.min.js"></script>
</body></html>