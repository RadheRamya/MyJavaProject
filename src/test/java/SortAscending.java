import java.lang.reflect.Array;
import java.util.*;

public class SortAscending {
    public static void main(String[] args) {
       /* int[] a = {23,12,45,21,90,66,54,89};
        TreeSet<Integer> ts= new TreeSet<>();
        for(Integer s : a)
        {
            ts.add(s);
        }
     System.out.println(ts);*/

        //using array
   /*  int[] a = {23,12,45,21,90,66,54,89};

        Arrays.sort(a);
        for(Integer s: a)
        {
            System.out.println(s);

        }
*/
        int[] a = {23,12,45,21,90,66,54,89};
        List<Integer> list = new ArrayList<>();

        for (Integer i : a)
        {
            list.add(i);
        }
        Collections.sort(list);
        System.out.println(list);
    }
}
