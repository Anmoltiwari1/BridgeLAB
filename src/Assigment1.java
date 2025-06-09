
import java.util.Scanner;

public class Assigment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        print();
        int result = addnumber(sc);           
        System.out.println("Sum: " + result);
        System.out.println("Fahrenheit:"+Fehr(sc));
        System.out.println("Area:"+Circle(sc));
        System.out.println("Volume:"+Cylinder(sc));
        System.out.println("Simple Intrest:"+SI(sc));
        System.out.println("Perimeter of Rectangle: " + perimeterRectangle(sc));
        System.out.println("Power Calculation: " + powerCalculation(sc));
        System.out.println("Average of Three Numbers: " + averageThree(sc));
        System.out.println("Kilometers to Miles: " + kmToMiles(sc));
    }

    public static void print(){
        System.err.println("Welcome to Bridgelabz");
    }

    public static int addnumber(Scanner sc){
        System.out.println("Enter the first num");
        int a=sc.nextInt();
        System.out.println("Enter the second num");
        int b=sc.nextInt();
        return a+b;
    }

    public static double Fehr(Scanner sc){
        System.out.println("Enter the temprature");
        int a=sc.nextInt();
        
        return (a * 9/5) + 32;
    }
    public static double Circle(Scanner sc){
        System.out.println("Enter the radius");
        int a=sc.nextInt();

        double pie=3.14;
        
        return pie*Math.pow(a,2);
    }
    public static double Cylinder(Scanner sc){
        System.out.println("Enter the radius");
        int a=sc.nextInt();
        System.out.println("Enter the height");
        int h=sc.nextInt();

        double pie=3.14;
        
        return pie*Math.pow(a,2)*h;
    }
    public static double SI(Scanner sc){
        System.out.println("Enter the principle");
        int p=sc.nextInt();
        System.out.println("Enter the rate");
        int r=sc.nextInt();
        System.out.println("Enter the time");
        int t=sc.nextInt();

        
        return (p*r*t)/100;
    }

    public static double perimeterRectangle(Scanner sc) {
        System.out.println("Enter the length of the rectangle");
        double length = sc.nextDouble();
        System.out.println("Enter the width of the rectangle");
        double width = sc.nextDouble();
        return 2 * (length + width);
    }

    public static double powerCalculation(Scanner sc) {
        System.out.println("Enter the base");
        double base = sc.nextDouble();
        System.out.println("Enter the exponent");
        double exponent = sc.nextDouble();
        return Math.pow(base, exponent);
    }

    public static double averageThree(Scanner sc) {
        System.out.println("Enter first number");
        double num1 = sc.nextDouble();
        System.out.println("Enter second number");
        double num2 = sc.nextDouble();
        System.out.println("Enter third number");
        double num3 = sc.nextDouble();
        return (num1 + num2 + num3) / 3;
    }

    public static double kmToMiles(Scanner sc) {
        System.out.println("Enter distance in kilometers");
        double km = sc.nextDouble();
        return km * 0.621371;
    }
}
