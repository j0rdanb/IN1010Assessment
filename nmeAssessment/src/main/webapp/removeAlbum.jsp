<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <jsp:include page="/header.jsp"/>
    <h1>Remove Album</h1>
    
    <form action="removedAlbum.html" method="POST">
        <table>
            <tr>
                <td>Album ID:</td>
                <td><input type="text" name="albumId"/></td>
            </tr>
        </table>
        <input type="submit" value="Remove Album"/>
    </form>
    <jsp:include page="/footer.jsp"/>
</html>
