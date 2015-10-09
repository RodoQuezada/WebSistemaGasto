<%-- 
    Document   : listar
    Created on : 06-oct-2015, 1:58:48
    Author     : rodo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <title>Sistema Gasto</title>
    </head>
    <body><center> 
        <a href="ingresar.jsp">Ingresar Gasto</a>
        |       
        <a href="index.jsp">Salir</a>
        <h1>Lista de Gastos</h1>
         <table border="1" >
            <tr>
                <th>
                    Cuenta
                </th>
                <th>
                    Fecha Pago
                </th>
                <th>
                    Monto
                </th>
                <th>
                    Empresa
                </th>
                <th>
                    Forma Pago
                </th>
            </tr>
            <c:forEach var="m" items="${applicationScope.registro.getLstGasto()}">
                <tr>
                        <td>
                            ${m.getCuenta()}
                        </td>
                        <td>
                            ${m.getFechaPago()}
                        </td>
                        <td>
                            ${m.getMontoPago()}
                        </td>
                        <td>
                            ${m.getEmpresa()}
                        </td>
                        <td>
                            ${m.getFormaPago()}
                        </td>
                    </tr>                   
            </c:forEach>                 
         </table> 
        <br><br>
        <h4> Total Ingresado: ${applicationScope.registro.getLstGasto().size()}</h4>
          </center>
    </body>
</html>
