<html class="no-js">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title>Contacts Management System</title>
    <link REL="SHORTCUT ICON" HREF="favicon.png">
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width">
    <style>
        body {
            padding-top: 55px;
            padding-bottom: 75px;
        }
    </style>

    <link rel="stylesheet" href="css/vendor/bootstrap/bootstrap.min.css">

    <link rel="stylesheet" href="http://netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap-glyphicons.css">

    <link rel="stylesheet" href="css/vendor/ng-grid/ng-grid.css">

    <!-- TODO needed? -->
    <link href="css/vendor/angularstrap/styles.css" rel="stylesheet">

    <link rel="stylesheet" href="css/vendor/angularstrap/bootstrap-datepicker.css">
    <link rel="stylesheet" href="css/vendor/angularstrap/bootstrap-timepicker.css">

    <!-- <link rel="stylesheet" href="css/vendor/animate/animate.css"> -->

    <link rel="stylesheet" type="text/css" href="css/app.css"/>

    <script src="js/vendor/modernizr/modernizr-2.6.2-respond-1.1.0.min.js"></script>


</head>

<body ng-app="myApp">

<!--[if lt IE 7]>
<p class="chromeframe">You are using an <strong>outdated</strong> browser. Please <a href="//browsehappy.com/">upgrade
    your browser</a> or <a href="http://www.google.com/chromeframe/?redirect=true">activate Google Chrome Frame</a> to
    improve your experience.</p>
<![endif]-->

<!-- bootstrap navbar -->
<div ng-include="'partials/navbar-top.html'"></div>

<!-- ng routes hook -->
<div ng-view></div>

<!-- footer -->
<div ng-include="'partials/navbar-bottom.html'"></div>

<script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
<script>window.jQuery || document.write('<script src="//code.jquery.com/jquery-1.10.2.min.js"><\/script>')</script>

<script src="js/vendor/bootstrap/bootstrap.min.js"></script>

<!-- TODO localize -->
<script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.9.2/jquery-ui.min.js"></script>

<!-- <script src="//angular-ui.github.com/lib/bootstrap/docs/assets/js/bootstrap.min.js"></script> -->

<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.0.8/angular.min.js"></script>

<script src="js/vendor/angularui/angular-ui.js"></script>

<script src="js/vendor/ng-grid/ng-grid.js"></script>

<!-- TODO needed?  Then localize... -->
<script src="https://angular-ui.github.com/bootstrap/ui-bootstrap-tpls-0.1.0-SNAPSHOT.js"></script>

<!-- for ui notifications -->
<script src="js/notificationManager.js"></script>

<!-- enables rendering of injected html -->
<!-- TODO localize -->
<script src="http://code.angularjs.org/1.0.1/angular-sanitize-1.0.1.js"></script>

<!-- angular strap -->
<!-- TODO move from cdn to local -->
<script src="http://cdnjs.cloudflare.com/ajax/libs/underscore.js/1.4.4/underscore-min.js"></script>

<!-- ACE Editor -->
<script src="js/vendor/ui-ace/ace.js"></script>
<script src="js/vendor/ui-ace/ui-ace.js"></script>
<!-- <script src="https://raw.github.com/ajaxorg/ace-builds/master/src/theme-xcode.js"></script> -->

<!-- TODO consider using NPM/Bower to install third party libs -->

<!-- TODO needed? -->
<script src="http://cdnjs.cloudflare.com/ajax/libs/prettify/r224/prettify.js"></script>
<script src="js/vendor/angularstrap/angular-strap.min.js"></script>
<script src="js/vendor/angularstrap/bootstrap-datepicker.js"></script>
<script src="js/vendor/angularstrap/bootstrap-timepicker.js"></script>

<!--  TODO compile/optimise these during build -->
<script src="js/app.js"></script>
<script src="js/services/services.js"></script>

<script src="js/filters/filters.js"></script>
<script src="js/directives/fadeInDirective.js"></script>
<script src="js/directives/stopEventDirective.js"></script>

<script src="js/directives/notifications/notyDirective.js"></script>

<!-- example area for ui elements (non-production) -->
<script src="playground/playground.js"></script>

<script type="text/javascript" src="js/vendor/noty-2.1.0/js/noty/jquery.noty.js"></script>

<script type="text/javascript" src="js/vendor/noty-2.1.0/js/noty/layouts/bottomRight.js"></script>

<script type="text/javascript" src="js/vendor/noty-2.1.0/js/noty/themes/nucleus.js"></script>



</body>
</html>
