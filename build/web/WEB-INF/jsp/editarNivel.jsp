<%-- 
    Document   : editarNivel
    Created on : 18/06/2019, 04:22:28 PM
    Author     : Adrian Stuar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
   <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="car-body">
            <form method="POST">
                <h4>Agregar Nivel</h4>
                <label>Nombre</label>
                <input type="text" name="nombre" value="${lista[0].nombre}" >
              
                        <input type="submit" value="Actualizar" class="agregar">
               
               
                <a href="indexNivel.htm">Regresar</a>
            </form>
        </div>
    </body>
</html>
