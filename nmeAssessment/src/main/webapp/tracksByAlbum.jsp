<%-- 
    Document   : tracksByAlbum
    Created on : 16-Mar-2018, 14:44:08
    Author     : Jordan Bolton
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Find Tracks by Album</title>
        <jsp:include page="/header.jsp" />
    </head>
    <body>
        <h1>Find Tracks by Album:</h1>
        
        <form action="tracksByAlbumResult.html" method="POST">
            <label>Enter an album ID: <input type="text" name="albumID"/></label>
            <input type="submit" value="Search" />
        </form>
    </body>
</html>
