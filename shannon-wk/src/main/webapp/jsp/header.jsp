<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<style type="text/css">
.header{
	height:80px;
	padding-left:30px;
	background: -webkit-linear-gradient(rgb(95, 173, 127), rgb(43, 82, 57)); /* For Safari 5.1 to 6.0 */
 	background: -o-linear-gradient(rgb(95, 173, 127),rgb(43, 82, 57)); /* For Opera 11.1 to 12.0 */
  	background: -moz-linear-gradient(rgb(95, 173, 127), rgb(43, 82, 57)); /* For Firefox 3.6 to 15 */
	background: linear-gradient(rgb(95, 173, 127), rgb(43, 82, 57)); /* Standard syntax */
}
</style>
<div class=header style="padding-bottom: 15px"><table style='width:100%'>
<tr>
	<td style="width:40%"><h1 style="color: white;padding-top: 25px;">Shannon Carpentry And Decorations</h1>	</td>
	<c:if test="${message != null}">
		<td style="width:60%">${message}</td>
	</c:if>
	
</table></div>