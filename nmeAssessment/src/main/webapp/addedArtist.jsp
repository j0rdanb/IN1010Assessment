<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="nme.nmeassessment.domain.Artist" %>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
    <jsp:include page="/header.jsp"/>
    <h1>Artist Added:</h1>
    <ul>
        <%
            List<Artist> artists = (List<Artist>) request.getAttribute("artist");
            for (Artist artist : artists) {
                out.println("<li>" + artist + "</li>");
            }
        %>
    </ul>
        <jsp:include page="/footer.jsp"/>
</html>
