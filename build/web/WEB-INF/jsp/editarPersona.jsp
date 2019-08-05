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
                          <th>Nombre</th>
                          <th>Apellido</th>
                          <th>Documento</th>
                          <th>Sexo</th>
                          <th>Correo Electronico</th>
                           <th>Discapacidad</th>
                          <th>Antecedentes</th>
                      </tr>
                  </thead>

                  <tr>
                      <td>
                          <input type="text" name="nombre" placeholder="nombre" value="${lista[0].nombre}">
                      </td>
                  
                 
                    <td>
                        <input type="text" name="apellido" placeholder="Cantidad" value="${lista[0].apellido}">
                    </td>
                    
                     <td>
                        <input type="text" name="documento" placeholder="Talla" value="${lista[0].documento}">
                    </td>
                    
                     <td>
                        <input type="text" name="sexo" placeholder="Valor" value="${lista[0].sexo}">
                    </td>
                    
                     <td>
                        <input type="text" name="correoelectronico" placeholder="Color" value="${lista[0].correoelectronico}">
                    </td>
                     <td>
                        <input type="text" name="discapacidad" placeholder="Color" value="${lista[0].discapacidad}">
                    </td>
                     <td>
                        <input type="text" name="antecedentes" placeholder="Color" value="${lista[0].antecedentes}">
                    </td>
                    <td>
                      <select name="idtipopersona">
                            <c:forEach var="dato" items="${listad}">
                                <c:if test="${dato.idTipopersona != lista[0].idtipopersona}">
                                    <option value="${dato.idtipopersona}">
                                    ${dato.nombre}
                                </option> 
                                </c:if>
                               
                                 <c:if test="${dato.idTipopersona == lista[0].idtipopersona}">
                                     <option value="${dato.idtipopersona}"selected="true">
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
