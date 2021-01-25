import java.util.Comparator;

public class DesPrice implements Comparator<Product> {
    public int compare(Product o1, Product o2) {
        int result = o1.getName().compareTo(o2.getName());
        if (result == 0)
            return sortByPrice(o1, o2);
        else
            return result;
    }
    public int sortByPrice(Product o1, Product o2){
        return Integer.compare(o2.getPrice(), o1.getPrice());
    }
}
