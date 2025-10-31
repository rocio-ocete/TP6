public class MainStock {
    public static void main(String[] args) {
        Inventario inv = new Inventario();

        
        inv.agregarProducto(new Producto("P01", "Pan", 500, 30, CategoriaProducto.ALIMENTOS));
        inv.agregarProducto(new Producto("P02", "Televisor", 250000, 10, CategoriaProducto.ELECTRONICA));
        inv.agregarProducto(new Producto("P03", "Remera", 1500, 40, CategoriaProducto.ROPA));
        inv.agregarProducto(new Producto("P04", "Sillon", 45000, 5, CategoriaProducto.HOGAR));
        inv.agregarProducto(new Producto("P05", "Notebook", 350000, 8, CategoriaProducto.ELECTRONICA));

  
        inv.listarProductos();

        System.out.println("\n Buscando producto P03:");
        Producto buscado = inv.buscarProductoPorId("P03");
        if (buscado != null) buscado.mostrarInfo();

        inv.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);

        inv.eliminarProducto("P01");
        inv.listarProductos();

        inv.actualizarStock("P03", 100);

        System.out.println("\n Total de unidades en stock: " + inv.obtenerTotalStock());

        System.out.println("\n Producto con mayor stock:");
        inv.obtenerProductoConMayorStock().mostrarInfo();

        inv.filtrarProductosPorPrecio(1000, 3000);

        inv.mostrarCategoriasDisponibles();
    }
}
