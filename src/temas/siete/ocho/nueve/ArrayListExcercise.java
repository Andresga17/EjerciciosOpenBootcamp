package temas.siete.ocho.nueve;
import java.awt.*;
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListExcercise {
    public static void main (String [] args) {
        ArrayList <String> clubs = new ArrayList<>(4);
        clubs.add("Barcelona");
        clubs.add("Manchester City");
        clubs.add("Liverpool");
        clubs.add("Real Madrid");

    LinkedList <String> clubsCopy = new LinkedList <>(clubs);

    System.out.println("Contenido del ArrayList\n");
    getClubs(clubs);
    System.out.println("Contenido de la LinkedList\n");
    getClubs(clubsCopy);

    }
    public static void getClubs (List clubs) {
        for (Object club : clubs) {
                System.out.println(club);
        }
   }
}
