package com.example.dao;

import java.util.List;

public interface GenericDAO<T,ID>{
    void agregar(T entidad);
    T obtenerPorId(ID id);
    List<T> obtenerTodos();
    void actualizar(T entidad);
    void eliminar(ID id);
}
