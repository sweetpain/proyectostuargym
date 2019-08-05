<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    <a class="btn" href="agregarMensualidad.htm">Nuevo registro</a>
    </head>
    <body>
        <table class="table table-hover" style="text-align: center;">
            <thead>
                <tr>
                    <th>Valor</th>
                    <th>Mes</th>
                    <th>Anio</th>
                   <th>Fecha</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="dato" items="${lista}">
                     <tr>
                        <td>${dato.valor}</td>
                         <td>${dato.mes}</td>
                          <td>${dato.anio}</td>
                           <td>${dato.fecha}</td>
                        
                        <td>
                            <a href="editarMensualidad.htm?idMensualidad=${dato.idMensualidad}" class="btn btn-warning">Editar</a>
                            <a onclick="return confirm('Esta seguro?');"
                               href="deleteMensualidad.htm?idMensualidad=${dato.idMensualidad}" class="btn btn-danger">Eiminar</a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>

