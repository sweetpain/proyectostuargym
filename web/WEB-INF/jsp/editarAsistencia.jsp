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
      <div class="container">
          <h1> Actualiza Persona</h1>
          <form method="POST">
              <table>
                  <thead>
                      <tr>
                          <th>Fecha</th>
                         
                      </tr>
                  </thead>

                  <tr>
                      <td>
                          <input type="date" name="fecha" placeholder="fecha" value="${lista[0].fecha}">
                      </td>
                  
                    <td>
                      <select name="idpersona">
                            <c:forEach var="dato" items="${listad}">
                                <c:if test="${dato.idPersona != lista[0].idpersona}">
                                    <option value="${dato.idpersona}">
                                    ${dato.nombre}
                                </option> 
                                </c:if>
                               
                                <c:if test="${dato.idPersona == lista[0].idpersona}">
                                    <option value="${dato.idpersona}">
                                    ${dato.nombre}
                                </option> 
                                </c:if>
                                
                            </c:forEach>
                            
                        </select>
                    </td>
                    
                    
                    

                    <td>
                        <input type="submit" value="Actualizar" class="agregar">
                    </td>
                </tr>
              </table>

              <a href="index.html">Regresar</a>
          </form>
      </div>
  
  </body>
</html>
