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
		<title>Cadastrar Abrigo</title>
		
		<link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css">
		<script src="<%=request.getContextPath()%>/resources/js/jquery.min.js" type="text/javascript"></script>
		<script type="text/javascript">
			$(document).ready(function name() {
				$('#cep').focusout(function name() {
					var cep = $("#cep").val();
					pesquisacep(cep);
				})
			})
		</script>
	</head>
<body class="bg-light">
   <div class="conteiner">
   	<div class="container">
		<div class="form-row justify-content-center md-5">
			<div class="col-sm-12 col-md-10 col-lg-8">
				<h1 class="display-6"><i class="fa fa-paper-plane text-primary" aria-hidden="true"></i>Cadastrar Abrigo</h1>
			</div>
		</div>
	<form method="post" action="cadastrarAbrigoServlet">
		<div class="row justify-content-center md-5">
			<div class="col-sm-12 col-md-10 col-lg-8">
					<div class="form-row">
						<div class="form-group col-sm-10">
							<label for="inputNome">Nome abrigo *</label>
							<input type="text" class="form-control" id="nmAbrigo" placeholder="" name="nmAbrigo" value="${abrigo.nmAbrigo}">
						</div>
					</div>
			</div>
		</div>
		<div class="row justify-content-center md-5">
			<div class="col-sm-12 col-md-10 col-lg-8">
				<div class="form-row">
					<div class="form-group col-sm-6">
						<label for="inputNome">Contato *</label>
						<input type="text" class="form-control" id="nmAbrigo" placeholder="" name="nmContato" value="${abrigo.nmContato}">
					</div>
					<div class="form-group col-sm-4">
						<label for="inputNome">Email</label>
						<input type="email" class="form-control" id="nmAbrigo" placeholder="" name="nmContato" value="${abrigo.email}">
					</div>
				</div>
				<div class="form-row">
					<div class="form-group col-sm-5">
						<label for="inputTel">Telefone *</label>
						<input type="text" class="form-control" id="numTel" placeholder="" name="numTelefone1" value="${abrigo.numTelefone1}">
					</div>
					<div class="form-group col-sm-5">
						<label for="inputTel">Telefone</label>
						<input type="text" class="form-control" id="numTel" placeholder="" name="numTelefone2" value="${abrigo.numTelefone2}">
					</div>
				</div>
				<div class="form-row">
					<div class="form-group col-sm-3">
						<label for="inputCep">Cep *</label>
						<input type="text" class="form-control" id="cep" placeholder="" name="cep" value="${abrigo.cep}" >
					</div>
					<div class="form-group col-sm-4">
						<label for="inputCidade">Cidade</label>
						<input type="text" class="form-control" id="cidade" placeholder="" name="cidade" value="${abrigo.cidade}">
					</div>
					<div class="form-group col-sm-3">
						<label for="inputEstado">Estado</label>
						<input type="text" class="form-control" id="estado" placeholder="" name="estado" value="${abrigo.estado}">
					</div>
				</div>
				<div class="form-row">
					<div class="form-group col-sm-7">
						<label for="inputLogradouro">Logradouro *</label>
						<input type="text" class="form-control" id="logradouro" placeholder="" name="logradouro" value="${abrigo.logradouro}">
					</div>
					<div class="form-group col-sm-3 col-md-3 col-lg-3">
						<label for="inputNumero">Número</label>
						<input type="text" class="form-control" id="numero" placeholder="" name="numero" value="${abrigo.numero}">
					</div>
				</div>
				<div class="form-row">
					<div class="form-group col-sm-10">
						<label for="inputBairro">Bairro *</label>
						<input type="text" class="form-control" id="bairro" placeholder="" name="bairro" value="${abrigo.bairro}">
					</div>
				</div>
				<div class="form-row">
					<div class="col-sm-12">
						<input type="button" class="btn btn-primary" value="Voltar" onClick="history.go(-1)">
						<button type="submit" class="btn btn-primary">Cadastrar</button>
					</div>
				</div>
			</div>
		</div>
	</form>	
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