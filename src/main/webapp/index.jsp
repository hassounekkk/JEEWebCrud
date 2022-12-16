<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ajouter  Client</title>
</head>
<body>

<form action="ClientServlet" method="post">

<label> Nom : </label>
<input type="text"  name="name"/>  <br>


<label> Prenom : </label>
<input type="text"  name="prenom"/>  <br>


<label> adresse : </label>
<input type="number"  name="adresse"/>  <br>

<label> phone : </label>
<input type="number"  name="phone"/>  <br>


<input type="submit"  name="ok" value="save"/>  <br>

</form>



</body>
</html>