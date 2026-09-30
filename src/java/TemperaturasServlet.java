/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class TemperaturasServlet extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet TemperaturasServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet TemperaturasServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        double temperatura = Double.parseDouble(
                request.getParameter("temperatura")
        );

        String conversion = request.getParameter("conversion");

        double resultado = 0;
        String textoConversion = "";

        switch (conversion) {

            case "CF":
                resultado = (temperatura * 9 / 5) + 32;
                textoConversion = "Celsius a Fahrenheit";
                break;

            case "FC":
                resultado = (temperatura - 32) * 5 / 9;
                textoConversion = "Fahrenheit a Celsius";
                break;

            case "CK":
                resultado = temperatura + 273.15;
                textoConversion = "Celsius a Kelvin";
                break;

            case "KC":
                resultado = temperatura - 273.15;
                textoConversion = "Kelvin a Celsius";
                break;
        }

        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Resultado</title>");
        out.println("</head>");

        out.println("<body>");

        out.println("<h2>Conversión de Temperatura</h2>");

        out.println("<p>Conversión: " + textoConversion + "</p>");
        out.println("<p>Temperatura ingresada: " + temperatura + "</p>");
        out.println("<p>Resultado: " + resultado + "</p>");

        out.println("<br>");
        out.println("<a href='" + request.getContextPath() + "/temperaturas.html'>Volver</a>");

        out.println("</body>");
        out.println("</html>");
    }
}
