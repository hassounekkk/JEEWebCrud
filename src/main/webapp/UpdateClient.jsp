<%@page import="ma.fstt.presistence.Client"%>
<%@page import="ma.fstt.presistence.Etudiant"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%  Client client = (Client )request.getAttribute("client"); %>
<form action="SaveUpdate" method="post">

<input type="hidden"  name="id" value="<%=   client.getId_client()  %>"/>  <br>
<label> Nom : </label>
<input type="text"  name="name" value="<%=   client.getNom()  %>"/>  <br>


<label> Prenom : </label>
<input type="text"  name="prenom" value="<%=   client.getPrenom()  %>"/>  <br>


<label> adresse : </label>
<input type="text"  name="adresse"   value="<%=   client.getAdresse()  %>" />  <br>

<label> phone : </label>
<input type="text"  name="phone" value="<%=   client.getPhone()  %>"/>  <br>


<input type="submit"  name="ok" value="Update"/>  <br>

</form>

</body>
</html>