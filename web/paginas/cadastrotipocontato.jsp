<%-- 
    Document   : cadastrotipocontato
    Created on : 13/09/2018, 15:19:55
    Author     : Gabi
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
            <h1> Cadastro de Tipo de contato</h1>
            
        </div>
        <form action="${pageContext.request.contextPath}/cadastrotipocontato" method="POST">
            <p>
                <label for="id"> Id Tipo contato </label> 
                <input type="text" name="id" value="" />
                <label for="tipocontato"> Nome contato </label> 
                <input type="text" name="tipocontato" value="" />
                <input type="submit" value="Salvar" />
            </p>
            
        </form>
    </body>
</html>

