//Crear una interfaz CocheCRUD.//
//        Crear una implementación CocheCRUDImpl que implemente la interfaz CocheCRUD.//
//        Como métodos de CocheCRUD podemos poner://
//        save() findAll() delete() que simplemente impriman por consola el nombre del propio método.//
//        Desde una clase Main, Crear un objeto de tipo CocheCRUDImpl y llamar a cada uno de los métodos.//
//        Ejemplo://
//        CocheCRUD cocheCrud = new CocheCRUDImpl()

package Clase6;

public class CocheCRUDImpl implements CocheCRUD{

    @Override
    public void save() {
        System.out.println("yo imprimo los registros");

    }

    @Override
    public void findAll() {
        System.out.println("Yo busco los registros");
    }

    @Override
    public void delete() {
        System.out.println("Yo borro los registros");
    }
}
