import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ProductManager pm = new ProductManager();

    public static void main(String[] args) {
        pm.products.add(new Product("Iphone", 1, 100));
        pm.products.add(new Product("IphoneX", 2, 200));
        pm.products.add(new Product("IphoneXS", 3, 10));

        boolean loop = true;
        do {
            System.out.println("////////////////////////////////////////////////////////");
            System.out.println("Menu:\n1 - Them san pham\n2 - Sua thong tin san pham\n" +
                    "3 - Xoa san pham\n4 - Hien thi\n5 - Tim kiem\n6 - Sap xep\n7 - Quit");
            String ip = sc.nextLine();
            int input = Integer.parseInt(ip);
            switch (input) {
                case 1 -> {
                    Product p = doAdd();
                    pm.add(p);
                }
                case 2 -> doUpdate();
                case 3 -> doDelete();
                case 4 -> pm.print();
                case 5 -> doSearch();
                case 6 -> doSort();
                case 7 -> {
                    System.out.println("Bye bye");
                    loop = false;
                }
                default -> System.out.println("Nhap sai so roi");
            }
        } while (loop);
    }

    static Product doAdd() {
        System.out.println("Nhap ten san pham");
        String name = sc.nextLine();
        System.out.println("Nhap id san pham");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap gia san pham");
        int price = Integer.parseInt(sc.nextLine());
        return new Product(name, id, price);
    }

    static void doUpdate() {
        pm.print();
        System.out.println("Ban muon sua san pham o index nao: ");
        int index= Integer.parseInt(sc.nextLine());
        System.out.println("Nhap ten san pham moi");
        String name = sc.nextLine();
        System.out.println("Nhap gia san pham moi");
        int price = Integer.parseInt(sc.nextLine());
        pm.update(index, name, price);
    }

    static void doDelete() {
        System.out.println("Ban muon xoa san pham o id nao: ");
        pm.print();
        int index = Integer.parseInt(sc.nextLine());
        pm.delete(index);
    }

    static void doSearch() {
        System.out.println("Nhap ten san pham ban muon tim");
        String name = sc.nextLine();
        pm.search(name);
    }
    static void doSort() {
        System.out.println("Ban muon xep theo chieu tang hay giam\nBam 1 de tang, 2 de giam");
        String input = sc.nextLine();
        int ip = Integer.parseInt(input);
        if (ip == 1)
            Collections.sort(pm.products, new AscPrice());
        else
            Collections.sort(pm.products, new DesPrice());
        System.out.println("Da sap xep");
        pm.print();
    }
}
