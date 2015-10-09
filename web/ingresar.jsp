<%-- 
    Document   : ingresar
    Created on : 06-oct-2015, 1:02:44
    Author     : rodo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ingreso Gastos</title>
    </head>
    <body><center>
        <a href="listar.jsp">Listar Gastos</a>
        |
        <a href="index.jsp">Salir</a>
        <h1>Ingreso de datos</h1>
        <form action="<c:url value="/GastoServlet.do"/>" method="post">
            <table>
                <tr>
                    <td>
                        Cuenta:   
                    </td>                
                    <td>
                        <select name="cuenta">
                            <option value="luz">Luz</option>
                            <option value="agua">Agua</option>
                            <option value="gas">Gas</option>
                            <option value="celular">Celular</option>
                            <option value="superMercado">Super Mercado</option>
                            <option value="arriendo">Arriendo</option>
                            <option value="packTecnologico">Pack Tecnologico</option>
                        </select>  
                    </td>
                </tr>
                <tr>
                    <td>
                        Fecha Pago:
                    </td>
                    <td>
                        <input type="date" name="fechaPago"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        Monto Pago:
                    </td>
                    <td>
                        <input type="text" name="montoPago"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        Empresa:                        
                    </td>
                    <td>
                        <input type="text" name="empresa" />
                    </td>
                </tr>
                <tr>
                    <td>
                        Forma de Pago:
                    </td>
                    <td>
                        <input type="radio" name="formaPago" value="efectivo" checked=" ">Efectivo 
                        <input type="radio" name="formaPago" value="transferencia">Transferencia
                        <input type="radio" name="formaPago" value="tarjeta">Tarjeta
                    </td>
                </tr>
                <tr>
                <br>
                <td>
                    <input type="reset" value="reset"/>                        
                </td>
                <td>
                    <input type="submit" value="enviar"/>                       
                </td>
                </tr>
            </table>
        </form>
        <c:if test="${not empty errores}">
            <h3> <c:out value="${errores}"/></h3>
        </c:if>
    </center>
</body>
</html>
