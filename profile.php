<?php require_once __DIR__ . '/php-includes/auth.php'; ?>
<?php require_once __DIR__ . '/php-includes/userdata.php'; ?>
<!DOCTYPE html>
<html lang="en">

<head>
  <!-- Required meta tags -->
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <title>Home | EA Mobile Hosting</title>
  <!-- plugins:css -->
  <link rel="stylesheet" href="vendors/feather/feather.css">
  <link rel="stylesheet" href="vendors/ti-icons/css/themify-icons.css">
  <link rel="stylesheet" href="vendors/css/vendor.bundle.base.css">
  <!-- endinject -->
  <!-- Plugin css for this page -->
  <link rel="stylesheet" href="vendors/datatables.net-bs4/dataTables.bootstrap4.css">
  <link rel="stylesheet" href="vendors/ti-icons/css/themify-icons.css">
  <link rel="stylesheet" type="text/css" href="js/select.dataTables.min.css">
  <!-- End plugin css for this page -->
  <!-- inject:css -->
  <link rel="stylesheet" href="css/vertical-layout-light/style.css">
  <!-- endinject -->
  <link rel="shortcut icon" href="./images/logo.png" />
  <link rel=" icon" href="./images/logo.png" />
</head>
<body>
  <div class="container-scroller">
    <!-- partial:partials/_navbar.html -->
    <nav class="navbar col-lg-12 col-12 p-0 fixed-top d-flex flex-row">
        
      <div class="text-center navbar-brand-wrapper d-flex align-items-center justify-content-center">
         
       
    
      </div>
      <div class="navbar-menu-wrapper d-flex align-items-center justify-content-end">
        <button class="navbar-toggler navbar-toggler align-self-center" type="button" data-toggle="minimize">
          <span class="icon-menu"></span>
        </button>
        
        <ul class="navbar-nav navbar-nav-right">
          
          <li class="nav-item nav-profile dropdown">
            <a class="nav-link dropdown-toggle" href="#" data-toggle="dropdown" id="profileDropdown">
              <img src='<?php echo $avatar; ?>' alt="Menu"/>
              <?php echo isset($CURRENT_USER['displayname']) ? '<span class="ml-2">'.htmlspecialchars($CURRENT_USER['displayname']).'</span>' : ''; ?>
            </a>
            <div class="dropdown-menu dropdown-menu-right navbar-dropdown" aria-labelledby="profileDropdown">
            <a class="dropdown-item" href="./profile.php">
                <i class="ti-user text-primary"></i>
                Profile
              </a>
              <a class="dropdown-item" href="../php-includes/logout.php">
                <i class="ti-power-off text-primary"></i>
                Logout
              </a>
            </div>
          </li>
        </ul>
        <button class="navbar-toggler navbar-toggler-right d-lg-none align-self-center" type="button" data-toggle="offcanvas">
          <span class="icon-menu"></span>
        </button>
      </div>
    </nav>
    <!-- partial -->
    <div class="container-fluid page-body-wrapper">
      
      <!-- partial:partials/_sidebar.html -->
      <nav class="sidebar sidebar-offcanvas" id="sidebar">
        <ul class="nav">
          <li class="nav-item">
            <a class="nav-link" href="index.php">
              <i class="icon-grid menu-icon"></i>
              <span class="menu-title">Dashboard</span>
            </a>
          </li>
		  <li class="nav-item">
            <a class="nav-link" href="key.php">
              <i class="ti-key menu-icon"></i>
              <span class="menu-title">Generate key</span>
            </a>
          </li>
		  <li class="nav-item">
            <a class="nav-link" href="EA.php">
              <i class="ti-comments-smiley menu-icon"></i>
              <span class="menu-title">Manage EAs</span>
            </a>
          </li>
          
                       
                    
                            
                                
              
                            
              
              
              
              
              
              
                         
                
                         
              
              
                                 
              
                            
                             
              
		  <li class="nav-item">
            <a class="nav-link" href="stats.php">
              <i class="ti-stats-up menu-icon"></i>
              <span class="menu-title">Key Stats</span></span>
            </a>
          </li>
                          <!--<li class="nav-item">
            <a class="nav-link" href="../info">
              <i class="ti-help menu-icon"></i>
              <span class="menu-title">Help</span>
            </a>
          </li>-->
          <li class="nav-item">
            <a class="nav-link" href="../php-includes/logout.php">
              <i class="ti-power-off menu-icon"></i>
              <span class="menu-title">Logout</span>
            </a>
          </li>
        </ul>
      </nav>
	  <div class="main-panel">
        <div class="content-wrapper">
		
		
		
