package com.example.dao;

import com.example.model.Favorito;
import java.util.List;

public interface FavoritoDAO {
    void agregarFavorito(Favorito favorito);
    void eliminarFavorito(int idUsuario, int idPelicula);
    List<Favorito> obtenerFavoritosPorUsuario(int idUsuario);
}
