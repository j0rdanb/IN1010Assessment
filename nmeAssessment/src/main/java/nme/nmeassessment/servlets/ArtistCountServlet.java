/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nme.nmeassessment.servlets;

import java.io.IOException;
import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import nme.nmeassessment.dao.NmeRepository;

/**
 *
 * @author Jordan Bolton
 */
@WebServlet("/artistCount.html")
public class ArtistCountServlet extends HttpServlet {
    private NmeRepository nr;
    
    @Inject
    public ArtistCountServlet(NmeRepository nr) {
        this.nr = nr;
    }
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Integer artistCount = nr.artistCount();
        request.setAttribute("artistCount", artistCount);
        
        ServletContext servletContext = getServletContext();
        
        RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher("/artistCount.jsp");
        requestDispatcher.forward(request, response);
    }
    
}
