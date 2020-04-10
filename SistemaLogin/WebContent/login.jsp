<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sistema Login</title>
<script type="text/javascript" src="validarCampos.js" >
</script>

</head>
<body>
	<form action="login" method="post" name="formLogin">
		<p align="center">
		<table cellpadding="12" align="center">
			<tr>
				<td>Usuário:</td>
				<td><input type="text" name="txtUsuario" /></td>
			</tr>
			<tr>
				<td>Senha:</td>
				<td><input type="text" name="txtSenha" /></td>
			</tr>

			<tr>
				<td />
				<td />
				<td align="center"><input type="submit" value="Entrar" onclick="validarLogin()" /></td>
			</tr>

		</table>
		</p>
	</form>
</body>
</html>