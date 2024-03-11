package libreriacod;

/**
 *
 * @author Adrian
 */
public class LibreriaCOD {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {            
        try {
            
            float num1 = EntradaSalida.obtenerNumero("Introduce el primer numero: ");
            float num2 = EntradaSalida.obtenerNumero("Introduce el segundo numero: ");
            String operacion = EntradaSalida.obtenerOperacion("Introduce la operacion (suma/resta/multiplicacion/division/raiz): ");

            float resultado = Operaciones.operacionBasica(num1, num2, operacion);
            
            EntradaSalida.mostrarResultado(resultado);
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        }
    }