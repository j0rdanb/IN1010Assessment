<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="nme.nmeassessment.domain.Album" %>
<%@page import="java.util.List" %>
<!DOCTYPE html>
<html>
    <jsp:include page="/header.jsp"/>
    <h1>Album Removed:</h1>
    <ul>
        <%
            List<Album> albums = (List<Album>) request.getAttribute("album");
            for (Album album : albums) {
                out.println("<li>" + album + "</li>");
            }
        %>
    </ul>
    
        <jsp:include page="/footer.jsp"/>
    
</html>
