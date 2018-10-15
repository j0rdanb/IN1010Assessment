<%-- 
    Document   : artistCount
    Created on : 16-Mar-2018, 13:04:09
    Author     : Jordan Bolton
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Artist Count</title>
        <jsp:include page="/header.jsp" />
    </head>
    <body>
        <h1>Artist Count: </h1>
        <%
            Integer artistCount = (Integer) request.getAttribute("artistCount");
            out.println("<strong>" + artistCount + "</strong>"); 
        %>
        
        
    </body>
    <jsp:include page="/footer.jsp" />
</html>
