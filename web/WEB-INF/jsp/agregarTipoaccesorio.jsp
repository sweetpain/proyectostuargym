
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
             
            </div>
                <input type="submit" value="Agregar" class="btn btn-succes">
                <a href="indexAccesorio.htm">Regresar</a>
            </form>
        </div>
    </body>
</html>
