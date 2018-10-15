<%-- 
    Document   : albumList
    Created on : 16-Mar-2018, 11:23:20
    Author     : Jordan Bolton
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<%@page import="java.util.List" %>
<%@page import="nme.nmeassessment.domain.Album" %>
<%@page import="nme.nmeassessment.domain.Artist" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Album List</title>
        <jsp:include page="/header.jsp" />
    </head>
    <body>
        <h1>Album List</h1>
        
        <table border="1">
            <tr>
                <th>Album ID</th>
                <th>Album Name</th>
                <th>Release Date</th>
                <th>Artist Name</th>
            </tr>
            
            <%
                List<Album> albums = (List<Album>) request.getAttribute("albums");
                List<Artist> artists = (List<Artist>) request.getAttribute("artists");
                for (Album album : albums) {
                    out.println("<tr>");
                    out.println("<td>" + album.getAlbumID() + "</td>"); 
                    out.println("<td>" + album.getAlbumTitle() + "</td>");
                    out.println("<td>" + album.getReleaseDate() + "</td>");
                    out.println("<td>" + album.getArtist().getArtistName() + "</td>");
                    out.println("</tr>");
                }
                
                
            %>
        </table>

    </body>
    
    <jsp:include page="/footer.jsp" />
</html>
