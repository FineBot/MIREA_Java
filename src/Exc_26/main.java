package Exc_26;

import java.util.*;


public class main {
    public static <K, V> HashMap<K, V> newHashMap(List<? extends K> keys, Set<? extends V> values) {
        if (keys.size() != values.size())
            throw new IllegalArgumentException();
        HashMap<K, V> res = new HashMap<>();
        for (int i = 0; i < keys.size(); i++) {
            res.put(keys.get(i), (V) values.toArray()[i]);
        }
        return res;
    }

    public static <T> HashSet<T> newHashSet(T... elements) {
        return new HashSet<>(Arrays.asList(elements));
    }

    public static <T> ArrayList<T> newArrayList(T... elements) {
        ArrayList<T> res = new ArrayList<>();
        Collections.addAll(res, elements);
        return res;
    }


    public static void main(String[] args) {
        ArrayList<String> a1 = newArrayList("a", "b", "c", "d", "e", "f");
        HashSet<Integer> a2 = newHashSet(10, 20, 30, 40, 40, 30, 50, 60);
        HashMap<String, Integer> a3 = newHashMap(a1, a2);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }
}
