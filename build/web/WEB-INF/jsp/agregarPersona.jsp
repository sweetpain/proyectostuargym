
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <div class="car-body">
            <form method="POST">
                <h4>Agregar nuevo Accesorio</h4>
                <label>Nombre</label>
                <input type="text" name="nombre" class="form-control">
                <label>apellido</label>
                <input type="text" name="apellido" class="form-control">
                <label>documento</label>
                <input type="text" name="documento" class="form-control">
                <label>sexo</label>
                <input type="text" name="sexo" class="form-control">
                <label>Correo Electronico</label>
                <input type="text" name="correoelectronico" class="form-control">
                <label>discapacidad</label>
                <input type="text" name="discapacidad" class="form-control">
                <label>antecedentes</label>
                <input type="text" name="antecedentes" class="form-control">
                
                
                <select name="idtipopersona" id="idtipopersona">
                    <c:forEach var="dato" items="${lista}">
                        <option value="${dato.idTipopersona}">${dato.nombre}</option>
                    </c:forEach>
                </select>
                
              
             
            </div>
                <input type="submit" value="Agregar" class="btn btn-succes">
                <a href="indexPersona.htm">Regresar</a>
            </form>
        </div>
    </body>
</html>

