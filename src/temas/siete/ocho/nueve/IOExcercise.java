package temas.siete.ocho.nueve;

import java.io.*;

public class IOExcercise {
    public static void main(String[] args) {
        
        readAndShowText("fibonacci.js", "copy.txt");
    }
    public static void readAndShowText (String fileIn, String fileOut) {
        byte [] content;
        try {
            InputStream text = new FileInputStream(fileIn);
            content = text.readAllBytes();

            PrintStream fileCopy = new PrintStream(fileOut);
            fileCopy.write(content); //Se copia el archivo

            System.out.println("El contenido copiado es:");
            for (byte element : content) {
                System.out.print((char)element);
            }

        }catch (Exception e) {
            System.out.println("El archivo no existe: " + e.getMessage());
        }
    }
}
