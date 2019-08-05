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
                <h4>Agregar una nueva Inscripcion</h4>
                <label>fecha</label>
                <input type="date" name="fecha" class="form-control">
                <label>costo</label>
                <input type="double" name="costo" class="form-control">
               
                
                
                <select name="idNivel" id="idNivel">
                    <c:forEach var="dato" items="${listaNi}">
                        <option value="${dato.idnivel}">${dato.nombre}</option>
                    </c:forEach>
                </select>
                <select name="idpersona" id="idpersona">
                    <c:forEach var="dato" items="${listaPe}">
                        <option value="${dato.idPersona}">${dato.nombre}</option>
                    </c:forEach>
                </select>
                
              
             
            </div>
                <input type="submit" value="Agregar" class="btn btn-succes">
                <a href="indexInscripcion.htm">Regresar</a>
            </form>
        </div>
    </body>
</html>

