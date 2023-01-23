package api.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import api.models.Request;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/api/requests")
public class RequestController extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json;charset=utf-8");
        PrintWriter out = resp.getWriter();
        Request solicitud = new Request("Diego", 0, "Partido liga", "acreditacion fotografo");
       
        out.println(solicitud);
        }
        
    }
    
    
