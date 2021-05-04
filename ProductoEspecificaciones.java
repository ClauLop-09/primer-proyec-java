
public class ProductoEspecificaciones{
    private Double peso;
    private Double alto;
    private Double largo;
    private Double ancho;

    public ProductoEspecificaciones(){
    }

    public ProductoEspecificaciones(Double alto, Double ancho){
        this.alto = alto;
        this.ancho = ancho;
    }

    public Double calcularAreaProducto(){
        return this.ancho * this.alto;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAlto() {
        return alto;
    }

    public void setAlto(Double alto) {
        this.alto = alto;
    }

    public Double getLargo() {
        return largo;
    }

    public void setLargo(Double largo) {
        this.largo = largo;
    }

    public Double getAncho() {
        return ancho;
    }

    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }
    
}