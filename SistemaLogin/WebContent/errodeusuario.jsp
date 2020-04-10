<%@ page isErrorPage="true"%>
<%@ page import="java.util.Enumeration"%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Erro de Login</title>

<style type="text/css">
#cabecalho {
	background-color: #fff;
	width: 800px;
	height: 80px;
}

#corpo {
	background-color: #fff;
	height: 80px;
}

#rodape {
	background-color: #fff;
	width: 800px;
	height: 80px;
}
</style>



</head>
<body>

	<div align="center">
		<div id="cabecalho">
			ERRO
			
		</div>
		<div id="corpo">
			<img src="imagens/images.png" />
			<hr>
			Error:
			<%=exception.getMessage()%>
			<br> Exceção ocorrida:
			<%=exception.getClass()%>
			<br> <a href="login.jsp">Tentar Novamente</a>
			<hr>
		</div>
		<div id="rodape"></div>
	</div>
</body>
</html>