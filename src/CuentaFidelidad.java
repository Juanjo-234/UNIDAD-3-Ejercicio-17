public class CuentaFidelidad {
    private String numeroSocio;
    private String nivelMembresia;
    private double puntosAcumulados;

    public CuentaFidelidad(String numeroSocio, String nivelMembresia){
        this.numeroSocio = numeroSocio;
        this.nivelMembresia = nivelMembresia;
        this.puntosAcumulados = 0.0;
    }

    public double getPuntosAcumulados() {
        return puntosAcumulados;
    }

    public String getNumeroSocio() {
        return numeroSocio;
    }

    public String getNivelMembresia() {
        return nivelMembresia;
    }

    public void setNivelMembresia(String nivelMembresia) {
        this.nivelMembresia = nivelMembresia;
    }

    public void setPuntosAcumulados(double puntosAcumulados) {
        this.puntosAcumulados = puntosAcumulados;
    }

    public void setNumeroSocio(String numeroSocio) {
        this.numeroSocio = numeroSocio;
    }

    public void acumularPuntos(double montoCompra){
        if(montoCompra <= 0){
            System.out.println("El monto de la compra debe ser mayor a cero.");
        }else{
            double puntosGanados = montoCompra * 0.1;
            this.puntosAcumulados += puntosGanados;
            System.out.println("Puntos obtenidos de la compra: " + puntosGanados);
        }
    }

    public boolean canjearPremio(int puntosRequeridos) {
        if (puntosRequeridos <= 0) {
            System.out.println("Los puntos requeridos deben ser mayores a cero");
            return false;
        } else {
            if(puntosAcumulados >= puntosRequeridos){
                this.puntosAcumulados -= puntosRequeridos;
                System.out.println("¡Canje exitoso! Se descontaron " + puntosRequeridos + " puntos.");
                return true;
            }else{
                System.out.println("Error: Saldo insuficiente. Tienes " + this.puntosAcumulados +
                        " puntos, pero se requieren " + puntosRequeridos + ".");
                return false;
            }
        }
    }
}
