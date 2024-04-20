public class Lab002 {
    /*
    Max between 3 Numbers with ? operators.
Q - int a = 10; System.out.println(++a + a++ + a++);
Q. - int b = 10; System.out.println(--b + b++ + ++b);
Value of x,y, z - double - result.
     */
    public static void main(String[] args) {
        int x = 110;
        int y = 25;
        int z = 0;
        int max;
        max = (x > y) ? (x > z ? x : z) : (y > z ? y : z);
        System.out.print("maximum number among "+x+ " , " +y+ " and "+ z +" is "+ max);

           }
}
