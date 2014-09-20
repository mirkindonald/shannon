<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<style type="text/css">
.spaceUnder {
	padding-bottom: 10px;
	padding-top: 10px;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Labour Master</title>
</head>
<body onload="init()">
	<div id='headerDiv'><jsp:include page="header.jsp"></jsp:include></div>
	<div id=headerTable></div>
	<table border="0" width="100%">
		<tr>
			<td width="10%" valign="top" class=menuBackgrnd><jsp:include
					page="menu.jsp"></jsp:include></td>
			<td width="90%"><div id=timeSheetArea>
					<table width="100%" border="0">
						<tr>
							<td><div class=searchArea>
									<table>
										<tr>
											<td colspan="2"
												style='padding-bottom: 30px; padding-top: 30px;'><img
												src="images/profile.png" style='width: 25px' /> <label>Profile
													Details</label></td>
											<td>&nbsp;</td>
											<td>&nbsp;</td>
										</tr>
									</table>
								</div>
								<table width="100%" border="0" style="background-color: #F5F5F7">
									<tr>
										<td align="right" class="spaceUnder">Labour Id:</td>
										<td><input type="text" id="labourId" name="labourId" /></td>
										<td align="right">Title:</td>
										<td><select name="title">
												<option>Mr.</option>
												<option>Miss</option>
												<option>Mrs.</option>
										</select></td>
									</tr>
									<tr>
										<td align="right" class="spaceUnder">First Name:</td>
										<td><input type="text" id="firstName" name="firstName" /></td>
										<td align="right">Gender:</td>
										<td><select name="gender">
												<option>Male</option>
												<option>Female</option>
										</select></td>
									</tr>
									<tr>
										<td align="right" class="spaceUnder">Middle Name:</td>
										<td><input type="text" id="middleName" name="middleName" /></td>
										<td align="right">Marital status:</td>
										<td><select name="status">
												<option value="S">Single</option>
												<option value="M">Married</option>
												<option value="D">Divorced</option>
										</select></td>
									</tr>
									<tr>
										<td align="right" class="spaceUnder">Last Name:</td>
										<td><input type="text" id="lastName" name="lastName" /></td>
										<td align="right">Nationality</td>
										<td><input name="nationality" type="text" /></td>
									</tr>
									<tr>
										<td align="right" class="spaceUnder">Father Name:</td>
										<td><input type="text" id="fatherName" name="fatherName" /></td>
										<td align="right">Religion</td>
										<td><select name="status">
												<option value="M">Muslim</option>
												<option value="C">Christian</option>
												<option value="H">Hindu</option>
										</select></td>
									</tr>
									<tr>
										<td align="right" class="spaceUnder">DOB:</td>
										<td><input type="text" id="dob" name="dob" /></td>
										<td align="right">Designation</td>
										<td><input name="designation" type="text" /></td>
									</tr>
									<tr>
										<td align="right" class="spaceUnder">Date of Joining:</td>
										<td><input type="text" id="doj" name="doj" /></td>
										<td align="right">Blood Group</td>
										<td><input name="bg" type="text" /></td>
									</tr>
									<tr>
										<td align="right" class="spaceUnder">Mobile:</td>
										<td><input type="text" id="mobile" name="mobile" /></td>
										<td align="right">Country</td>
										<td><input name="country" type="text" /></td>
									</tr>
									<tr>
										<td align="right" class="spaceUnder">Postal Code:</td>
										<td><input type="text" id="postal" name="postal" /></td>
										<td>&nbsp;</td>
										<td>&nbsp;</td>
									</tr>
									<tr>
										<td align="right" class="spaceUnder">Address:</td>
										<td><textarea></textarea></td>
										<td>&nbsp;</td>
										<td>&nbsp;</td>
									</tr>
									<tr>
										<td colspan="4" align="center"><input class='buttons'
											type="button" value="Save" /></td>
									</tr>
								</table>
						</td>
						</tr>
					</table>
				</div></td>
		</tr>
	</table>
</body>
</html>