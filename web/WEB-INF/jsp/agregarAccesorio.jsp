
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
                <label>Cantidad</label>
                <input type="numeric" name="cantidad" class="form-control">
                <label>Talla</label>
                <input type="text" name="talla" class="form-control">
                <label>valor</label>
                <input type="double" name="valor" class="form-control">
                <label>Color</label>
                <input type="text" name="color" class="form-control">
                
                
                <select name="idtipoaccesorio" id="idtipoaccesorio">
                    <c:forEach var="dato" items="${lista}">
                        <option value="${dato.idTipoaccesorio}">${dato.nombre}</option>
                    </c:forEach>
                </select>
                
              
             
            </div>
                <input type="submit" value="Agregar" class="btn btn-succes">
                <a href="indexAccesorio.htm">Regresar</a>
            </form>
        </div>
    </body>
</html>
