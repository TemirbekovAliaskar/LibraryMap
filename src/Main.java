import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        DataBase dataBase = new DataBase();
        Service service = new Service(dataBase);

             Book book =   new Book("12345","Alma","Jigit");
             Book book1 =   new Book("54321","Alma","Mirlan");
             Book book2 =   new Book("98765","Alma","Urmat");



        dataBase.map.put(book.getISBN(),book);
        dataBase.map.put(book1.getISBN(),book1);
        dataBase.map.put(book2.getISBN(),book2);


//        System.out.println(service.addBook(new Book("4321", "Good", "Ali")));
        System.out.println("____________________________");
        System.out.println(service.removeBook("12345"));
        System.out.println("_____________________________");
        service.searchBook("54321");
        System.out.println("______________________________");
        service.displayBook();


    }
}