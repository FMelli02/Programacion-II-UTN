package controlador;

import modelo.Autor;
import modelo.Persona;

import java.sql.*;

public class BDControlador {
    public static void guardarPersona(Persona persona) {
        try (Connection con = ConexionBD.conectar()) {
            String sqlPersona = "INSERT INTO persona (dni, nombre) VALUES (?, ?)";
            PreparedStatement ps = con.prepareStatement(sqlPersona, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, persona.getDni());
            ps.setString(2, persona.getNombre());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            int idPersona = 0;
            if (rs.next()) {
                idPersona = rs.getInt(1);
            }

            if (persona instanceof Autor autor) {
                String sqlAutor = "INSERT INTO autor (id, pseudonimo) VALUES (?, ?)";
                PreparedStatement psAutor = con.prepareStatement(sqlAutor);
                psAutor.setInt(1, idPersona);
                psAutor.setString(2, autor.getPseudonimo());
                psAutor.executeUpdate();
            }

            System.out.println("Guardado en BD.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

