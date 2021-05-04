public class FormaPago {
    
    private Comprobante comprobante;
    private Boolean debito_credito;
    private Integer numero_tarjeta;

    public FormaPago(){}

    public Comprobante getComprobante() {
        return comprobante;
    }
    public void setComprobante(Comprobante comprobante) {
        this.comprobante = comprobante;
    }
    public Boolean getDebito_credito() {
        return debito_credito;
    }
    public void setDebito_credito(Boolean debito_credito) {
        this.debito_credito = debito_credito;
    }
    public Integer getNumero_tarjeta() {
        return numero_tarjeta;
    }
    public void setNumero_tarjeta(Integer numero_tarjeta) {
        this.numero_tarjeta = numero_tarjeta;
    }
   
    
}
