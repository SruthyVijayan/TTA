package ex_11052024;
//Search for the difference between PP vs OOPs.
//Create Multiple class for the ATB6X project, Attribute, Behav, Course, Student, Payment.
//Create Object of 3 students and assign the values.

//Student class, course class
//Payment class - credit card, cash, mode of payment, amount
public class Atb6x {

    public static void main(String args[]){
        System.out.println("------- First Student details ------");
        System.out.println();
        Student st= new Student();
        st.name="Sruthy";
        st.age= 28;
        st.profession ="Test Engineer";
        st.experience= 6;
        st.isManual=true;

        st.printName();
        st.printAge();
        st.printExperience();
        st.printProfession();
        st.printIsManual();

        Course cs= new Course();
        cs.course="Java";
        cs.course();

        Payment p= new Payment();
        p.payment_method="Cash";
        p.amount=10000;
        p.paymentMethod();
        System.out.println();

System.out.println("------- Second Student details ------");
        System.out.println();
        Student st2= new Student();
        st2.name="Praveen";
        st2.age= 34;
        st2.profession ="Sales Engineer";
        st2.experience= 8;
        st2.isManual=false;

        st2.printName();
        st2.printAge();
        st2.printExperience();
        st2.printProfession();
        st2.printIsManual();

        Course cs2= new Course();
        cs2.course="Java";
        cs2.course();

        Payment p2= new Payment();
        p2.payment_method="Debit card";
        p2.amount=100;
        p2.paymentMethod();
        System.out.println();
        System.out.println("------- Third Student details ------");
        System.out.println();
        Student st3= new Student();
        st3.name="Akshita";
        st3.age= 20;
        st3.profession ="Test Engineer";
        st3.experience= 1;
        st3.isManual=true;

        st3.printName();
        st3.printAge();
        st3.printExperience();
        st3.printProfession();
        st3.printIsManual();

        Course cs3= new Course();
        cs3.course="Java";
        cs3.course();

        Payment p3= new Payment();
        p3.payment_method="Cash";
        p3.amount=1000;
        p3.paymentMethod();
    }

}
