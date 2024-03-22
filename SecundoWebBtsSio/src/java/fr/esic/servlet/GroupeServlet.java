/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.esic.servlet;

import fr.esic.dao.EtudiantDao;
import fr.esic.dao.GroupeDao;
import fr.esic.model.Etudiant;
import fr.esic.model.Groupe;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author filia
 */
@WebServlet(name = "GroupeServlet", urlPatterns = {"/groupe"})
public class GroupeServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet GroupeServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet GroupeServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         HttpSession session = request.getSession(true);
         Etudiant verifsicreateur = (Etudiant) session.getAttribute("userConnect");
         int idgroupe = Integer.parseInt(request.getParameter("idGroupe")) ;
         try {
            GroupeDao.deleteGroupe(new Groupe(idgroupe ,"", verifsicreateur));
            response.sendRedirect("connecte");
        } catch (Exception e) {
             PrintWriter out = response.getWriter();
             out.print("Exception " + e.getMessage());
        }
       
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         HttpSession session = request.getSession(true);
         Etudiant createur = (Etudiant) session.getAttribute("userConnect");
         String nomgroupe = request.getParameter("nomgroupe");
        
            try {
                GroupeDao.createGroup(new Groupe(0, nomgroupe, createur));
                //request.getRequestDispatcher("connecte.jsp").forward(request, response);
                response.sendRedirect("connecte");
            } catch (Exception e) {
                PrintWriter out = response.getWriter();
                out.print("Exception " + e.getMessage());
            }
            
            
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
