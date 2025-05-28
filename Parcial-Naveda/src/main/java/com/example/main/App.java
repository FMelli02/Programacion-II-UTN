package com.example.main;

import com.example.dao.impl.FavoritoDAOImpl;
import com.example.dao.impl.PeliculaDAOImpl;
import com.example.dao.impl.UsuarioDAOImpl;
import com.example.model.Favorito;
import com.example.model.Pelicula;
import com.example.model.Usuario;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class App {
    private static final Logger logger = LogManager.getLogger(App.class);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UsuarioDAOImpl usuarioDAO = new UsuarioDAOImpl();
        PeliculaDAOImpl peliculaDAO = new PeliculaDAOImpl();
        FavoritoDAOImpl favoritoDAO = new FavoritoDAOImpl();

        int opcion;

        do {
            System.out.println("\n====== MENU PRINCIPAL ======");
            System.out.println("\n1. Opciones Usuario\n2. Opciones Peliculas\n3. Opciones Favoritos\n0. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = Integer.parseInt(sc.nextLine());
            try {
                switch (opcion) {
                    case 1 -> {
                        System.out.println("\n====== OPCIONES USUARIOS ======");
                        int opcion2;
                        do {
                            System.out.println("\n1. Agregar Usuario\n2. Obtener Usuario por ID\n3. Obtener Todos los Usuarios\n4. Actualizar Usuario\n5. Eliminar Usuario\n0. Volver al menú principal");
                            System.out.print("Seleccione una opcion: ");
                            opcion2 = Integer.parseInt(sc.nextLine());
                            switch (opcion2) {
                                case 1 -> {
                                    System.out.println("Ingrese el Nombre: ");
                                    String nombre = sc.nextLine();
                                    System.out.println("Ingrese el Email: ");
                                    String email = sc.nextLine();
                                    usuarioDAO.agregar(new Usuario(0, nombre, email));
                                    logger.info("Usuario agregado exitosamente");
                                }
                                case 2 -> {
                                    System.out.println("Ingrese el ID del Usuario: ");
                                    int id = Integer.parseInt(sc.nextLine());
                                    usuarioDAO.obtenerPorId(id);
                                }
                                case 3 -> {
                                    List<Usuario> usuarios = usuarioDAO.obtenerTodos();
                                    if (usuarios.isEmpty()) {
                                        System.out.println("Aún no se han registrado usuarios.");
                                    } else {
                                        System.out.println("Lista de Usuarios: ");
                                        usuarios.forEach(System.out::println);
                                    }
                                }
                                case 4 -> {
                                    System.out.println("Ingrese el ID del Usuario: ");
                                    int id = Integer.parseInt(sc.nextLine());
                                    System.out.println("Ingrese el Nombre nuevo: ");
                                    String nombre = sc.nextLine();
                                    System.out.println("Ingrese el Email nuevo: ");
                                    String email = sc.nextLine();
                                    usuarioDAO.actualizar(new Usuario(id, nombre, email));
                                    logger.info("Usuario actualizado exitosamente");
                                }
                                case 5 -> {
                                    System.out.println("Ingrese el ID del Usuario: ");
                                    int id = Integer.parseInt(sc.nextLine());
                                    usuarioDAO.eliminar(id);
                                    logger.info("Usuario eliminado exitosamente");
                                }
                                case 0 -> {
                                    System.out.println("Volviendo al menú principal...");
                                }
                                default -> {
                                    System.out.println("Opcion invalida");
                                }
                            }
                        } while (opcion2 != 0);
                    }
                    case 2 -> {
                        System.out.println("\n====== OPCIONES PELICULAS ======");
                        int opcion2;
                        do {
                            System.out.println("\n1. Agregar Película\n2. Obtener Película por ID\n3. Obtener Todas las Películas\n4. Actualizar Película\n5. Eliminar Película\n0. Volver al menú principal");
                            System.out.print("Seleccione una opcion: ");
                            opcion2 = Integer.parseInt(sc.nextLine());
                            switch (opcion2) {
                                case 1 -> {
                                    System.out.println("Ingrese el Título: ");
                                    String titulo = sc.nextLine();
                                    System.out.println("Ingrese el Género: ");
                                    String genero = sc.nextLine();
                                    System.out.println("Ingrese la Duración de la película (en minutos): ");
                                    int duracion = Integer.parseInt(sc.nextLine());
                                    System.out.println("Ingrese el Año de lanzamiento: ");
                                    int anio = Integer.parseInt(sc.nextLine());
                                    peliculaDAO.agregar(new Pelicula(0, titulo, genero, duracion, anio));
                                    logger.info("Pelicula agregada exitosamente");
                                }
                                case 2 -> {
                                    System.out.println("Ingrese el ID de la Película: ");
                                    int id = Integer.parseInt(sc.nextLine());
                                    peliculaDAO.obtenerPorId(id);
                                }
                                case 3 -> {
                                    List<Pelicula> peliculas = peliculaDAO.obtenerTodos();
                                    if (peliculas.isEmpty()) {
                                        System.out.println("Aún no se han registrado películas.");
                                    } else {
                                        System.out.println("Lista de Películas: ");
                                        peliculas.forEach(System.out::println);
                                    }
                                }
                                case 4 -> {
                                    System.out.println("Ingrese el ID de la Película: ");
                                    int id = Integer.parseInt(sc.nextLine());
                                    System.out.println("Ingrese el Título nuevo: ");
                                    String titulo = sc.nextLine();
                                    System.out.println("Ingrese el Genero nuevo: ");
                                    String genero = sc.nextLine();
                                    System.out.println("Ingrese la Duración nueva (en minutos): ");
                                    int duracion = Integer.parseInt(sc.nextLine());
                                    System.out.println("Ingrese el nuevo año de lanzamiento: ");
                                    int anio = Integer.parseInt(sc.nextLine());
                                    peliculaDAO.actualizar(new Pelicula(id, titulo, genero, duracion, anio));
                                    logger.info("Película actualizada exitosamente");
                                }
                                case 5 -> {
                                    System.out.println("Ingrese el ID del Usuario: ");
                                    int id = Integer.parseInt(sc.nextLine());
                                    peliculaDAO.eliminar(id);
                                    logger.info("Película eliminada exitosamente");
                                }
                                case 0 -> {
                                    System.out.println("Volviendo al menú principal...");
                                }
                                default -> {
                                    System.out.println("Opcion invalida");
                                }
                            }
                        } while (opcion2 != 0);
                    }
                    case 3 -> {
                        System.out.println("\n====== OPCIONES FAVORITOS ======");
                        int opcion2;
                        do {
                            System.out.println("\n1. Agregar Favorito\n2. Obtener Favoritos Por Usuario\n3. Eliminar Favorito\n0. Volver al menú principal");
                            System.out.print("Seleccione una opcion: ");
                            opcion2 = Integer.parseInt(sc.nextLine());
                            switch (opcion2) {
                                case 1 -> {
                                    System.out.println("Ingrese el ID del Usuario: ");
                                    int idUsuario = Integer.parseInt(sc.nextLine());
                                    System.out.println("Ingrese el ID de la Película: ");
                                    int idPelicula = Integer.parseInt(sc.nextLine());
                                    favoritoDAO.agregarFavorito(new Favorito(idUsuario, idPelicula, LocalDate.now()));
                                    logger.info("Favorito agregado exitosamente");
                                }
                                case 2 -> {
                                    System.out.println("Ingrese el ID del Usuario: ");
                                    int idUsuario = Integer.parseInt(sc.nextLine());
                                    List<Favorito> favoritos = favoritoDAO.obtenerFavoritosPorUsuario(idUsuario);
                                    if (favoritos.isEmpty()) {
                                        System.out.println("El usuario no tiene películas favoritas registradas.");
                                    } else {
                                        System.out.println("Películas Favoritas: ");
                                        favoritos.forEach(System.out::println);
                                    }
                                }
                                case 3 -> {
                                    System.out.println("Ingrese el ID del Usuario: ");
                                    int idUsuario = Integer.parseInt(sc.nextLine());
                                    System.out.println("Ingrese el ID de la Película: ");
                                    int idPelicula = Integer.parseInt(sc.nextLine());
                                    favoritoDAO.eliminarFavorito(idUsuario, idPelicula);
                                    logger.info("Favorito eliminado exitosamente");
                                }
                                case 0 -> {
                                    System.out.println("Volviendo al menú principal...");
                                }
                                default -> {
                                    System.out.println("Opcion invalida");
                                }
                            }
                        } while (opcion2 != 0);
                    }
                    case 0 -> {
                        System.out.println("Saliendo...");
                    }
                    default -> {
                        System.out.println("Opcion inválida");
                    }
                }
            } catch (Exception e) {
                logger.error("Error procesando opción: ",e);
            }
        } while (opcion != 0);

    }
}
