package Programs;

public class ReverseString {
    public static void main(String[] args) {
        String str = "RadheyRadhey";
        /*String rev ="";
        for (int i=str.length()-1;i>=0;i--)
        {
            rev = rev+ str.charAt(i);
                    }
        System.out.println("Before reverse " + str);
        System.out.println("After reverse " + rev);
    }*/
        StringBuffer sb = new StringBuffer(str);
String rev = sb.reverse().toString();

        System.out.println("Before reverse " + str);
        System.out.println("After reverse " + rev);

    }
}