import java.util.Scanner;

public class DigitCount {

   public int DigCount(int n) {
       int count = 0;
       if (n == 0) {
           return 1;

       }
       if (n < 0) {
           n= -n;
       }

       while (n != 0) {
           n = n / 10;
           count = count + 1;
       }
       return count;

   }
   public static void main(String[] args)
   {
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter the number");
      int N= sc.nextInt();
       DigitCount dg= new DigitCount();
       System.out.println(dg.DigCount(N));

        }
}
