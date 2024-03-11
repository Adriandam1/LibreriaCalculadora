package libreriacod;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * Libreria para pedir numeros y 
 * hacer operacion con ellos 
 * (suma/resta/multiplicacion/division)
 * @author Adrian
 */
public class EntradaSalida {
        
    private static Scanner sc = new Scanner(System.in); 
    
    /**
     * Metodo para obtener un numero solicitado desde la consola.
     * @param mensaje El mensaje a mostrar antes de solicitar la entrada.
     * @return numero obtenido desde la consola.
     */
    public static float obtenerNumero(String mensaje) {
       System.out.print(mensaje);
        return sc.nextFloat();
    }
     /**
     * Método para recojer la operación a realizar desde la consola.
     * @param mensaje El mensaje a mostrar antes de solicitar la entrada.
     * @return La operacion obtenida desde la consola.
     */
    public static String obtenerOperacion(String mensaje) {
        System.out.print(mensaje);
        return sc.next();
    }
        /**
     * Método para mostrar el resultado en la consola.
     * @param resultado El resultado a mostrar en la consola.
     * si el resultado null nos indica un mensaje de error
     */
    public static void mostrarResultado(Float resultado) {
        if (resultado != null) {
            System.out.println("El resultado es: " + resultado);
        } else {
            System.out.println("Error: operación no válida o división por cero.");
        }
    }
}