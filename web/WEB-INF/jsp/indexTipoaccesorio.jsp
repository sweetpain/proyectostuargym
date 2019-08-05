<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    <a class="btn" href="agregarTipoaccesorio.htm">Nuevo registro</a>
    </head>
    <body>
        <table class="table table-hover" style="text-align: center;">
            <thead>
                <tr>
                    <th>Nombre</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="dato" items="${lista}">
                     <tr>
                        <td>${dato.nombre}</td>
                        
                        <td>
                            <a href="editarTipoaccesorio.htm?idTipoaccesorio=${dato.idTipoaccesorio}" class="btn btn-warning">Editar</a>
                            <a onclick="return confirm('Esta seguro?');"
                               href="deleteTipoaccesorio.htm?idTipoaccesorio=${dato.idTipoaccesorio}" class="btn btn-danger">Eiminar</a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
