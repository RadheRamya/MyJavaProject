import java.util.HashSet;
import java.util.Set;

public class ArrayDuplicates {
    public static void main(String[] args) {
        int[] a = {2, 6, 7, 4,6,10, 6, 4};

        Set<Integer> set = new HashSet<>();

        for (Integer c : a)
        {
          set.add(c);
        }
        System.out.println(set);

    }
}
