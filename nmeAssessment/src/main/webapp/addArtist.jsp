<%-- 
    Document   : addArtist
    Created on : 16-Mar-2018, 11:14:00
    Author     : Chris
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <jsp:include page="/header.jsp" />
    <h1>Add Artist</h1>
    
    <form action="addedArtist.html" method="POST">
        <table>
            <tr>
                <td>Artist ID:</td>
                <td><input type="text" name="artistId"/></td>
            </tr>
            <tr>
                <td>Artist Name:</td>
                <td><input type="text" name="artistName"/></td>
            </tr>
            <tr>
                <td>Genre:</td>
                <td><input type="text" name="genre"/></td>
            </tr>
            <tr>
                <td>Sales:</td>
                <td><input type="text" name="sales"/></td>
            </tr>
        </table>
        <input type="submit" value="Add Artist"/>
    </form>
    <jsp:include page="/footer.jsp" />
</html>
