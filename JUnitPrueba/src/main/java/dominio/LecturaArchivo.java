package dominio;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class LecturaArchivo {
    private final File archivo;
    //private String nombre;
    //private long tamanio;
    //private int numLineas;

    public LecturaArchivo(String rutaArchivo){
        this.archivo = new File(rutaArchivo);

    }

    public String getNombre(){
        //return "Hola";
        return archivo.getName();
    }

    public long getTamanio(){
        return Math.round(Math.ceil(archivo.length()/1024.0));
    }

    public int getNumLineas() throws IOException{
        int numLineas = 0;
        FileInputStream fstream = new FileInputStream(archivo);
        InputStreamReader is = new InputStreamReader(fstream , StandardCharsets.UTF_8);
        BufferedReader br = new BufferedReader(is);
        while(br.readLine()!=null) {
            numLineas++;
        }
        br.close();
        return numLineas;
    }

    @Override
    public String toString() {
        String text = null;
        try {
            text = "LecturaArchivo [nombre=" + this.getNombre() + ", tamanio=" + this.getTamanio() + ", numLineas="
                    + this.getNumLineas() + "]";
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return text;
    }
}