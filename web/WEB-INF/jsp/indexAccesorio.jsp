<%-- 
    Document   : indexAccesorio
    Created on : 11/06/2019, 01:34:36 PM
    Author     : Adrian Stuar
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    <a class="btn" href="agregarAccesorio.htm">Nuevo accesorio</a>
    </head>
    <body>
        <table class="table table-hover" style="text-align: center;">
            <thead>
                <tr>
                  
                    <th>Nombre</th>
                    <th>Cantidad</th>
                    <th>Talla</th>
                    <th>Valor</th>
                    <th>Color</th>
                    <th>Tipo Accesorio</th>
                    
                </tr>
            </thead>
            <tbody>
                <c:forEach var="dato" items="${lista}">
                     <tr>
                        
                        <td>${dato.nombre}</td>
                        <td>${dato.cantidad}</td>
                        <td>${dato.talla}</td>
                        <td>${dato.valor}</td>
                        <td>${dato.color}</td>
                        <td>${dato.nombreacc}</td>
                        nombreacc
                        <td>
                            <a href="editarAccesorio.htm?idaccesorio=${dato.idaccesorio}" class="btn btn-warning">Editar</a>
                            <a onclick="return confirm('Esta seguro?');"
                               href="deleteAccesorio.htm?idaccesorio=${dato.idaccesorio}" class="btn btn-danger">Eiminar</a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
