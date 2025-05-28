package com.example.dao.impl;

import com.example.dao.PeliculaDAO;
import com.example.model.Pelicula;
import com.example.util.ConexionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PeliculaDAOImpl implements PeliculaDAO {
    @Override
    public void agregar(Pelicula pelicula) {
        String sql = "INSERT INTO pelicula (titulo, genero, duracion, anio) VALUES (?, ?, ?, ?)";
        try (Connection conn = ConexionDB.getConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, pelicula.getTitulo());
            stmt.setString(2, pelicula.getGenero());
            stmt.setInt(3, pelicula.getDuracion());
            stmt.setInt(4, pelicula.getAnio());
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error al agregar la película: " + e.getMessage());
        }
    }

    @Override
    public Pelicula obtenerPorId(Integer id) {
        String sql = "SELECT * FROM pelicula WHERE id = ?";
        try (Connection conn = ConexionDB.getConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                Pelicula pelicula = new Pelicula(
                        rs.getInt("id"),
                        rs.getString("titulo"),
                        rs.getString("genero"),
                        rs.getInt("duracion"),
                        rs.getInt("anio")
                );
                System.out.println(pelicula);
                return pelicula;
            } else {
                System.out.println("No se encontró una película con el ID: " + id);
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener la película por ID: " + e.getMessage());
        }
        return null;
    }

    @Override
    public List<Pelicula> obtenerTodos() {
        List<Pelicula> lista = new ArrayList<>();
        String sql = "SELECT * FROM pelicula";
        try (Connection conn = ConexionDB.getConexion();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                lista.add(new Pelicula(
                        rs.getInt("id"),
                        rs.getString("titulo"),
                        rs.getString("genero"),
                        rs.getInt("duracion"),
                        rs.getInt("anio")
                ));
            }
        } catch (SQLException e) {
            System.err.println("Error al listar las películas: " + e.getMessage());
        }
        return lista;
    }

    @Override
    public void actualizar(Pelicula pelicula) {
        String sql = "UPDATE pelicula SET titulo = ?, genero = ?, duracion = ?, anio = ? WHERE id = ?";
        try (Connection conn = ConexionDB.getConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, pelicula.getTitulo());
            stmt.setString(2, pelicula.getGenero());
            stmt.setInt(3, pelicula.getDuracion());
            stmt.setInt(4, pelicula.getAnio());
            stmt.setInt(5, pelicula.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error al actualizar la película: " + e.getMessage());
        }
    }

    @Override
    public void eliminar(Integer id) {
        String sql = "DELETE FROM pelicula WHERE id = ?";
        try (Connection conn = ConexionDB.getConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error al eliminar la película: " + e.getMessage());
        }
    }
}
