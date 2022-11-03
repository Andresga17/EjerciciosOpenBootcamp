package interfaces;

public interface CocheCRUD {

    void save (CocheCRUDImpl coche);

    String findAll ();

    void delete (CocheCRUDImpl coche);


}
