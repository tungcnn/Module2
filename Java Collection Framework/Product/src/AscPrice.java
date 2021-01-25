import java.util.Comparator;

public class AscPrice implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        int result = o1.getName().compareTo(o2.getName());
        if (result == 0)
            return sortByPrice(o1, o2);
        else
            return result;
    }
    public int sortByPrice(Product o1, Product o2){
        return Integer.compare(o1.getPrice(), o2.getPrice());
    }
}
