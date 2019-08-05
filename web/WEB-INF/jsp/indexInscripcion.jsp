<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
           <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    <a class="btn" href="agregarInscripcion.htm">Nuevo accesorio</a>
    </head>
    <body>
        <table class="table table-hover" style="text-align: center;">
            <thead>
                <tr>
                  
                    <th>Nombre del Nivel</th>
                    <th>Nombre de la Persona</th>
                    <th>Documento</th>
                    <th>Fecha</th>
                    <th>Costo</th>
                    
                </tr>
            </thead>
            <tbody>
                <c:forEach var="dato" items="${lista}">
                     <tr>
                        
                        <td>${dato.nomnivel}</td>
                        <td>${dato.nompersona}</td>
                        <td>${dato.docpersona}</td>
                        <td>${dato.fecha}</td>
                        <td>${dato.costo}</td>
                       
                     
                        <td>
                            <a href="editarInscripcion.htm?idInscripcion=${dato.idInscripcion}" class="btn btn-warning">Editar</a>
                            <a onclick="return confirm('Esta seguro?');"
                               href="deleteInscripcion.htm?idInscripcion=${dato.idInscripcion}" class="btn btn-danger">Eiminar</a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
