<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html lang="en">

<style>
strong {
  h1 {
  color: #999999;
  font-family: arial, sans-serif;
  font-size: 16px;
  font-weight: bold;
  margin-top: 0px;
  margin-bottom: 1px;
  }
  h1 { margin-top: 0px; margin-bottom: 1px; }
}
</style>


<body>
	<div>
		<div style="text-align: left;">
			<h2>MyBank Application</h2>
			<h3>Hello ${custName}, Welcome to ${message}</h3> <h3>Login time: ${loginTime}</h3>
            Click <strong><a href="activateGreenInitiative">here</a></strong> to activate green initiative
            </br>
            </br>
			Click <strong><a href="viewTxnDtls">here</a></strong> to view transaction details
		</div>
	</div>
</body>
</html>
