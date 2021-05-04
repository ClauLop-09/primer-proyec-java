public class Producto {

    private String codigo;
    private String nombre_producto;
    private Integer cantidad;
    private Double precio;
    private ProductoEspecificaciones productoEspecificaciones;
    private String imagen;
    private Boolean activo;

    public Producto(){}

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getNombre_producto() {
        return nombre_producto;
    }
    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }
    public Integer getCantidad() {
        return cantidad;
    }
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    public Double getPrecio() {
        return precio;
    }
    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    public ProductoEspecificaciones getProductoEspecificaciones() {
        return productoEspecificaciones;
    }
    public void setProductoEspecificaciones(ProductoEspecificaciones productoEspecificaciones) {
        this.productoEspecificaciones = productoEspecificaciones;
    }
    public String getImagen() {
        return imagen;
    }
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    public Boolean getActivo() {
        return activo;
    }
    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public void modificarProducto(String nombre_producto){

        this.nombre_producto = "**"+nombre_producto+"**";
    }

    
}
