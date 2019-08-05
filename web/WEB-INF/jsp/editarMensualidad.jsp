<%-- 
    Document   : editarNivel
    Created on : 18/06/2019, 04:22:28 PM
    Author     : Adrian Stuar
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
                <h4>Editar Mensualidad</h4>
                <label>Valor</label>
                <input type="double" name="valor" value="${lista[0].valor}" >
                <label>Mes</label>
                <input type="text" name="mes" value="${lista[0].mes}" >
                <label>Anio</label>
                <input type="text" name="anio" value="${lista[0].anio}" >
                <label>Fecha</label>
                <input type="date" name="fecha" value="${lista[0].fecha}" >
              
                 
                            
         
                
                
                
             <input type="submit" value="Actualizar" class="agregar">
               
               
                <a href="indexMensualidad.htm">Regresar</a>
            </form>
        </div>
    </body>
</html>
