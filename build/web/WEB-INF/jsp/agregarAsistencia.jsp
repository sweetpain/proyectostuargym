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
                <h4>Agregar nueva Asistencia</h4>
                <label>Fecha</label>
                <input type="date" name="fecha" class="form-control">
               
                
                
                <select name="idpersona" id="idpersona">
                    <c:forEach var="dato" items="${lista}">
                        <option value="${dato.idPersona}">${dato.nombre}</option>
                    </c:forEach>
                </select>
                
              
             
            </div>
                <input type="submit" value="Agregar" class="btn btn-succes">
                <a href="indexPersona.htm">Regresar</a>
            </form>
        </div>
    </body>
</html>

