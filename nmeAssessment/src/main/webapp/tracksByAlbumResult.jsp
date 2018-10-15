<%-- 
    Document   : tracksByAlbumResult
    Created on : 16-Mar-2018, 14:52:54
    Author     : Jordan Bolton
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List" %>
<%@page import="nme.nmeassessment.domain.Track" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tracks by Album Result</title>
        <jsp:include page="/header.jsp" />
    </head>
    <body>
        <%
        out.println("<h1> Tracks on album with ID: " + request.getParameter("albumID") + "</h1>");
        
        %>
                
                
        <ul>
        <%
          List<Track> tracks = (List<Track>) request.getAttribute("tracks");
          for (Track track : tracks) {
              out.println("<li>" + track + "</li>");
          }
            
            
            
            
        %>
        </ul>
    </body>
    
    <jsp:include page="footer.jsp" />
</html>
