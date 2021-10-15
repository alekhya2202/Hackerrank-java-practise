import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while(sc.hasNext()) {
            String inp = sc.nextLine();
            System.out.println(i + " " + inp);
            i += 1;
        }
        sc.close();
    }
}
