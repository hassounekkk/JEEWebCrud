<%@page import="ma.fstt.presistence.Client"%>
<%@page import="ma.fstt.presistence.Etudiant"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Affiche Etudiant</title>
</head>
<body>

<h1> Page List  des Client</h1>


<%  List<Client> malise = ( List<Client> )request.getAttribute("malist"); %>


<table>
<th> ID </th>
<th> Nom </th>
<th> Prenom </th>
<th> Adresse </th>
<th> phone </th>
<th> Actions </th>
<%  for( int i = 0 ;  i < malise.size() ; i++ ){%>
<tr>
<td><%= malise.get(i).getId_client()%></td>
<td><%= malise.get(i).getNom()%></td>
<td><%= malise.get(i).getPrenom()%></td>
<td><%= malise.get(i).getAdresse()%></td>
<td><%= malise.get(i).getPhone()%></td>
<td> <a type="button" href="/WebAppSIm/DeleteClient?id=<%= malise.get(i).getId_client()%>">Delete </a>
<a type="button" href="/WebAppSIm/UptateClient?id=<%= malise.get(i).getId_client()%>">edite </a>
</td>
</tr>
<%} %>
</table>


</body>
</html>