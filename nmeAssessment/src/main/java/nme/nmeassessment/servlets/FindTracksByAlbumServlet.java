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
import nme.nmeassessment.domain.Track;

/**
 *
 * @author Jordan Bolton
 */
@WebServlet("/tracksByAlbumResult.html")
public class FindTracksByAlbumServlet extends HttpServlet {
    private NmeRepository nr;
    
    @Inject
    public FindTracksByAlbumServlet(NmeRepository nr) {
        this.nr = nr;
    }
    
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html"); 
        
        int albumID = Integer.parseInt(request.getParameter("albumID"));
        
        List<Track> tracks = nr.findTracksOnAlbum(albumID);
        request.setAttribute("tracks", tracks);
        
        RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/tracksByAlbumResult.jsp");
        requestDispatcher.forward(request, response);
        
    }
}
