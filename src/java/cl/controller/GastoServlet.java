/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.controller;

import cl.modell.Gasto;
import cl.modell.Registro;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author rodo
 */
@WebServlet(name = "GastoServlet", urlPatterns = {"/GastoServlet.do"})
public class GastoServlet extends HttpServlet {

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
     
        String cuenta, fechaPago, montoPago, empresa, formaPago;
        ArrayList<String> errores = new ArrayList(); 
        
        cuenta = request.getParameter("cuenta");
        fechaPago = request.getParameter("fechaPago");
        montoPago = request.getParameter("montoPago");
        empresa = request.getParameter("empresa");
        formaPago = request.getParameter("formaPago");
        
        if (cuenta.isEmpty()) {
            errores.add("Debe seleccionar cuenta");
        }
        
        if (fechaPago.isEmpty()) {
            errores.add("Debe seleccionar fecha de Pago");                        
        }
        
        if (montoPago.isEmpty()) {
            errores.add("Debe ingresar un monto de pago");                        
        }
        
        if (empresa.isEmpty()) {
            errores.add("Debe ingresar una empresa");            
        }
        
        if (formaPago.isEmpty()) {
            errores.add("Debe ingresar una forma de pago");
        }
        
        if (!montoPago.matches("^[0-9]*")) {
            errores.add("Monto debe ser numerico");
        }
        
        if (!empresa.matches("^[a-zA-Z ]*")) {
             errores.add("Empresa debe ser solo letras");
        }
        
        if (errores.isEmpty()) {
            ServletContext app = request.getServletContext();
            Gasto gasto = new Gasto(cuenta, fechaPago, montoPago, empresa, formaPago);
            Registro reg = (Registro) app.getAttribute("registro");
            if (reg == null) {
                reg = new Registro();
                app.setAttribute("registro", reg);
            }
            reg.getLstGasto().add(gasto);
            RequestDispatcher despachador = request.getRequestDispatcher("/listar.jsp");
            despachador.forward(request, response);
        }else{
            request.setAttribute("errores", errores);
            RequestDispatcher errorDesp = request.getRequestDispatcher("ingresar.jsp");
            errorDesp.forward(request, response);
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
