# Trabajo Practico 6 - Programacion II
## Colecciones, Enumeraciones y Relaciones entre Clases

Este repositorio contiene el desarrollo del **Trabajo Practico 6** de la materia **Programacion II** de la **Tecnicatura Universitaria en Programacion** de la **UTN (A Distancia)**.

El objetivo del trabajo es aplicar conceptos de Programacion Orientada a Objetos en Java mediante el uso de **ArrayList**, **enumeraciones (enum)** y **relaciones entre clases** (1 a N y bidireccionales).

---

## Contenido del proyecto

### 1. Sistema de Stock
Implementa un sistema de inventario de productos organizados por categorias.

**Clases:**
- `Producto`: representa un producto con id, nombre, precio, cantidad y categoria.
- `CategoriaProducto`: enumeracion con categorias predefinidas.
- `Inventario`: gestiona los productos y operaciones del stock.
- `MainStock`: clase principal con pruebas de funcionamiento.

**Funciones:**
- Agregar, listar, buscar y eliminar productos.
- Filtrar por categoria o rango de precios.
- Calcular el total de stock disponible.
- Mostrar el producto con mayor stock.
- Mostrar categorias disponibles con sus descripciones.

---

### 2. Biblioteca y Libros
Sistema que gestiona libros y autores dentro de una biblioteca.

**Clases:**
- `Autor`: contiene datos basicos del autor.
- `Libro`: representa un libro con su autor asociado.
- `Biblioteca`: administra la coleccion de libros.
- `MainBiblioteca`: clase de pruebas del sistema.

**Funciones:**
- Agregar libros y asociarlos a autores.
- Listar libros disponibles.
- Buscar libros por ISBN.
- Filtrar por anio de publicacion.
- Eliminar libros del catalogo.
- Calcular cantidad total de libros.
- Listar autores disponibles.

---

### 3. Universidad, Profesor y Curso
Sistema academico que modela una relacion bidireccional entre profesores y cursos.  
Cada profesor dicta uno o varios cursos, y cada curso tiene exactamente un profesor responsable.

**Clases:**
- `Profesor`: almacena los datos del profesor y sus cursos.
- `Curso`: representa un curso y su profesor asignado.
- `Universidad`: administra profesores, cursos y sus relaciones.
- `MainUniversidad`: clase principal de pruebas.

**Funciones:**
- Alta y baja de profesores y cursos.
- Asignacion y reasignacion de profesores a cursos.
- Listar profesores y cursos.
- Eliminar profesores o cursos sin romper la relacion.
- Generar reporte de cantidad de cursos por profesor.

** Ocete Rocio Milagros **
Alumna de la UTN - Tecnicatura Universitaria en Programacion (Modalidad a Distancia)

GitHub: rocio-ocete
