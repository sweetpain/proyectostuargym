<%-- 
    Document   : editarAccesorio
    Created on : 11/06/2019, 03:18:27 PM
    Author     : Adrian Stuar
--%>
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
          <h1> Actualizar Accesorio</h1>
          <form method="POST">
              <table>
                  <thead>
                      <tr>
                          <th>Nombre</th>
                          <th>Cantidad</th>
                          <th>Talla</th>
                          <th>Valor</th>
                          <th>Color</th>
                      </tr>
                  </thead>

                  <tr>
                      <td>
                          <input type="text" name="nombre" placeholder="nombre" value="${lista[0].nombre}">
                      </td>
                  
                 
                    <td>
                        <input type="numeric" name="cantidad" placeholder="Cantidad" value="${lista[0].cantidad}">
                    </td>
                    
                     <td>
                        <input type="text" name="talla" placeholder="Talla" value="${lista[0].talla}">
                    </td>
                    
                     <td>
                        <input type="double" name="valor" placeholder="Valor" value="${lista[0].valor}">
                    </td>
                    
                     <td>
                        <input type="text" name="color" placeholder="Color" value="${lista[0].color}">
                    </td>
                    <td>
                      <select name="idtipoaccesorio">
                            <c:forEach var="dato" items="${listad}">
                                <c:if test="${dato.idTipoaccesorio != lista[0].idtipoaccesorio}">
                                    <option value="${dato.idtipoaccesorio}">
                                    ${dato.nombre}
                                </option> 
                                </c:if>
                               
                                 <c:if test="${dato.idTipoaccesorio == lista[0].idtipoaccesorio}">
                                     <option value="${dato.idtipoaccesorio}"selected="true">
                                    ${dato.nombre}
                                </option> 
                                </c:if>
                                
                            </c:forEach>
                            
                        </select>
                    </td>
                    
                    
                    

                    <td>
                        <input type="submit" value="Actualizarr" class="agregar">
                    </td>
                </tr>
              </table>

              <a href="index.html">Regresar</a>
          </form>
      </div>
  
  </body>
</html>
