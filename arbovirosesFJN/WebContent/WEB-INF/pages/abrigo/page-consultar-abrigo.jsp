<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="pt-br">
	<head>
		<meta charset="UTF-8">
		<!-- Responsive meta tag -->
		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
		<meta name="author" content="Oliveira, Zuamir Gutemberg">
		<title>Abrigos</title>
		
		<link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css">
		<script src="<%=request.getContextPath()%>/resources/js/jquery.min.js" type="text/javascript"></script>
	</head>
<body class="bg-light">
	<div class="conteiner">
		<div class="container">
			<div class="form-row md-5">
				<div class="col-sm-12 col-md-10 col-lg-8">
					<h1 class="display-6"><i class="fa fa-paper-plane text-primary" aria-hidden="true"></i>Abrigos Cadastrados</h1>
				</div>
			</div>
			<table class="table table-sm">
				<thead>
					<tr>
						<th scope="col">Abrigo</th>
						<th scope="col">Contato</th>
						<th scope="col">Email</th>
						<th scope="col">Telefone</th>
						<th scope="col">Telefone</th>
						<th scope="col">Logradouro</th>
						<th scope="col">Número</th>
						<th scope="col">Bairro</th>
						<th scope="col">Cidade</th>
						<th scope="col">Estado</th>
						<th scope="col">Cep</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="a" items="${abrigos}">
						<tr>
							<td>${a.nmAbrigo}</td>
							<td>${a.nmContato}</td>
							<td>${a.email}</td>
							<td>${a.numTelefone1}</td>
							<td>${a.numTelefone2}</td>
							<td>${a.logradouro}</td>
							<td>${a.numero}</td>
							<td>${a.bairro}</td>
							<td>${a.cidade}</td>
							<td>${a.estado}</td>
							<td>${a.cep}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<div class="form-row">
				<div class="col-sm-12">
					<input type="button" class="btn btn-primary" value="Voltar" onClick="history.go(-1)">
				</div>
			</div>
		</div>
	</div>
	<div class="container">
      <footer class="my-5 pt-5 text-muted text-center text-small">
         <p class="mb-1">&copy; 2019-2020 Arboviroses FJN - Project</p>
         <ul class="list-inline">
            <li class="list-inline-item"><a href="#">Privacy</a></li>
            <li class="list-inline-item"><a href="#">Terms</a></li>
            <li class="list-inline-item"><a href="#">Support</a></li>
         </ul>
      </footer>
   </div> 
	<script src="<%=request.getContextPath()%>/resources/js/consultarCep.js"></script>
	<script src="<%=request.getContextPath()%>/resources/js/bootstrap.bundle.min.js"></script>
	<script src="<%=request.getContextPath()%>/resources/js/bootstrap.min.js"></script>
	<script src="<%=request.getContextPath()%>/resources/js/form-validation.js"></script>
</body>
</html>