package ex_04052024;
public class MaxValueArray {
    public static void main(String[] args)
    {
        int[] salaries={12,25,-121322,999,456,12546};
        int max_salary=Integer.MIN_VALUE;
        for(int i=0;i<salaries.length;i++)
        {
            if (salaries[i]>max_salary)
            {
                max_salary=salaries[i];

            }
        }
        System.out.println("Maximum salary is " +max_salary);
//while
        int[] salaries2={12,25,-121322,999,456};
int j=0;
        int max_salary2=Integer.MIN_VALUE;
while (j<salaries2.length)
{
    if (salaries2[j]>max_salary2) {
        max_salary2=salaries2[j];
    }
    j++;
}
        System.out.println("Maximum salary is " +max_salary2);

//do while
        int[] salaries3={12,25,-121322,235657,456};
        int k=0;
        int max_salary3=Integer.MIN_VALUE;
       do{
           if(salaries3[k]>max_salary3)
           {
               max_salary3=salaries3[k];
           }
           k++;
        }
        while (k<salaries3.length);
        System.out.println("Maximum salary is " +max_salary3);
    }
}
