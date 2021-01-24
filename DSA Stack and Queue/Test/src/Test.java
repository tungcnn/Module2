import java.util.*;

public class Test {
    public static void main(String[] args) {
        HashSet<Integer> hashset = new HashSet<>();
        LinkedHashSet<Integer> linkedhashset = new LinkedHashSet<>();
        TreeSet<Integer> treeset = new TreeSet<>();

        HashMap<Integer, String> hashmap = new HashMap<>();
        LinkedHashMap<Integer, String> ll = new LinkedHashMap<>();
        TreeMap<Integer, String> treemap = new TreeMap<>();
        ArrayList abc = new ArrayList();
        abc.add(1);
        abc.add(1);
        abc.add(1);
        System.out.println(abc.get(0));
        treemap.put(54, "Tung");
        treemap.put(2, "Tung");
        treemap.put(90, "Tung");
        treemap.put(190, "Tung");
        treemap.put(900, "Tung");
        System.out.println(treemap.toString());
    }
}
