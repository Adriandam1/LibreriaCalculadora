import libreriacod.Operaciones;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static libreriacod.Operaciones.*;

public class OperacionesTests {
    @Test
    public void prueboCalculadora(){
       Assertions.assertEquals(10f, Operaciones.operacionBasica(2f,5f,MULTIPLICACION));
    }
    @Test
    public void prueboDivision(){
        Assertions.assertEquals(5f, Operaciones.operacionBasica(50f,10f,DIVISION));
    }
    @Test
    public void prueboSuma(){
        Assertions.assertEquals(30f, Operaciones.operacionBasica(10f, 20f, SUMA));
    }
    @Test
    public void prueboResta(){
        Assertions.assertEquals(7f, Operaciones.operacionBasica(20f, 13f, RESTA));
    }
}
