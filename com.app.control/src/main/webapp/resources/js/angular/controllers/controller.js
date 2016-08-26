var app = angular.module('myApp',[]);

app.controller('myCtrl', function($scope, $http){ 
	$scope.messages = [];
	$scope.userRequest = '';
	
	$scope.sendMessage = function(userRequest){
		console.log("userrequest:"+userRequest);
		$http.get('books/',{headers: { 'Content-Transfer-Encoding': 'utf-8' , 'key': userRequest}})
	    .success(function(data){
	    	console.log(userRequest);
	    	
	    	var userMessage = {
	    		'role': 'user:',
	    		'message': userRequest
	    	}
	    	$scope.messages.push(userMessage);
	    	$scope.messages.push(data);
	    	//$scope.tab2TotalDocsItems = $scope.links.length;
	    });
	};
	
});
