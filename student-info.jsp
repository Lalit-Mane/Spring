<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equi="Content-Type" cotent=text/html;charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div>
   <h1>Student Info</h1>
   <div style="Border: 1px solid blue;background-color:ellow;color:blue;">
   <%
   List<Student> students=(List<Student>)request.getAttribute("studentInfo");
   out.println("<table border=1<tr><th>Name</th><th>Department</th><th>Country</th><th>Delete</th></tr>");
   for(Student s:students){
	   out.println("<tr><td>"+s.getId()+"</td><td>"+s.getName()+"</td><td>"+s.getDeprtment()+"</td><td>"+s.getCountry()+"</td><td><a href='/student-details/Stuent/delete-student'id="+s.getId()+">Delete</a></td></tr>");
   }
   out.println("</table>");
   
   %>
   
   </div>
   <a href="/student-details/Student/show-form">Add more...Students</a>
</div>

</body>
</html>