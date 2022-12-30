package interfaces;

import temas.siete.ocho.nueve.ArrayExercise;

public class Main {
    public static void main(String[] args) {

        CocheCRUDImpl crud = new CocheCRUDImpl();

        crud.save(crud);
        System.out.println(crud.findAll());
        crud.delete(crud);
        System.out.println(ArrayExercise.reverse("Hola mundo"));
    }
}
