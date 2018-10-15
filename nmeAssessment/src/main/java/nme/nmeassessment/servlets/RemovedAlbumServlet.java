/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nme.nmeassessment.servlets;

import java.io.IOException;
import java.io.PrintWriter;
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

/**
 *
 * @author Chris
 */
@WebServlet("/removedAlbum.html")
public class RemovedAlbumServlet extends HttpServlet {
    
    private NmeRepository nr;
    
    @Inject
    public RemovedAlbumServlet(NmeRepository nr){
        this.nr = nr;
    }
    
    public void doPost(HttpServletRequest request,
            HttpServletResponse response) throws IOException, ServletException{
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        
        int albumId = Integer.parseInt(request.getParameter("albumId"));
        
        nr.removeAlbum(albumId);
        
        response.sendRedirect("removedAlbum.html");
    }
    
    public void doGet(HttpServletRequest request,
            HttpServletResponse response) throws IOException, ServletException{
        List<Album> albums = nr.findAllAlbums();
        request.setAttribute("album", albums);
        
        RequestDispatcher requestDispatcher =
                getServletContext().getRequestDispatcher("/removedAlbum.jsp");
        requestDispatcher.forward(request, response);
    }
    
    
}
