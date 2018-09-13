<%-- 
    Document   : cadPessoa
    Created on : 05/07/2018, 16:34:00
    Author     : Familia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Clinica Noventa Graus</title>
        <link href="../Estilos/form.css" rel="stylesheet" type="text/css"/>
        
    </head>
    
    <body>
        <div>
            <h1> Cadastro do Sexo</h1>
            
        </div>
        <form action="${pageContext.request.contextPath}/cadastrosexo" method="POST">
            <p>
                <label for="id"> Identificação </label> 
                <input type="text" name="id" value="" />
                <label for="Sexo"> Sexo </label> 
                <input type="text" name="Sexo" value="" />
                <input type="submit" value="Salvar" />
            </p>
            
        </form>
    </body>
</html>
