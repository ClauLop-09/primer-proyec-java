public class Comprobante {

    private Usuario usuario;
    private ComprobanteDetalle comprobanteDetalle;
    private Double Monto;

    public Comprobante(){}

    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public ComprobanteDetalle getComprobanteDetalle() {
        return comprobanteDetalle;
    }
    public void setComprobanteDetalle(ComprobanteDetalle comprobanteDetalle) {
        this.comprobanteDetalle = comprobanteDetalle;
    }
    public Double getMonto() {
        return Monto;
    }
    public void setMonto(Double monto) {
        Monto = monto;
    }
   
     
}