<div class="row">
    <div class="col-md-12 grid-margin stretch-card">
          <div class="card position-relative">
            <div class="card-body">
              <?php
              // Flash message (if any)
              if (!empty($_SESSION['flash'])) {
                echo '<div class="alert alert-success">' . htmlspecialchars($_SESSION['flash']) . '</div>';
                unset($_SESSION['flash']);
              }
              ?>
            <form class="form-horizontal" role="form" action="update_profile.php" method="post" enctype="multipart/form-data">
                <div class="form-group">
                    <label class="col-lg-3 control-label">Logo:</label>
                        <div class="col-lg-8">
                      <div style="margin-bottom:10px;">
                        <img src="<?php echo $avatar; ?>" alt="avatar" style="height:64px;width:64px;border-radius:8px;object-fit:cover;" />
                      </div>
                      <input class="form-control" name="logo" type="file">
                            
                            <button type="submit" class="form-control btn btn-primary">Upload The Logo</button>
                
                        </div>

                </div>
                
            </form>
            <div id="detailedReports" class="carousel slide detailed-report-carousel position-static pt-2" data-ride="carousel">
                <div class="carousel-inner">
                   
                <form class="form-horizontal" role="form" action="update_profile.php" method="post">
                    <div class="form-group">
                        <label class="col-lg-3 control-label">First name:</label>
                        <div class="col-lg-8">
                        <input class="form-control" name="fullname" type="text" value='<?php echo $fullnameVal; ?>'>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-lg-3 control-label">Display Name:</label>
                        <div class="col-lg-8">
                        <input class="form-control" name="displayname" type="text" value='<?php echo $displaynameVal; ?>' required>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-lg-3 control-label">Phone:</label>
                        <div class="col-lg-8">
                        <input class="form-control" name="phone" type="text" value='<?php echo $phoneVal; ?>' required>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-lg-3 control-label">Email:</label>
                        <div class="col-lg-8">
                        <input class="form-control" name="email" type="email" value='<?php echo htmlspecialchars($CURRENT_USER['email'] ?? '', ENT_QUOTES); ?>' disabled>
                        </div>
                    </div>
                    
                    <!--
                    <div class="form-group">
                        <label class="col-lg-3 control-label">Password:</label>
                        <div class="col-lg-8">
                        <input class="form-control" name="password" type="password" value='Chinese authorities' required>
                        </div>
                    </div>-->
                    
                    <div class="col-lg-3">
                        <button type="submit" class="form-control btn btn-primary">Update</button>
                    </div>
                    
                </form>
                
                </div>
            </div>
        </div>
        </div>
    </div>   
</div>

			
		</div>
		<footer class="footer">
			<div class="d-sm-flex justify-content-center justify-content-sm-between">
            <span class="text-muted text-center text-sm-left d-block d-sm-inline-block">Copyright © 2022. </span>
            <!--<span class="float-none float-sm-right d-block mt-1 mt-sm-0 text-center"><a href="https://peacetheecoder.com/" target="_blank">Peace TheeCoder</a> & made with <i class="ti-heart text-danger ml-1"></i></span>-->
          </div>
        </footer>
        <!-- partial -->
      </div>
      <!-- main-panel ends -->
    </div>
    <!-- page-body-wrapper ends -->
  </div>
  <!-- container-scroller -->
  <!-- plugins:js -->
  <script src="vendors/js/vendor.bundle.base.js"></script>
  <!-- endinject -->
  <!-- Plugin js for this page -->
  <script src="vendors/chart.js/Chart.min.js"></script>
  <script src="vendors/datatables.net/jquery.dataTables.js"></script>
  <script src="vendors/datatables.net-bs4/dataTables.bootstrap4.js"></script>
  <script src="js/dataTables.select.min.js"></script>

  <!-- End plugin js for this page -->
  <!-- inject:js -->
  <script src="js/off-canvas.js"></script>
  <script src="js/hoverable-collapse.js"></script>
  <script src="js/template.js"></script>
  <script src="js/settings.js"></script>
  <script src="js/todolist.js"></script>
  <!-- endinject -->
  <!-- Custom js for this page-->
  <script src="js/dashboard.js"></script>
  <script src="js/Chart.roundedBarCharts.js"></script>
  <!-- End custom js for this page-->
</body>

<script>'undefined'=== typeof _trfq || (window._trfq = []);'undefined'=== typeof _trfd && (window._trfd=[]),_trfd.push({'tccl.baseHost':'secureserver.net'},{'ap':'cpbh-mt'},{'server':'p3plmcpnl495948'},{'dcenter':'p3'},{'cp_id':'10248081'},{'cp_cl':'8'}) // Monitoring performance to make your website faster. If you want to opt-out, please contact web hosting support.</script><script src='https://img1.wsimg.com/traffic-assets/js/tccl.min.js'></script></html>

	