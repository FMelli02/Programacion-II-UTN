package com.example.dao.impl;

import com.example.dao.FavoritoDAO;
import com.example.model.Favorito;
import com.example.util.ConexionDB;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FavoritoDAOImpl implements FavoritoDAO {
    @Override
    public void agregarFavorito(Favorito favorito) {
        String sql = "INSERT INTO favorito (id_usuario, id_pelicula, fecha_agregado) VALUES (?,?,?)";
        try (Connection conn = ConexionDB.getConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, favorito.getIdUsuario());
            stmt.setInt(2, favorito.getIdPelicula());
            stmt.setDate(3, Date.valueOf(favorito.getFechaAgregado()));
            stmt.executeUpdate();
            System.out.println("Favorito agregado correctamente.");
        } catch (SQLException e) {
            System.err.println("Error al agregar favorito: " + e.getMessage());
        }
    }

    @Override
    public void eliminarFavorito(int idUsuario, int idPelicula) {
        String sql = "DELETE FROM favorito WHERE id_usuario = ? AND id_pelicula = ?";
        try (Connection conn = ConexionDB.getConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, idUsuario);
            stmt.setInt(2, idPelicula);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error al eliminar favorito: " + e.getMessage());
        }
    }

    @Override
    public List<Favorito> obtenerFavoritosPorUsuario(int idUsuario) {
        List<Favorito> lista = new ArrayList<>();
        String sql = "SELECT * FROM favorito WHERE id_usuario = ?";
        try (Connection conn = ConexionDB.getConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, idUsuario);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Favorito f = new Favorito(
                        rs.getInt("id_usuario"),
                        rs.getInt("id_pelicula"),
                        rs.getDate("fecha_agregado").toLocalDate()
                );
                lista.add(f);
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener favoritos: " + e.getMessage());
        }
        return lista;
    }
}
