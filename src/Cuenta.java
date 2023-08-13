public class Cuenta {
    public long numeroDeCuenta;
    private String nombreDelTitular;
    private double saldoDeCuenta;

    public Cuenta(String nombreDelTitular, double saldoDeCuenta) {
        this.nombreDelTitular = nombreDelTitular;
        this.saldoDeCuenta = saldoDeCuenta;
        this.numeroDeCuenta = generarNoDeCuenta();
    }

    public void setIngreso(double monto){
        if (monto > 0) {
            this.saldoDeCuenta += monto;
        } else {
            System.out.println("el monto debe ser mayor a 0");
        }
    }

    private boolean consultarSaldo(double saldo){
        if(this.saldoDeCuenta - saldo < 0 ) {
            return false;
        } else {
            return true;
        }
    }

    public void setRetiro(double saldo) {
        if(consultarSaldo(saldo)) {
            this.saldoDeCuenta -= saldo;
        }else {
            System.out.println("saldo insuficiente");
        }
    }

    public double getSaldoDeCuenta() {
        return saldoDeCuenta;
    }

    public String geDatosCuenta(){
        return "No Cuenta: " + this.numeroDeCuenta + " nombre del Titular: " + this.nombreDelTitular + " saldo: " + this.saldoDeCuenta;
    }

    private long generarNoDeCuenta(){
        long numeroCuenta =  (long)(Math.random()*1000000000+1);
        return numeroCuenta;
    }
}
