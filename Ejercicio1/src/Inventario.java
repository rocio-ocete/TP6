import java.util.ArrayList;

public class Inventario {
    private ArrayList<Producto> productos;

    public Inventario() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public void listarProductos() {
        System.out.println("\n Listado de productos:");
        for (Producto p : productos) {
            p.mostrarInfo();
        }
    }

    public Producto buscarProductoPorId(String id) {
        for (Producto p : productos) {
            if (p.getId().equalsIgnoreCase(id)) return p;
        }
        return null;
    }

    public void eliminarProducto(String id) {
        Producto encontrado = buscarProductoPorId(id);
        if (encontrado != null) {
            productos.remove(encontrado);
            System.out.println(" Producto eliminado: " + id);
        } else {
            System.out.println(" Producto no encontrado.");
        }
    }

    public void actualizarStock(String id, int nuevaCantidad) {
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            p.setCantidad(nuevaCantidad);
            System.out.println(" Stock actualizado.");
        } else {
            System.out.println(" Producto no encontrado.");
        }
    }

    public void filtrarPorCategoria(CategoriaProducto categoria) {
        System.out.println("\n Productos en categoria: " + categoria);
        for (Producto p : productos) {
            if (p.getCategoria() == categoria)
                p.mostrarInfo();
        }
    }

    public int obtenerTotalStock() {
        int total = 0;
        for (Producto p : productos)
            total += p.getCantidad();
        return total;
    }

    public Producto obtenerProductoConMayorStock() {
        if (productos.isEmpty()) return null;
        Producto max = productos.get(0);
        for (Producto p : productos)
            if (p.getCantidad() > max.getCantidad()) max = p;
        return max;
    }

    public void filtrarProductosPorPrecio(double min, double max) {
        System.out.println("\n Productos con precio entre $" + min + " y $" + max + ":");
        for (Producto p : productos)
            if (p.getPrecio() >= min && p.getPrecio() <= max)
                p.mostrarInfo();
    }

    public void mostrarCategoriasDisponibles() {
        System.out.println("\n Categorias disponibles:");
        for (CategoriaProducto c : CategoriaProducto.values()) {
            System.out.println(c.name() + " → " + c.getDescripcion());
        }
    }
}
