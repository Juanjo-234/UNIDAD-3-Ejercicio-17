//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
CuentaFidelidad miCuenta = new CuentaFidelidad("SOC-88214", "Platino");

System.out.println("Registrando compras");
miCuenta.acumularPuntos(2000.0);
miCuenta.acumularPuntos(1500.0);
System.out.println("Total de puntos actual: " + miCuenta.getPuntosAcumulados());

System.out.println("Intento de canje 1 (Premio costoso: 300 puntos):");
miCuenta.canjearPremio(300);

    System.out.println("Intento de canje 2 (Premio accesible: 120 puntos):");
    miCuenta.canjearPremio(120);
}
