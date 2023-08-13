// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("Juan Pablo", 30000);
        Cuenta cuenta2 = new Cuenta("Maria", 60000);

        Banco banco1 = new Banco("BBVA");
        banco1.agregarCuenta(cuenta1);
        banco1.agregarCuenta(cuenta2);
        banco1.ImprimirDatosCuentas();

        System.out.println("transferencia realizada");
        banco1.RealizarTransferenciaEntreCuentas(cuenta1.numeroDeCuenta, 5000, cuenta2.numeroDeCuenta);
        banco1.ImprimirDatosCuentas();
    
    }
}