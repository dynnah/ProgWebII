<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Context-Type" content="text/html; charset=UTF-8">
<title>Página Principal da Aplicação</title>
</head>
<body>

	<h1>Cadastro de Livro</h1>

	<form:form action="save" method="POST" modelAttribute="livro"
		acceptCharset="UTF-8">
		Id: <form:input path="id" />
		<br />
		<br />
		Título: <form:input path="titulo" />
		<br />
		<br />
		Autor: <form:input path="autor" />
		<br />
		<br />
		Estilo: <form:select path="estilo" >
		<form:options items="${estiloOptions}" />
		</form:select>
		<br />
		<br />
		<input type="submit" value="Salvar" />
	</form:form>

</body>
</html>