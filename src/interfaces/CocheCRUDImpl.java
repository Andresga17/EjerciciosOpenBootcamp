package interfaces;

public class CocheCRUDImpl implements CocheCRUD{
    public CocheCRUDImpl() {}

    public void save(CocheCRUDImpl coche) {
        System.out.println("Save");
    }
    public String findAll () {
        return "Find all";
    }

    public void delete (CocheCRUDImpl coche) {
        System.out.println("Delete");
    }

}
