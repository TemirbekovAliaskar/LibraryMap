import java.util.HashMap;
import java.util.Map;

public class Service {


    private  final DataBase dataBase;


    public Service(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    public String addBook (Book book){
        dataBase.map.put(book.getISBN(),book);
        return "Success!";
    }

    public String removeBook(String ISBN) {
        try {
            if (dataBase.map.containsKey(ISBN)) {
                dataBase.map.remove(ISBN);
                System.out.println("Success!");
            } else throw new RuntimeException("Myndai book jok !");
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
        return "Success!";
    }

    public void searchBook(String keyWord){
        if (dataBase.map.containsKey(keyWord)){
            System.out.println(dataBase.map);
        }
        else {
            System.out.println("Not found !");
        }
    }

    public void displayBook(){
        System.out.println(dataBase.map.toString());
    }



}
