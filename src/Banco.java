public class Banco {
    public String nombreBanco;
    private Cuenta cuentas[];
    private int contadorCuentas = 0;

    public Banco (String nombreBanco){
        this.nombreBanco = nombreBanco;
        this.cuentas = new Cuenta[2];
    }

    public void agregarCuenta(Cuenta cuenta) {
        this.cuentas[contadorCuentas] = cuenta;
        contadorCuentas++;
    }

    public void RealizarTransferenciaEntreCuentas(long numCuentaEnvia, double monto, long numCuentaRecibe) {
        for (int i = 0; i < this.cuentas.length; i++) {
            if (this.cuentas[i].numeroDeCuenta == numCuentaEnvia) {
                this.cuentas[i].setRetiro(monto);
            }
            if (this.cuentas[i].numeroDeCuenta == numCuentaRecibe) {
                this.cuentas[i].setIngreso(monto);
            }

        }

    }

    public void ImprimirDatosCuentas(){
        for (int i = 0; i < this.cuentas.length; i++) {
           System.out.println(this.cuentas[i].geDatosCuenta());
        }
    }
}
