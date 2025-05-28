# 📚 Proyecto Java MVC: Registro de Personas y Autores

Este proyecto es una aplicación de escritorio Java desarrollada bajo el patrón de diseño **MVC (Modelo - Vista - Controlador)**, que permite registrar personas y autores en una base de datos MySQL mediante una interfaz gráfica construida con Swing.

---

## 📋 Tabla de Contenidos

- [🛠 Tecnologías Utilizadas](#-tecnologías-utilizadas)
- [📦 Requisitos](#-requisitos)
- [⚙️ Instalación](#️-instalación)
- [🚀 Ejecución](#-ejecución)
- [📁 Estructura del Proyecto](#-estructura-del-proyecto)
- [🔍 Funcionalidades](#-funcionalidades)
- [✨ Características Destacadas](#-características-destacadas)
- [🔮 Mejoras Futuras](#-mejoras-futuras)
- [🏫 Cátedra](#-cátedra)
- [👨‍💻 Autor](#-autor)

---

## 🛠 Tecnologías Utilizadas

- **Java 17**
- **Swing** para la interfaz gráfica
- **MySQL** como sistema de gestión de base de datos
- **JDBC** para la conexión con la base de datos
- **Gradle** como sistema de construcción
- **Patrón de diseño MVC**

---

## 📦 Requisitos

- **Java JDK 17 o superior**
- **MySQL Server** (preferentemente versión 8.0 o superior)
- **Gradle** (o usar el wrapper incluido)
- **IDE recomendado:** IntelliJ IDEA / NetBeans / Eclipse

---

## ⚙️ Instalación

1. **Clonar el repositorio:**

```bash
git clone https://github.com/FMelli02/Programacion-II-UTN/tree/bc8ecdc15926c0664425e728122ae6fa18914db4/Parcial2-Java-Domizio
cd Parcial2-Java-Domizio
```
2. **Configurar la base de datos:**

```sql
CREATE DATABASE biblioteca;
USE biblioteca;

CREATE TABLE persona (
    id INT AUTO_INCREMENT PRIMARY KEY,
    dni INT NOT NULL,
    nombre VARCHAR(100) NOT NULL
);

CREATE TABLE autor (
    id INT PRIMARY KEY,
    pseudonimo VARCHAR(100),
    FOREIGN KEY (id) REFERENCES persona(id)
);
```
3. **Configurar credenciales de conexión:**

Edita el archivo ConexionBD.java en el paquete controlador y asegúrate de que las credenciales coincidan con tu entorno:

```java
private static final String URL = "jdbc:mysql://localhost:3306/biblioteca"; //Corrobora que el nombre en la BD coincide con la ingresada
private static final String USER = "root"; //Si usas otro usuario cambia "root" por tu usuario
private static final String PASSWORD = ""; //Si usas contraseña agrega la contraseña que utilizas
```

---

## 🚀 Ejecución
Desde la raíz del proyecto, ejecuta:

```bash
./gradlew run
```
O abre el proyecto en tu IDE y ejecuta la clase vista.Formulario.

---

## 📁 Estructura del Proyecto
```bash
src/
├── controlador/        # Controladores para lógica de negocio y base de datos
│   ├── BDControlador.java
│   ├── ConexionBD.java
│   └── PersonaControlador.java
├── modelo/             # Clases del modelo de dominio
│   ├── Persona.java
│   └── Autor.java
├── vista/              # Interfaz gráfica del usuario
│   ├── Estilos.java
│   └── Formulario.java
build.gradle            # Configuración del proyecto Gradle
README.md               # Documentación del proyecto
```

---

## 🔍 Funcionalidades
- Registrar una persona con DNI y nombre
- Registrar un autor con DNI, nombre y pseudónimo
- Validación de nombre (no permite números ni símbolos)
- Inserción automática en tablas relacionadas (persona y autor)
- Interfaz amigable y responsive usando Swing
- Botón de cierre que finaliza correctamente el programa

---

## ✨ Características Destacadas
- ✅ Aplicación estructurada con el patrón MVC
- 🎨 Interfaz estilizada con colores definidos y fuente personalizada
- 🛡 Validaciones integradas para mejorar integridad de datos
- 🧩 Extensible a otras entidades (como libros, géneros, etc.)
- 🖥 Proyecto autoejecutable con Gradle

---

## 🔮 Mejoras Futuras
- Agregar funcionalidad para listar y buscar personas/autores
- Implementar actualizaciones y eliminación de registros (CRUD completo)
- Internacionalización (idiomas)
- Exportar datos a PDF o Excel
- Conexión externa a servidor MySQL remoto
- Añadir pruebas unitarias con JUnit

---

## 🏫 Cátedra

- **Materia: Programacion II**
- **Profesor: Cristina Domizio**
- **Ciclo Lectivo: 2025**

---

## 👨‍💻 Autores

- **Juan Ignacio Sarmiento**
- **Lautaro Salinas**
- **Ignacio Gomez**
- **Franco Mellimaci**

📍 Estudiantes de la Tecnicatura Universitaria en Programación - UTN, Mendoza, Argentina