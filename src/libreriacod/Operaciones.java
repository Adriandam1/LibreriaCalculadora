package libreriacod;

import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class Operaciones {
            // Constantes para las operaciones
    public static final String SUMA = "suma";
    public static final String RESTA = "resta";
    public static final String MULTIPLICACION = "multiplicacion";
    public static final String DIVISION = "division";

    public static final String RAIZCUADRADA = "raizcuadrada";
    public static final String RAIZCUBICA = "raizcubica";
    public static final String RAIZCUALQUIERA = "raiz";
    
        /**
     * Realiza una operaciin basica entre dos numeros segun la operacion indicada.
     * @param num1 El primer numero para la operacion.
     * @param num2 El segundo numero para la operacion.
     * @param operacion La operacion a realizar (suma, resta, multiplicacion o division).
     * @return El resultado de la operacion, o null si la operacion no es correcta.
     */
      public static Float operacionBasica(float num1, float num2, String operacion) {
        switch (operacion.toLowerCase()) {
            case SUMA:
                return num1 + num2;
            case RESTA:
                 return num1 - num2;
            case MULTIPLICACION:
                return num1 * num2;
            case DIVISION:
                return num1 / num2;
            case RAIZCUADRADA:
                return num1;
            case RAIZCUBICA:
                return num1;
            case RAIZCUALQUIERA:
                return (float) Math. pow(num1, num2);
            default:
                return null; // Operación no válida
        }
    }
}