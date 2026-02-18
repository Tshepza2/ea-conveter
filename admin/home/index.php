<?php require_once __DIR__ . '/../php-includes/auth.php'; ?>
<?php require_once __DIR__ . '/../php-includes/userdata.php'; ?>
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
		
		
		
      <!-- partial -->
          <div class="row">
            <div class="col-md-12 grid-margin">
              <div class="row">
                <div class="col-12 col-xl-8 mb-4 mb-xl-0">
                                   
                                 
                                  
              
                                  
                    
                    
                    
                
                  <h6 class="font-weight-normal mb-0">All systems are running smoothly! You have <span class="text-primary">3 active licences. Your Mentor id is -> 203</span></h6>
                </div>
                <div class="col-12 col-xl-4">
                 <div class="justify-content-end d-flex">
                  <div class="dropdown flex-md-grow-1 flex-xl-grow-0">
                    <button class="btn btn-sm btn-light bg-white dropdown-toggle" type="button" id="dropdownMenuDate2" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
                     <i class="mdi mdi-calendar"></i> Today ( 24-Apr-2025 )
                    </button>
                    
                  </div>
                 </div>
                </div>
              </div>
            </div>
          </div>
          <div class="row">
            <div class="col-md-6 grid-margin stretch-card">
              <div class="card " style="background-color:#F5F7FF;">
                <!--<div class="card-people ">
                  <img src="images/dashboard/wewe.jpg" alt="people">
                  <div class="weather-info">
                    <div class="d-flex">
                      <div>
                        <h2 class="mb-0 font-weight-normal"><i class="icon-key mr-2"></i>Hello<sup>-</sup></h2>
                      </div>
                      <div class="ml-2">
                        <h4 class="location font-weight-normal"></h4>
                        <h6 class="font-weight-normal">Signal System</h6>
                      </div>
                    </div>
                  </div>
                </div>-->
              </div>
            </div>
            <div class="col-md-6 grid-margin transparent">
              <div class="row">
                <div class="col-md-6 mb-4 stretch-card transparent">
                  <div class="card card-tale">
                    <div class="card-body">
                      <p class="mb-4">Total Licences</p>
                      <p class="fs-30 mb-2">3</p>
                      <p>All time EA users.</p>
                    </div>
                  </div>
                </div>
               
                <div class="col-md-6 mb-4 stretch-card transparent">
                  <div class="card card-dark-green">
                    <div class="card-body">
                      <p class="mb-4">Active Subcriptions</p>
                                             <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">0                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2">                     <p class="fs-30 mb-2"></p>
                      <p>Current Active EA Users.</p>
                    </div>
                  </div>
                </div>
              </div>
              <div class="row">
                <div class="col-md-6 mb-4 mb-lg-0 stretch-card transparent">
                  <div class="card card-light-blue">
                    <div class="card-body">
                      <p class="mb-4">Total EAs</p>
                      <p class="fs-30 mb-2">1</p>
                      <p>All EAs you are Licencing</p>
                    </div>
                  </div>
                </div>
                <div class="col-md-6 stretch-card transparent">
                  <div class="card card-light-danger">
                    <div class="card-body">
                      <p class="mb-4">Maximum Licences</p>
                      <p class="fs-30 mb-2">500</p>
                      <p>Total licences You can generate</p>
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

	
        