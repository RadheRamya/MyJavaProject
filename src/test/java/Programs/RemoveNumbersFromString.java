package Programs;

import java.util.ArrayList;
import java.util.List;

public class RemoveNumbersFromString {
    public static void main(String[] args) {
        String str = "Radhey13Dec19";
        char[] ch =str.toCharArray();
        List<Character> list = new ArrayList<>();

        for (Character c : ch)
        {
            if(!Character.isDigit(c))
            {
                list.add(c);
            }
        }
        System.out.print(list);

    }
}
