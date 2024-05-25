package cuentas;

/**
 * La clase CCuenta representa una cuenta bancaria con atributos como nombre, número de cuenta, saldo y tipo de interés.
 * Permite realizar operaciones como ingreso y retiro de dinero.
 * 
 * @author kevin 
 * @version 1.0
 * @since 2024-05-25
 */
public class CCuenta {

    private String nombre; // Nombre del titular de la cuenta
    private String cuenta; // Número de cuenta
    private double saldo; // Saldo actual de la cuenta
    private double tipoInterés; // Tipo de interés de la cuenta

    /**
     * Constructor por defecto de la clase CCuenta.
     */
    public CCuenta() {
    }

    /**
     * Constructor con parámetros de la clase CCuenta.
     * 
     * @param nom    Nombre del titular de la cuenta.
     * @param cue    Número de cuenta.
     * @param sal    Saldo inicial de la cuenta.
     * @param tipo   Tipo de interés de la cuenta.
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
        tipoInterés = tipo;
    }

    /**
     * Método para obtener el estado actual de la cuenta.
     * 
     * @return El saldo actual de la cuenta.
     */
    public double estado() {
        return getSaldo();
    }

    /**
     * Método para realizar una retirada de dinero de la cuenta.
     * 
     * @param cantidad La cantidad a retirar.
     */
    public void retirar(double cantidad) {
        try {
            System.out.println("Retiro en cuenta:" + cantidad);
            if (cantidad <= 0) {
                throw new Exception("No se puede retirar una cantidad negativa");
            }
            if (estado() < cantidad) {
                throw new Exception("No se hay suficiente saldo");
            }
            setSaldo(getSaldo() - cantidad);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /**
     * Método para realizar un ingreso de dinero en la cuenta.
     * 
     * @param cantidad La cantidad a ingresar.
     */
    public void ingresar(double cantidad) {
        try {
            System.out.println("Ingreso en cuenta:" + cantidad);

            if (cantidad < 0) {
                throw new Exception("No se puede ingresar una cantidad negativa");
            }
            setSaldo(getSaldo() + cantidad);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /**
     * Método principal del programa para probar la clase CCuenta.
     * 
     * @param args Los argumentos de la línea de comandos (no utilizados en este caso).
     */
    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;
        cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es " + saldoActual);
        operaciones(cuenta1);

        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es " + saldoActual);
    }

    /**
     * Método para realizar operaciones de ingreso y retiro en la cuenta.
     * 
     * @param cuenta1 La cuenta en la que se realizarán las operaciones.
     */
    private static void operaciones(CCuenta cuenta1) {
        // Operaciones de ingreso y retiro
        cuenta1.retirar(2300);
        cuenta1.ingresar(685);
    }

    /**
     * Método para obtener el nombre del titular de la cuenta.
     * 
     * @return El nombre del titular de la cuenta.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para establecer el nombre del titular de la cuenta.
     * 
     * @param nombre El nombre del titular de la cuenta.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para obtener el número de cuenta.
     * 
     * @return El número de cuenta.
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Método para establecer el número de cuenta.
     * 
     * @param cuenta El número de cuenta.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Método para obtener el saldo actual de la cuenta.
     * 
     * @return El saldo actual de la cuenta.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Método para establecer el saldo actual de la cuenta.
     * 
     * @param saldo El saldo actual de la cuenta.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Método para obtener el tipo de interés de la cuenta.
     * 
     * @return El tipo de interés de la cuenta.
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Método para establecer el tipo de interés de la cuenta.
     * 
     * @param tipoInterés El tipo de interés de la cuenta.
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
