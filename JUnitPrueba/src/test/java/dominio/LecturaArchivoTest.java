package dominio;

import junit.framework.TestCase;

import java.io.IOException;

public class LecturaArchivoTest extends TestCase {
    private static LecturaArchivo lA = null;
    public void setUp()  {
        try {
            lA = new
                    LecturaArchivo("/tmp/fichero.txt");
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void testGetNombre() {
        assertEquals("fichero.txt", lA.getNombre());
    }

    public void testGetTamanio() {
        assertEquals(1, lA.getTamanio());
    }

    public void testGetNumLineas() {
        try {
            assertEquals(15, lA.getNumLineas());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}