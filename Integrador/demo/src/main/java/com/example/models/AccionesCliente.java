package com.example.models;

import com.example.models.Cliente;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AccionesCliente {
    public static int registrarCliente(Cliente c) {
        int estado = 0;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "");

            String query = "INSERT INTO cliente (nombre, apellido, contacto) VALUES (?,?,?)";

           
            String nombre = c.getNombre();
            String apellido = c.getApellido();
            String contacto = c.getContacto();

            PreparedStatement pst = conexion.prepareStatement(query);
            
            pst.setString(1, nombre);
            pst.setString(2, apellido);
            pst.setString(3, contacto);

            estado = pst.executeUpdate();

            conexion.close();

        } catch (Exception e) {
            System.out.println("Uppsss algo salio mal");

        }
        return estado;

    }


    public static Cliente verCliente(int idAConsultar) {
        Cliente clienteADevolver = new Cliente();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "");

            String query = "SELECT * FROM cliente WHERE id_cliente=?";

            PreparedStatement pst = conexion.prepareStatement(query);

            pst.setInt(1, idAConsultar);

            ResultSet consultaCliente = pst.executeQuery();

            if (consultaCliente.next()) {
                clienteADevolver.setId(consultaCliente.getInt(1));
                clienteADevolver.setNombre(consultaCliente.getString(2));
                clienteADevolver.setApellido(consultaCliente.getString(3));
                clienteADevolver.setContacto(consultaCliente.getString(4));
                conexion.close();
            }

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Uppsss algo salio mal");

        }
        
        return clienteADevolver;
    }
        
}
