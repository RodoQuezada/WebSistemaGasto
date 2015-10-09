<%-- 
    Document   : index
    Created on : 06-oct-2015, 0:46:54
    Author     : rodo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sistema Gasto</title>
    </head>
    <body><center>
        <h1>Bienvenido al Sistema Gastos</h1>
        <form action="<c:url value="/LoginServlet.do"/>" method="POST">
            <table>
                <tr>
                    <td>
                        Usuario:   
                    </td>
                </tr>
                <tr>
                    <td>
                        <input type="text" name="usuario"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        Contraseña:   
                    </td>
                </tr>
                <tr>
                    <td>
                        <input type="password" name="password"/>
                    </td>
                </tr>               
                <tr>
                    <td>
                        <input type="submit" name="Ingresar"/>
                    </td>
                </tr>
            </table>
        </form>
        <c:if test="${not empty error }">
            <h3><c:out value="${error}"/></h3>
        </c:if>
    </center>
</body>
</html>
