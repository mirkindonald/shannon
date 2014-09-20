<%@page import="com.shannon.bean.TimesheetBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.*"%>
<%@page import="com.shannon.model.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Daily Timesheet</title>
</head>
<body onload="init()" style="overflow: none">
	<div id='headerDiv'><jsp:include page="header.jsp"></jsp:include></div>
	<table style="width: 100%">
		<tr>
			<td valign="top" class=menuBackgrnd><jsp:include page="menu.jsp"></jsp:include></td>
			<td><div class=searchArea>
					<form method=post id='assignForm' name='assignForm' action=''><table id='headerTable' width="100%" border="0">
						<tr>
							<td colspan="8">Date: ${todaysDate}
						</tr>
						<tr>
							<td>Labour :</td>
							<td colspan="2"><select id=employeeId name=employeeId style="width: 100%">
									<option value="none">-Select-</option>
									<%
										{
											Iterable<Labour> labourItr = (Iterable<Labour>) request.getAttribute("labourItr");
											Iterator<Labour> iterator = labourItr.iterator();
											while (iterator.hasNext()) {
												Labour labour = iterator.next();
									%>
									<option value="<%=labour.getEmployeeId()%>"><%=labour.getFirstName()%></option>
									<%
										}
										}
									%>
							</select></td>
							<td>Project Code:</td>
							<td><select id=projectCodeId name=projectCodeId style="width: 100%"><option
										value="none">-Select-</option>
									<%
										{
																	Iterable<ProjectCode> projectCodeItr = (Iterable<ProjectCode>) request.getAttribute("projectCodeItr");
																	Iterator<ProjectCode> iterator = projectCodeItr.iterator();
																	while (iterator.hasNext()) {
																		ProjectCode projectCode = iterator.next();
									%>
									<option value="<%=projectCode.getProjectCodeId()%>"><%=projectCode.getProjectCodeDescription()%></option>
									<%
										}}
									%>
							</select>
							<td>Project No:</td>
							<td><select id='projectId' name='projectId' style="width: 100%"><option
										value="none">-Select-</option>
									<%
										{
																	Iterable<ProjectNumber> projectItr = (Iterable<ProjectNumber>) request.getAttribute("projectItr");
																	Iterator<ProjectNumber> iterator = projectItr.iterator();
																	while (iterator.hasNext()) {
																		ProjectNumber project= iterator.next();
									%>
									<option value="<%=project.getId().getProjectCode()%>"><%=project.getId().getProjectCode() %></option>
									<%
										}}
									%>
							</select></td>
							<td><input type="button" onclick="checkAndSubmit()" class='buttons' value="Assign Job" /></td>
							<td>&nbsp;</td>
						</tr>
						<tr>
							<td colspan="5" style="padding-bottom: 20px"></td>
						</tr>
						<tr class='tableHead'>
							<td style="width: 5%; font-weight: bold;">Sl. No.</td>
							<td style="width: 15%; font-weight: bold;">Employee Name</td>
							<td style="width: 15%; font-weight: bold;">Job Id</td>
							<td style="width: 15%; font-weight: bold;">Time In</td>
							<td style="width: 15%; font-weight: bold;">Time Out</td>
							<td style="width: 15%; font-weight: bold;">Break Hr</td>
							<td style="width: 15%; font-weight: bold;">O.T Hrs</td>
							<td></td>
						</tr>
					</table></form>
				</div>
				<form name='timesheetForm' id='timesheetForm' method='post' >
				<input type=hidden id='employeeIdHidden' name='employeeIdHidden' >
				<div style="overflow: auto;" id='timeSheetArea'>
					<table width="100%" border="0">
						<%{
							List<TimesheetBean> timeSheetItr = (List<TimesheetBean>) request.getAttribute("timeSheetBean");
							System.out.println(timeSheetItr.size());
							for(int i=0;i<timeSheetItr.size();i++){
								TimesheetBean timesheetBean= timeSheetItr.get(i);
						%>
						<tr>
							<td style="width: 5%"><label><%=(i+1)%></label></td>
							<td style="width: 15%"><label><%=timesheetBean.getEmployeeName() %></label></td>
							<td style="width: 15%"><label><%=timesheetBean.getJobId() %></label></td>
							<td style="width: 15%"><input type="text" value="<%=timesheetBean.getTimeInHr() %>" 
								style="width: 30px" /> <input value="<%=timesheetBean.getTimeInMin() %>" type="text" style="width: 30px" /></td>
							<td style="width: 15%"><input name='timeOutHr_<%=timesheetBean.getEmployeeId() %>' type="text" value="<%=timesheetBean.getTimeOutHr() %>"
								style="width: 30px" /> <input name='timeOutMin_<%=timesheetBean.getEmployeeId() %>' type="text"value="<%=timesheetBean.getTimeOutMin() %>" style="width: 30px" />
								<select><option>AM</option></select></td>
							<td style="width: 15%"><input name='breakHr_<%=timesheetBean.getEmployeeId() %>' type="text" value="<%=timesheetBean.getBreakHrs() %>"
								style="width: 50px" /></td>
							<td style="width: 15%"><input name='overTimeHr_<%=timesheetBean.getEmployeeId() %>' type="text" value="<%=timesheetBean.getOverTimeHrs() %>"
								style="width: 50px" /></td>
							<td style="width: 15%"><input class='buttons' type="button"
								onclick="updateTimesheet('<%=timesheetBean.getEmployeeId() %>')" value="Save" /></td>
						</tr>
						<tr>
							<td colspan="8"><hr /></td>
						</tr>
						<%}
							}
						%>
					</table>
				</div></form></td>
		</tr>
	</table>
</body>
<script type="text/javascript">
function checkAndSubmit(){
	if($("#employeeId").val()+""=="none"){
		info("sss");
		focusTips('employeeId','assignForm',' Please select the employee! ');
		return;
	}
	if($("#projectCodeId").val()+""=="none"){
		focusTips('projectCodeId','assignForm',' Please select the projectCode! ');
		return;
	}
	if($("#projectId").val()+""=="none"){
		focusTips('projectId','assignForm',' Please select the Job/Project! ');
		return;
	}
	document.assignForm.action='addDailyEmpInTime';
	document.assignForm.submit();
}

function updateTimesheet(id){
	$("#employeeIdHidden").val(id);
	document.timesheetForm.action='updateTimesheet';
	document.timesheetForm.submit();
}
</script>
</html>

