<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>register</title>
</head>
<body>

<h1>register for java</h1>
<h1>${msg}</h1>

<form action="/springANKUSHKORAV/submitadmissionform.html" method="post">

<table>
<tr><td>Students name</td>            <td><input type="text" name="name"></td></tr>
<tr><td>Students hobby</td>            <td><input type="text" name="hobby"></td></tr>
<tr><td>Students mobile</td>            <td><input type="text" name="studentMobile"></td></tr>
<tr><td>Students DOB</td>            <td><input type="text" name="studentDOB"></td></tr>
<tr><td>Students skills</td>            <td>   <select name="studentSkills" multiple>            
                                            <option value="JavaCore">Java Core</option>
                                            <option value="JavaSpring">Java Spring</option>
                                            <option value="JavaMVC">JavaMVC</option>
                                              </select></td></tr>

<tr><td><input type="submit" value="submit this right now"/></td></tr>
</table>






</form>


</body>
</html>