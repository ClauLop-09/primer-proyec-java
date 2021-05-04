public class ComprobanteDetalle {

    private Producto producto;
    private Integer cantidad_compra;

    public ComprobanteDetalle() {
    }

    public Producto getProducto() {
        return this.producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Integer getCantidad_compra() {
        return this.cantidad_compra;
    }

    public void setCantidad_compra(Integer cantidad_compra) {
        this.cantidad_compra = cantidad_compra;
    }

    // multiplcacion entre Precio y cantida_compra//
    public Double getSubTotal() {
        return this.cantidad_compra * this.producto.getPrecio();
    }

}