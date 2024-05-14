import java.util.*;
public class VowelConsonant {

    public static void main(String[] args) {
        int vCount = 0;
        int cCount = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if (ch == 'a' || ch == 'e' ||ch == 'i' || ch == 'o'|| ch == 'u' ){
                vCount++;
            } else {
                cCount++;
            }
        }
        System.out.println(vCount + " " + cCount);

    }
}

