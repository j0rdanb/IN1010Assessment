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
import nme.nmeassessment.domain.Artist;



/**
 *
 * @author Chris
 */

@WebServlet("/addedArtist.html")
public class AddedArtistServlet extends HttpServlet {
    
    private NmeRepository nr;
    
    @Inject
    public AddedArtistServlet(NmeRepository nr){
        this.nr = nr;
    }
    
    public void doPost(HttpServletRequest request,
            HttpServletResponse response) throws IOException, ServletException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        
        int artistId = Integer.parseInt(request.getParameter("artistId"));
        String artistName = request.getParameter("artistName");
        String genre = request.getParameter("genre");
        int sales = Integer.parseInt(request.getParameter("sales"));
        
        nr.addArtist(artistId, artistName, genre, sales);
        
        response.sendRedirect("addedArtist.html");
        
    }
    
    public void doGet(HttpServletRequest request,
            HttpServletResponse response) throws IOException, ServletException{
        List<Artist> artists = nr.findAllArtists();
        request.setAttribute("artist", artists);
        
        RequestDispatcher requestDispatcher = 
                getServletContext().getRequestDispatcher("/addedArtist.jsp");
        requestDispatcher.forward(request, response);
    }
    
}
