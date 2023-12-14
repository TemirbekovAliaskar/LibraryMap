import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class DataBase {

    public Map<String, Book>  map = new TreeMap<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DataBase dataBase = (DataBase) o;
        return Objects.equals(map, dataBase.map);
    }

    @Override
    public int hashCode() {
        return Objects.hash(map);
    }
}
