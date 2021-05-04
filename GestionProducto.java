
public class GestionProducto {

    public static void main(String[] args) throws Exception {

        System.out.println("Registro de producto");
        System.out.println("---------------------");
        System.out.println("******************************************");
        System.out.println("Registrar el producto");

        /* Crear 10 productos */

        Producto producto = new Producto();
        producto.setCodigo("L01");
        producto.setNombre_producto("Leche Gloria");
        producto.setCantidad(5);
        producto.setPrecio(3.5);

        ProductoEspecificaciones productoEspecificaciones = new ProductoEspecificaciones();
        productoEspecificaciones.setAlto(10.10);
        productoEspecificaciones.setAncho(10.10);
        productoEspecificaciones.setLargo(10.10);
        productoEspecificaciones.setPeso(20.10);

        /* Crear 5 Usuarios */

        /* Crear comprobante */
        /* 3 detalle comprobante y 1 comprobante */

        /* Crear Pago */
        /* Vincultar comprobante con el pago --> Al final */
    }
}
