import java.util.ArrayList;

public class ProductManager{
    ArrayList<Product> products = new ArrayList<>();

    public ProductManager() {
    }

    public void add(Product product) {
        products.add(product);
    }
    public void update(int index, String name, int price) {
        for (Product product : products) {
            if (product.getId() == index) {
                product.setName(name);
                product.setPrice(price);
            }
        }
    }
    public void delete (int index) {
        products.removeIf(product -> product.getId() == index);
    }
    public void search (String name) {
        boolean found = false;
        for (Product product : products) {
            if (product.getName().equals(name)) {
                System.out.println(product.toString());
                found = true;
            }
        }
        if (!found) System.out.println("Khong tim thay san pham nay");
    }
    public void print() {
        for (Product product : products) {
            System.out.println(product.toString() + "\n");
        }
    }
}
