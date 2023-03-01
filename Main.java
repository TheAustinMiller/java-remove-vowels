import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        System.out.println("Enter a sentence and I shall remove the vowels!");
        String sent = input.nextLine();
        while (sent.length() <= 1) {
            System.out.println("Need more characters!");
            sent = input.nextLine();
        }
        for (int lcv = 0; lcv < sent.length();lcv++)
        {
            list.add(sent.substring(lcv, lcv+1));
        }
        int tot = 0;
        for (int lcv = 0; lcv < list.size();lcv++)
        {
            if ((list.get(lcv).equals(" ")))
            {
                tot--;
            }
            tot++;
        }
        double omit = 0;

        for (int lcv = list.size() - 1; lcv >= 0;lcv--)
        {
            if ((list.get(lcv).equals("a")) || (list.get(lcv).equals("e")) || (list.get(lcv).equals("i")) || (list.get(lcv).equals("o")) || (list.get(lcv).equals("u")) || (list.get(lcv).equals("A")) || (list.get(lcv).equals("E")) || (list.get(lcv).equals("I")) || (list.get(lcv).equals("O")) || (list.get(lcv).equals("U"))){
                list.remove(lcv);
                omit++;
            }
        }

        for (int lcv = 0; lcv < list.size(); lcv++)
        {
            System.out.print(list.get(lcv));
        }

        double av = omit / tot;
        double ans = av * 100;
        System.out.println("");
        System.out.println("Compression rate: " + Math.round(ans) + "%");
    }
}
