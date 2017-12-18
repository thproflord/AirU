<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="Dashboard">
    <meta name="keyword" content="Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">

    <title>AirUcab</title>

    <!-- Bootstrap core CSS -->
    <link href="assets/css/bootstrap.css" rel="stylesheet">
    <!--external css-->
    <link href="assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
        
    <!-- Custom styles for this template -->
    <link href="assets/css/style.css" rel="stylesheet">
    <link href="assets/css/style-responsive.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>

  <body>

  <section id="container" >
      <!-- **********************************************************************************************************************************************************
      TOP BAR CONTENT & NOTIFICATIONS
      *********************************************************************************************************************************************************** -->
      <!--header start-->
     <header class="header black-bg">
              <div class="sidebar-toggle-box">
                  <div class="fa fa-bars tooltips" data-placement="right" data-original-title="Colapsar"></div>
              </div>
            <!--logo start-->
            <a href="home" class="logo"><b>AirUcab</b></a>
            <!--logo end-->
			<div class="top-menu">
            		<ul class="nav pull-right top-menu">
                    <li><a class="logout" href="index.html">Salir</a></li>
            		</ul>
            </div>
        </header>
      <!--header end-->
      
      <!-- **********************************************************************************************************************************************************
      MAIN SIDEBAR MENU
      *********************************************************************************************************************************************************** -->
      <!--sidebar start-->
      <aside>
          <div id="sidebar"  class="nav-collapse ">
              <!-- sidebar menu start-->
              <ul class="sidebar-menu" id="nav-accordion">
              
              	  <p class="centered"><a href="profile.html"><img src="assets/img/ui-sam.jpg" class="img-circle" width="60"></a></p>
              	  <h5 class="centered">Marcel Newman</h5>
              	  	
                  <li class="mt">
                      <a href="usuarios">
                          <i class="fa fa-users"></i>
                          <span>Usuarios</span>
                      </a>
                  </li>

                  <li class="sub-menu">
                      <a href="sedes" >
                          <i class="fa fa-building"></i>
                          <span>Sedes</span>
                      </a>
                      
                  </li>

                  <li class="sub-menu">
                      <a href="inventario" >
                          <i class="fa fa-archive"></i>
                          <span>Inventario</span>
                      </a>
                      
                  </li>
                  <li class="sub-menu">
                      <a href="proveedores" >
                          <i class="fa fa-shopping-cart"></i>
                          <span>Proveedores</span>
                      </a>
                     
                  </li>
                  <li class="sub-menu">
                      <a  href="ordenes" >
                          <i class="fa fa-tasks"></i>
                          <span>Ordenes</span>
                      </a>
                      
                  </li>
                  <li class="sub-menu">
                      <a class="active" href="reportes" >
                          <i class="fa fa-book"></i>
                          <span>Reportes</span>
                      </a>
                    
                  </li>
                  <li class="sub-menu">
                      <a href="clientes" >
                          <i class=" fa fa-briefcase"></i>
                          <span>Cliente</span>
                      </a>
                     
                  </li>
                  <li class="sub-menu">
                      <a href="aviones" >
                          <i class=" fa fa-plane"></i>
                          <span>Aviones</span>
                      </a>
                     
                  </li>
                   <li class="sub-menu">
                      <a href="prueba" >
                          <i class="fa fa-archive"></i>
                          <span>Prueba</span>
                      </a>                     
                  </li>

              </ul>
              <!-- sidebar menu end-->
          </div>
      </aside>
      <!--sidebar end-->
      
      <!-- **********************************************************************************************************************************************************
      MAIN CONTENT
      *********************************************************************************************************************************************************** -->
      <!--main content start-->
      <section id="main-content">
          <section class="wrapper site-min-height">
          	<h3><i class="fa fa-angle-right"></i> Blank Page</h3>
          	<div class="row mt">
          		<div class="col-lg-12">
          		<p>Place your content here.</p>
          		</div>
          	</div>
			
		</section><! --/wrapper -->
      </section><!-- /MAIN CONTENT -->

      <!--main content end-->
      <!--footer start-->
      <footer class="site-footer">
          <div class="text-center">
              2014 - Alvarez.is
              <a href="blank.html#" class="go-top">
                  <i class="fa fa-angle-up"></i>
              </a>
          </div>
      </footer>
      <!--footer end-->
  </section>

    <!-- js placed at the end of the document so the pages load faster -->
    <script src="assets/js/jquery.js"></script>
    <script src="assets/js/bootstrap.min.js"></script>
    <script src="assets/js/jquery-ui-1.9.2.custom.min.js"></script>
    <script src="assets/js/jquery.ui.touch-punch.min.js"></script>
    <script class="include" type="text/javascript" src="assets/js/jquery.dcjqaccordion.2.7.js"></script>
    <script src="assets/js/jquery.scrollTo.min.js"></script>
    <script src="assets/js/jquery.nicescroll.js" type="text/javascript"></script>


    <!--common script for all pages-->
    <script src="assets/js/common-scripts.js"></script>

    <!--script for this page-->
    
  <script>
      //custom select box

      $(function(){
          $('select.styled').customSelect();
      });

  </script>

  </body>
</html>