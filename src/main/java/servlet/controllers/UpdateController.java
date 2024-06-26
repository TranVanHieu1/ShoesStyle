/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlet.controllers;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import servlet.registration.objects.Account;
import servlet.utility.RegistrationDAO;

/**
 *
 * @author Dell
 */
public class UpdateController extends HttpServlet {

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
        Account acc = (Account) request.getSession().getAttribute("UserAccount");
        String phone = request.getParameter("updPhone");
        String address = request.getParameter("updAddress");
        
        RequestDispatcher rd = request.getRequestDispatcher("account.jsp");
        RegistrationDAO dao = new RegistrationDAO();
        
        if (phone.matches("[0-9]{10,12}") && address.matches("[^\'\"\\?<>!$%^&*]+")) {
            try {
                if (dao.updateUser(acc.getStrUsername(), phone, address)) {
                    acc.setStrAddress(address);
                    acc.setStrPhonenumber(phone);
                    request.setAttribute("UpdateNoti", "success");
                }
                else {
                    request.setAttribute("UpdateNoti", "fail");
                }
            } catch (SQLException ex) {
                Logger.getLogger(UpdateController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else {
            request.setAttribute("UpdateNoti", "fail");
        }
        rd.forward(request, response);
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
        processRequest(request, response);
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
        processRequest(request, response);
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
