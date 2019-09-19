<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link href="css/bootstrap-4.3.1.min.css" rel="stylesheet">
<link href="css/jquery.json-view.min.css" rel="stylesheet">

<title>VMC Explorer</title>
</head>
<body>
	<nav class="navbar navbar-expand-md navbar-dark bg-dark fixed-top">
		<a class="navbar-brand" href="#">VMC Explorer</a>
	</nav>

	<main role="main" class="container">	
		<div class="mb-3"><h1>VMCE</h1></div>
	
		<div class="input-group mb-3">
			<div class="input-group-prepend">
				<span class="input-group-text" id="basic-addon1">Refresh Token:</span>
			</div>
			<input type="text" class="form-control" placeholder="refresh_token" id="refreshToken">
		</div>
	
		<div class="input-group mb-3">
		  <div class="input-group-prepend">
		    <button class="btn btn-primary" type="button" id="doIt">doIt!</button>
		  </div>
		  <span class="form-control" aria-label="" aria-describedby="basic-addon1">List Orgs (https://vmc.vmware.com/vmc/api/orgs)</span>
		</div>
	
		<div class="mb-3 w-100" id="result">
		</div>
	</main>		

	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="js/jquery-3.3.1.min.js"></script>
	<script src="js/popper-1.14.7.min.js"></script>
	<script src="js/bootstrap-4.3.1.min.js"></script>
	<script src="js/jquery.json-view.min.js"></script>
	<script>
    	$(document).ready(function() {
    		var resultDiv = $("#result");
    		var refreshTokenDiv = $("#refreshToken");
    		
    		$('#doIt').click(function(){
    			resultDiv.empty().append("Fetching...");
				var refreshTokenVal = refreshTokenDiv.val();
				$.ajax({
					url:"orgs/doit", 
					type:"POST",
					data: JSON.stringify({'refreshToken':refreshTokenVal,'accessToken':""}), 
					dataType: "json",
					contentType:"application/json; charset=utf-8",
					success: function(data) {
						resultDiv.empty();
						resultDiv.jsonView(data);
					}
				});
			});
		});
	</script>
</body>
</html>
