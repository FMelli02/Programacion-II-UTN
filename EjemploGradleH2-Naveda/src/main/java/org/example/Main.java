package org.example;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Connection conn = null;
        try {
            // Establecer la conexión a la base de datos
            conn = DatabaseManager.getConnection(); // Asumiendo que tienes un método getConnection()

            // Crear la tabla
            DatabaseManager.createTable(conn);

            // Insertar una persona
            Persona persona = new Persona(1, "Juan Pérez");
            DatabaseManager.insertPersona(persona);

            System.out.println("Persona insertada correctamente.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        } finally {
            // Cerrar la conexión en el bloque finally para asegurar que se cierre incluso si ocurre una excepción
            if (conn != null) {
                try {
                    conn.close();
                    System.out.println("Conexión cerrada exitosamente.");
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}