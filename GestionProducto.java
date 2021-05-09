
public class GestionProducto {

    public static void main(String[] args) throws Exception {

        /* System.out.println("Registro de producto");
        System.out.println("---------------------");
        System.out.println("******************************************");
        System.out.println("Registrar el producto"); */

        /* Crear 10 productos */

        Producto producto = new Producto();
        producto.setCodigo("L01");
        producto.setNombre_producto("Leche Gloria");
        producto.setCantidad(5);
        producto.setPrecio(3.5);

        Producto producto1 = new Producto();
        producto1.setCodigo("L02");
        producto1.setNombre_producto("Arroz Costeño");
        producto1.setCantidad(3);
        producto1.setPrecio(5.3);

        Producto producto2 = new Producto();
        producto2.setCodigo("L03");
        producto2.setNombre_producto("Galleta Soda");
        producto2.setCantidad(10);
        producto2.setPrecio(6.4);

        Producto producto3 = new Producto();
        producto3.setCodigo("L04");
        producto3.setNombre_producto("Yogurt");
        producto3.setCantidad(20);
        producto3.setPrecio(5.5);

        Producto producto4 = new Producto();
        producto4.setCodigo("L05");
        producto4.setNombre_producto("Gaseosa Inka Kola");
        producto4.setCantidad(3);
        producto4.setPrecio(7.3);

        Producto producto5 = new Producto();
        producto5.setCodigo("L06");
        producto5.setNombre_producto("Jabón Neko");
        producto5.setCantidad(50);
        producto5.setPrecio(3.2);

        Producto producto6 = new Producto();
        producto6.setCodigo("L07");
        producto6.setNombre_producto("Detergente");
        producto6.setCantidad(23);
        producto6.setPrecio(7.1);

        Producto producto7 = new Producto();
        producto7.setCodigo("L08");
        producto7.setNombre_producto("Shampú");
        producto7.setCantidad(13);
        producto7.setPrecio(10.3);

        Producto producto8 = new Producto();
        producto8.setCodigo("L09");
        producto8.setNombre_producto("Papel toalla");
        producto8.setCantidad(40);
        producto8.setPrecio(2.1);

        Producto producto9 = new Producto();
        producto9.setCodigo("L10");
        producto9.setNombre_producto("Alcohol");
        producto9.setCantidad(110);
        producto9.setPrecio(2.7);

        Producto producto10 = new Producto();
        producto10.setCodigo("L11");
        producto10.setNombre_producto("Azúcar");
        producto10.setCantidad(37);
        producto10.setPrecio(2.2);

        ProductoEspecificaciones productoEspecificaciones = new ProductoEspecificaciones();
        productoEspecificaciones.setAlto(10.10);
        productoEspecificaciones.setAncho(10.10);
        productoEspecificaciones.setLargo(10.10);
        productoEspecificaciones.setPeso(20.10);

        /* Crear 5 Usuarios */

        Usuario usuario = new Usuario();
        usuario.setNombre_usuario("Alejandro");
        usuario.setEdad(59);
        usuario.setDireccion("jiron peru 12");
        usuario.setDistrito("SMP");
        usuario.setProvincia("Lima");
        usuario.setDepartamento("Lima");

        Usuario usuario1 = new Usuario();
        usuario1.setNombre_usuario("Alejo");
        usuario1.setEdad(20);
        usuario1.setDireccion("jiron bolivia 10");
        usuario1.setDistrito("comas");
        usuario1.setProvincia("Lima");
        usuario1.setDepartamento("Lima");
        
        Usuario usuario2 = new Usuario();
        usuario2.setNombre_usuario("Alexander");
        usuario2.setEdad(33);
        usuario2.setDireccion("jiron bolivar 256");
        usuario2.setDistrito("Pueblo Libre");
        usuario2.setProvincia("Lima");
        usuario2.setDepartamento("Lima");

        Usuario usuario3 = new Usuario();
        usuario3.setNombre_usuario("Alberto");
        usuario3.setEdad(35);
        usuario3.setDireccion("jiron callao 156");
        usuario3.setDistrito("Callao");
        usuario3.setProvincia("Callao");
        usuario3.setDepartamento("Callao");

        Usuario usuario4 = new Usuario();
        usuario4.setNombre_usuario("Roberto");
        usuario4.setEdad(40);
        usuario4.setDireccion("jiron brasil 500");
        usuario4.setDistrito("Magdalena");
        usuario4.setProvincia("Lima");
        usuario4.setDepartamento("Lima");


        /* Crear comprobante */
        /* 3 detalle comprobante y 1 comprobante */

        System.out.println("Comprobante");
        System.out.println("---------------------");
        System.out.println("Nombre: "+usuario.getNombre_usuario());
        System.out.println("Dirección: "+usuario.getDireccion()+", "+usuario.getDistrito()+", "+usuario.getProvincia()+", "+ usuario.getDepartamento());
        System.out.println("---------------------");
        System.out.println("\nProductos");

        



        /* Crear Pago */
        /* Vincultar comprobante con el pago --> Al final */
    }
}
