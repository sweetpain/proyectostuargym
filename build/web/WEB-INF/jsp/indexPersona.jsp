<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    <a class="btn" href="agregarPersona.htm">Nuevo accesorio</a>
    </head>
    <body>
        <table class="table table-hover" style="text-align: center;">
            <thead>
                <tr>
                  
                    <th>Nombre</th>
                    <th>Apellido</th>
                    <th>Documento</th>
                    <th>Sexo</th>
                    <th>Correo Electronico</th>
                     <th>Discapacidad</th>
                    <th>Antecedentes</th>
                    <th>Tipo persona</th>
                    
                </tr>
            </thead>
            <tbody>
                <c:forEach var="dato" items="${lista}">
                     <tr>
                        
                        <td>${dato.nombre}</td>
                        <td>${dato.apellido}</td>
                        <td>${dato.documento}</td>
                        <td>${dato.sexo}</td>
                        <td>${dato.correoelectronico}</td>
                        <td>${dato.discapacidad}</td>
                        <td>${dato.antecedentes}</td>
                        <td>${dato.nombretipo}</td>
                     
                        <td>
                            <a href="editarPersona.htm?idPersona=${dato.idPersona}" class="btn btn-warning">Editar</a>
                            <a onclick="return confirm('Esta seguro?');"
                               href="deletePersona.htm?idPersona=${dato.idPersona}" class="btn btn-danger">Eiminar</a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
