/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nme.nmeassessment.servlets;

import java.io.IOException;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import nme.nmeassessment.dao.NmeRepository;
import nme.nmeassessment.domain.Album;
import nme.nmeassessment.domain.Artist;

/**
 *
 * @author Jordan Bolton
 */
@WebServlet("/albumList.html")
public class AlbumListServlet extends HttpServlet {
    private NmeRepository nr;
    
    @Inject
    public AlbumListServlet(NmeRepository nr) {
        this.nr = nr;
    }
    
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        List<Album> albums = nr.findAllAlbums();
        request.setAttribute("albums", albums);
               
        RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/albumList.jsp");
        requestDispatcher.forward(request, response);
    }
}
