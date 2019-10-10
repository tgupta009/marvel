<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %>
<html lang="en">

<head>
<meta charset="UTF-8">
<script type="text/javascript">
window.onload = function() {

var options = {
	title: {
		text: "User Consumption"
	},
	data: [{
			type: "pie",
			startAngle: 45,
			showInLegend: "true",
			legendText: "{label}",
			indexLabel: "{label} ({y})",
			yValueFormatString:"#,##0.#"%"",
			dataPoints: [
				{ label: "Internal", y: 1	 },
				{ label: "Fuel", y: 1 },
				{ label: "GreenTxn", y: 1 },
				{ label: "Food", y: 1 }
			]
	}]
};
$("#chartContainer").CanvasJSChart(options);

}

if($("#isActivateGreenInitiative").is(':checked'))
    $("#activateGreenInitiativeDiv")=true;  // checked
else
    $("#activateGreenInitiativeDiv")=false;  // unchecked


</script>
</head>


<body>
<script type="text/javascript" src="https://canvasjs.com/assets/script/jquery-1.11.1.min.js"></script>
<script type="text/javascript" src="https://canvasjs.com/assets/script/jquery.canvasjs.min.js"></script>
<div>
<div>
<h1>Welcome to go green initiative</h1>
<h2>Hello, ${message}</h2>

Click <strong><input type="checkbox" id="isActivateGreenInitiative"/>here</a></strong> for opting go green
<div id="activateGreenInitiativeDiv"></div>


Click <strong><a href="activateGreenInitiative" onclick="isGoGreenEnable();">here</a></strong> for opting go green


<div id="chartContainer" style="height: 200px; width: 50%;"></div>

</br>
Click <strong><a href="/welcome">here</a></strong> to visit previous page.
</div>
</div>
</body>
</html>
