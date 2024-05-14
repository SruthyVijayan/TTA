package ex_11052024;

public class CarFunctions {
    public static void main(String args[])
    {
        Car tesla = new Car();
        tesla.name="Tesla";
        tesla.tyres= 4;
        tesla.model="Model 3";
        tesla.color="Black";
        tesla.sizes=546;
        tesla.transmissionType="dh";

        tesla.reverse();
        tesla.musicSystem();

        Car volvo = new Car();
        volvo.name="Volvo";
        volvo.tyres= 4;
        volvo.model="Model 24";
        volvo.color="white";
        volvo.sizes=325;
        volvo.transmissionType="rfge";

        volvo.reverse();
        volvo.musicSystem();
    }
}
