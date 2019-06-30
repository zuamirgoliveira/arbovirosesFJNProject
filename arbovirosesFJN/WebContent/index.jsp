<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="pt-br">
	<head>
		<meta charset="UTF-8">
		<!-- Responsive meta tag -->
		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
		<meta name="author" content="Oliveira, Zuamir Gutemberg">
		<title>Dashboard Arboviroses</title>
		
		<link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

</head>
<body>
	<div class="conteiner" align="center">
		<div class="container">
			<div class="form-row">
				<div class="col-sm-8 col-md-6 col-lg-8">
					<h1 class="display-6">
						<i class="fa fa-paper-plane text-primary" aria-hidden="true"></i>Arboviroses FJN</h1>
			<div class="form-row">
				<a href="consultarAbrigoServlet" class="btn btn-primary btn-lg btn-block">Consultar Abrigo</a> 
				<a href="cadastrarAbrigoServlet" class="btn btn-primary btn-lg btn-block">Cadastrar Abrigo</a>
			</div>
				</div>
			</div>
		</div>
		<script src="<%=request.getContextPath()%>/resources/js/bootstrap.min.js"></script>
		<script src="<%=request.getContextPath()%>/resources/js/jquery.min.js" type="text/javascript"></script>
		<script src="<%=request.getContextPath()%>/resources/js/bootstrap.bundle.min.js"></script>
		<script src="<%=request.getContextPath()%>/resources/js/form-validation.js"></script>
	</div>
</body>
</html>