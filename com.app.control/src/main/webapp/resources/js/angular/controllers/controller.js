var app = angular.module('myApp',[]);

app.controller('myCtrl', function($scope, $http){ 
	
	
	$scope.messages = [];
	$scope.userRequest = '';
	
	$scope.sendMessage = function(){
		//console.log($scope.userRequest);
    	var userMessage = {
    		'role': 'user:',
    		'message': $scope.userRequest
    	}
		$scope.messages.push(userMessage);
		$http.get('books/',{headers: { 'Content-Transfer-Encoding': 'utf-8' , 'key': $scope.userRequest}})
	    .success(function(data){
	    	
	    	$scope.messages.push(data);
	    	$scope.userRequest='';
	    
	    });
	};
	
});
