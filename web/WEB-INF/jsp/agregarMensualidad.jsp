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
                <h4>Agregar Nueva Mensualidad</h4>
                <label>Valor</label>
               <input type="double" name="valor" class="form-control">
               <label>Mes</label>
               <input type="text" name="mes" class="form-control">
                <label>Año</label>
               <input type="text" name="anio" class="form-control">
                <label>Fecha</label>
               <input type="date" name="fecha" class="form-control">
             
            </div>
        
         <select name="idinscripcion" id="idinscripcion">
                    <c:forEach var="dato" items="${lista}">
                        <option value="${dato.idInscripcion}">${dato.costo}</option>
                    </c:forEach>
                </select>
         
                <input type="submit" value="Agregar" class="btn btn-succes">
                <a href="indexMensualidad.htm">Regresar</a>
            </form>
        </div>
    </body>
</html>