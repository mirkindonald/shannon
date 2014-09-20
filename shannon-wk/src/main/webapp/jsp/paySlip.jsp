<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="js/plugin/jquery.js"></script>
<title>Pay Slip</title>
<style type="text/css">
h3, h2 {
	margin: 0px;
}
</style>
</head>
<body onload="init()" style="overflow: none">
	<div id='headerDiv'><jsp:include page="header.jsp"></jsp:include></div>
	<table style="width: 100%" border=0>
		<tr>
			<td valign="top" style="width: 15%" class=menuBackgrnd ><jsp:include page="menu.jsp"></jsp:include></td>
			<td style="width: 85%"><div class=searchArea id=headerTable style="padding-top: 20px;padding-bottom: 20px"><table id='headerTable' width="100%"
					border="0">
					<tr>
						<td>Labour :</td>
						<td colspan="2"><select style="width: 100%"><option
									value="none">-Select-</option></select></td>
						<td><input type="button" class='buttons' value="Generate PaySlip" /></td>
						<td>&nbsp;</td>
					</tr>
				</table></div>
				<div style="overflow: auto;background-color: white" id='timeSheetArea'>
					<div align="center">
						<h2>SHANNON CARPENTRY AND DECORATION CO.</h2>
						<h3>P.O.BOX:14839, TEL: 44600856, DOHA-QATAR</h3>
					</div>
					<table style="width: 100%">
						<tr>
							<td align="left">Name</td>
							<td style="font-weight: bold;">: SALEM BUHYAN</td>
							<td style="font-weight: bold;">Employee ID:</td>
							<td>B-0367</td>
						</tr>
						<tr>
							<td align="left">Trade</td>
							<td>: P/ FOREMAN</td>
							<td style="font-weight: bold;">Month:</td>
							<td>JUNE 2014</td>
						</tr>
						<tr>
							<td align="left">Basic</td>
							<td>: QR 2000</td>
							<td style="font-weight: bold;">Allowance:</td>
							<td></td>
						</tr>
					</table>
					<table width="100%" border=1>
						<tr>
							<td style="width: 16%" align="left">Date</td>
							<%
								for (int i = 0; i < 12; i++) {
							%>
							<td style="width: 7%" align="center"><%=i + 1%></td>
							<%
								}
							%>
						</tr>
						<tr>
							<td align="left">Normal</td>
							<%
								for (int i = 0; i < 12; i++) {
							%>
							<td style="width: 7%" align="center">P</td>
							<%
								}
							%>
						</tr>
					</table>

					<br /> <br /> <br />
					<table style="width: 100%">
						<tr>
							<td valign="top" style="width: 50%"><table
									style="width: 100%" frame="border">
									<tr>
										<td>Total Days Worked</td>
										<td>:30</td>
										<td>Amount</td>
										<td>: QR 3000</td>
									</tr>
									<tr>
										<td>Total Normal O.T.</td>
										<td>:30</td>
										<td>Amount</td>
										<td>: QR 3000</td>
									</tr>
									<tr>
										<td>Total Friday O.T.</td>
										<td>:30</td>
										<td>Amount</td>
										<td>: QR 3000</td>
									</tr>
									<tr>
										<td>Total Special O.T.</td>
										<td>:30</td>
										<td>Amount</td>
										<td>: QR 3000</td>
									</tr>
									<tr>
										<td>Other Allowances</td>
										<td>:30</td>
										<td>Amount</td>
										<td>: QR 3000</td>
									</tr>
									<tr>
										<td>Deductions</td>
										<td>:30</td>
										<td>Amount</td>
										<td>: QR 3000</td>
									</tr>
									<tr>
										<td colspan="4">s</td>
									</tr>
								</table></td>
							<td valign="top" style="width: 50%"><table
									style="width: 100%" frame="border">
									<tr>
										<td>Food Allowance</td>
										<td>:</td>
									</tr>
									<tr>
										<td>Living Allowance</td>
										<td>:</td>
									</tr>
									<tr>
										<td>House Allowance</td>
										<td>:</td>
									</tr>
									<tr>
										<td>Overtime Allowance</td>
										<td>:</td>
									</tr>
									<tr>
										<td>Car Allowance</td>
										<td>:</td>
									</tr>
									<tr>
										<td>Tel Allowance</td>
										<td>:</td>
									</tr>
									<tr>
										<td style="font-weight: bold;">Total Allowance</td>
										<td>:</td>
									</tr>
								</table></td>
						</tr>
					</table>
				</div></td>
		</tr>
	</table>
</body>
<script type="text/javascript">
	function init() {
		var ht = $("#headerDiv").height();
		ht = ht + $("#headerTable").height();
		$("#timeSheetArea").height($(window).height() - ht - 30);
	}
</script>
</html>
