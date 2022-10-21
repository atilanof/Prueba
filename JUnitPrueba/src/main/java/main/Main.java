package main;
import java.io.IOException;

import dominio.LecturaArchivo;
public class Main {
    public static void main(String[] args){
        LecturaArchivo lA = new LecturaArchivo(args[0]);
        System.out.println(lA.getNombre());
        System.out.println(lA.getTamanio());
        try {
            System.out.println(lA.getNumLineas());
        } catch (IOException e) {

            e.printStackTrace();
        }
        System.out.println(lA);
    }
}
