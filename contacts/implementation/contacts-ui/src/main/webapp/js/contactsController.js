myApp.controller("contactsController", function($rootScope,RESTService) {
	/* $rootScope.restService = RESTService;
     $rootScope.contacts = [];
	 $rootScope.restService.getData('http://localhost:8080/cms/contacts/v1/readall',$rootScope.contacts);
	 console.log( "Contacts :"  + $rootScope.contacts);
	 var contacts = JSON.stringify($rootScope.contacts);
	 console.log("Stringified Data" +  contacts);*/
	 
	 $('#table').bootstrapTable({
		 	url :'http://localhost:8080/cms/contacts/v1/readall',
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
	       }]
		}); 	
});