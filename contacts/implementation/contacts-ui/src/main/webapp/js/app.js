	var filters = angular.module('myApp.filters', []);
var directives = angular.module('myApp.directives', []);

var myApp = angular.module('myApp',
    [   'myApp.filters',
        'myApp.directives',
        'ngRoute'
       
    ]);




myApp.config(['$routeProvider', '$locationProvider', '$httpProvider', function ($routeProvider, $locationProvider, $httpProvider) {

    // TODO use html5 *no hash) where possible
    // $locationProvider.html5Mode(true);

    $routeProvider.when('/', {
        templateUrl:'./partials/home.html'
    });
    
    $routeProvider.when('/home', {
        templateUrl:'./partials/home.html'
    });

    $routeProvider.when('/contact', {
        templateUrl:'./partials/contact.html'
    });
    $routeProvider.when('/about', {
        templateUrl:'./partials/about.html'
    });
    $routeProvider.when('/faq', {
        templateUrl:'./partials/faq.html'
    });

   /* // note that to minimize playground impact on app.js, we
    // are including just this simple route with a parameterized 
    // partial value (see playground.js and playground.html)
    $routeProvider.when('/playground/:widgetName', {
        templateUrl:'playground/playground.html',
        controller:'PlaygroundCtrl'
    });
*/
    // by default, redirect to site root
    $routeProvider.otherwise({
        redirectTo:'./partials/about.html'
    });

}]);


myApp.run(function ($rootScope, $location, $http, $timeout, AuthService, RESTService) {

   /* $rootScope.restService = RESTService;

    $rootScope.contacts = [];
    $rootScope.restService.getData('http://localhost:8080/cms/contacts/v1/readall',$rootScope.contacts);*/
    
    /*function (data) {
        $rootScope.contacts = data;
        $('#table').bootstrapTable({
		    columns: [{
		        field: 'contact_name',
		        title: 'Contact Name'
		    },{
		        field: 'first_name',
		        title: 'Name'
		    },{
		        field: 'contact_num',
		        title: 'Contact Number'
		    },{
		        field:'email',
		        title:'Email Address'
	       }],
		 data:$rootScope.contacts;
		}); 	
    }*/

    $rootScope.authService = AuthService;

    $rootScope.loginInput = 'user@gmail.com';
    $rootScope.passwordInput = 'complexpassword';

    $rootScope.$watch('authService.authorized()', function () {

        // if never logged in, do nothing (otherwise bookmarks fail)
        if ($rootScope.authService.initialState()) {
            // we are public browsing
            return;
        }

        // instantiate and initialize an auth notification manager
        $rootScope.authNotifier = new NotificationManager($rootScope);

        // when user logs in, redirect to home
        if ($rootScope.authService.authorized()) {
            $location.path("/");
            $rootScope.authNotifier.notify('information', 'Welcome ' + $rootScope.authService.currentUser() + "!");
        }

        // when user logs out, redirect to home
        if (!$rootScope.authService.authorized()) {
            $location.path("/");
            $rootScope.authNotifier.notify('information', 'Thanks for visiting.  You have been signed out.');
        }

    }, true);

    // TODO move this out to a more appropriate place
    $rootScope.faq = [
        {key: "What is Angular-Enterprise-Seed?", value: "A starting point for server-agnostic, REST based or static/mashup UI."},
        {key: "What are the pre-requisites for running the seed?", value: "Just an HTTP server.  Add your own backend."},
        {key: "How do I change styling (css)?", value:  "Change Bootstrap LESS and rebuild with the build.sh script.  This will update the appropriate css/image/font files."}
    ];


});