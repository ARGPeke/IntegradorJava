package com.example.Servlets;

import java.io.IOException;

import com.example.models.AccionesCliente;
import com.example.models.Cliente;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/nuevocliente")

public class InsertarServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String n , a , c;

        n = req.getParameter("Nombre");

        a = req.getParameter("Apellido");

        c = req.getParameter("Contacto");

        Cliente nuevoCliente = new Cliente();

        nuevoCliente.setNombre(n);
        nuevoCliente.setApellido(a);
        nuevoCliente.setContacto(c);

        int estado = AccionesCliente.registrarCliente(nuevoCliente);

        if (estado == 1) {
            resp.sendRedirect("exito.jsp");
        } else {
            
            resp.sendRedirect("error.jsp");
        }


    }
}
