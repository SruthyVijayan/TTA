import java.util.Scanner;

public class trueFalse {

    public static boolean StringDigit(String s) {
        String s1=s.trim();
        if(Character.isLetter(s1.charAt(0)) || Character.isLetter(s1.charAt(s1.length()-1)))
            return false;

        for (int i = 1 ; i <s.length()-1; i++)
            if (Character.isLetter(s1.charAt(i)) && (s1.charAt(i-1)!='+' || s1.charAt(i+1)!='+'))
                return false;

        return true;
    }
//return false

public static void main(String[] args) {

    Scanner input= new Scanner(System.in);
    for (int i = 0; i <2; i++) {
        System.out.println("Enter a string: ");
        String  s=input.next();
        System.out.println(StringDigit(s));
    }


} }


