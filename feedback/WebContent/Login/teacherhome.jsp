<!DOCTYPE html>
<%
String name;
name=request.getParameter("username");
%>
<html>
<title>Student Feedback</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" type="text/css" href="../css/index.css">
<body class="w3-content" style="max-width:2000px">

<!-- First Grid: Logo & About -->
<div class="w3-row">
  <div class="w3-half w3-black w3-container w3-center" style="height:700px">
    <div class="w3-padding-64">
      <h1>Teacher Home</h1>
    </div>
    <div class="w3-padding-64">
      <a href="Login/teacherreport2.jsp?name='"+name+"'" class="w3-button w3-black w3-block w3-hover-blue-grey w3-padding-16">Generate Report</a>
      <a href="Login/changeteacehrpassword.jsp?t=0" class="w3-button w3-black w3-block w3-hover-teal w3-padding-16">Change Password</a> 
  </div >
  </div>
  
      <image src="..\images\asas.jpg" width="650px" height="700px"/>
    
</div>


</body>
</html>
