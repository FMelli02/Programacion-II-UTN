# 🎬 Plataforma de Películas - Proyecto Java por Consola

Aplicación de consola en Java que permite gestionar una plataforma de películas, usuarios y sus favoritos. Se conecta a una base de datos MySQL usando JDBC con pool de conexiones, implementa el patrón DAO, clase genérica, manejo de fechas, y logging avanzado con Log4j2.

---

## 📑 Tabla de Contenidos

- [🚀 Tecnologías Utilizadas](#-tecnologías-utilizadas)
- [📋 Requisitos](#-requisitos)
- [⚙️ Instalación](#-instalación)
- [▶️ Ejecución](#-ejecución)
- [🧩 Estructura del Proyecto](#-estructura-del-proyecto)
- [🛠️ Funcionalidades](#-funcionalidades)
- [🎁 Características Destacadas](#-características-destacadas)
- [📈 Mejoras Futuras](#-mejoras-futuras)
- [🧑‍ Autor](#-autor)

---

## 🚀 Tecnologías Utilizadas

- **Java 17** ☕
- **MySQL** 🐬
- **JDBC** (Java Database Connectivity) 🔌
- **HikariCP** (Pool de Conexiones) 🚰
- **Log4j2** (Logging Avanzado) 📋
- **Gradle** (Gestor de proyectos) 🛠️

---

## 📋 Requisitos

- Java 17+ instalado
- Servidor MySQL corriendo en `localhost:3306`
- Gradle instalado (`gradle -v` para verificar)
- IDE recomendado: IntelliJ IDEA o VSCode

---

## ⚙️ Instalación

1. **Clonar o descargar el repositorio:**
```bash
git clone https://github.com/FMelli02/Programacion-II-UTN/tree/44e7a1cb5e1b83529ed7b9f1f2c440f56a8dace3/Parcial-Naveda
cd Parcial-Naveda
```
2. **Crear la base de datos en MySQL:**
```sql
CREATE DATABASE peliculas_db;
USE peliculas_db;

CREATE TABLE usuario (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL
);

CREATE TABLE pelicula (
    id INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(200) NOT NULL,
    genero VARCHAR(100),
    duracion INT,
    anio INT
);

CREATE TABLE favorito (
    id_usuario INT,
    id_pelicula INT,
    fecha_agregado DATE,
    PRIMARY KEY (id_usuario, id_pelicula),
    FOREIGN KEY (id_usuario) REFERENCES usuario(id),
    FOREIGN KEY (id_pelicula) REFERENCES pelicula(id)
);
```
3. **Configurar conexión a MySQL en ConexionDB.java:**
```java
config.setJdbcUrl("jdbc:mysql://localhost:3306/peliculas_db"); //Asegurate de que la base de datos es la correcta
config.setUsername("root"); //Cambiar usuario si es distinto a "root"
config.setPassword(""); // Cambiar si tenés contraseña
```

---

## ▶️ Ejecución
1. **Desde consola:**
```bash
gradle build
java -cp build/classes/java/main main.App
```
2. **Seguir el menú interactivo de la consola:**
```
====== MENU PRINCIPAL ======

1. Opciones Usuario
2. Opciones Películas
3. Opciones Favoritos
0. Salir
```

---

## 🧩 Estructura del Proyecto
```text
src/
├── com/example
│    ├──dao/                      # Interfaces DAO
│    │   ├── impl/                # Implementaciones DAO
│    │   │    ├── FavoritoDAOImpl.java
│    │   │    ├── PeliculaDAOImpl.java
│    │   │    └── UsuarioDAOImpl.java
│    │   ├── FavoritoDAO.java
│    │   ├── GenericDAO.java
│    │   ├── PeliculaDAO.java
│    │   └── UsuarioDAO.java
│    │
│    ├── main/
│    │   └── App.java             # Menú principal
│    │
│    ├── model/                   # Entidades
│    │   ├── Favorito.java
│    │   ├── Pelicula.java
│    │   └── Usuario.java
│    │
│    └── util/
│        └── ConexionDB.java      # Configuración del pool de conexiones
│
└── resources/
    └── log4j2.xml                # Configuración del logger
```

---

## 🛠️ Funcionalidades
- 👤 Alta, modificación, listado y eliminación de usuarios
- 🎞️ Alta, modificación, listado y eliminación de películas
- ⭐ Asignación de favoritos a usuarios
- 📅 Registro de la fecha en que se agregó un favorito
- 🔍 Visualización de películas favoritas por usuario

---

## 🎁 Características Destacadas
- ✅ **JDBC + MySQL** con conexión robusta (HikariCP)
- 📚 **DAO + GenericDAO<T, ID>** para reducir duplicación de código
- 🧵 **Manejo de excepciones** con mensajes claros
- 🗃️ **Persistencia de fechas** (LocalDate)
- 📦 **Logging profesional** con Log4j2 (consola + archivo)
- 🧱 **Organización en capas**, clara y mantenible

---

## 📈 Mejoras Futuras
- ✅ Validación más estricta de entrada por consola
- 🔄 Implementar transacciones para operaciones complejas
- 📊 Consultas estadísticas (películas más populares)
- 🧪 Pruebas unitarias con JUnit
- 🧾 Documentación técnica con diagramas UML

---

## 🧑‍ Autor
- **Franco Mellimaci** - [@FMelli02](https://github.com/FMelli02)
- **Materia:** Laboratorio de Programación II
- **Profesor:** Claudia Naveda
- **Año:** 2025