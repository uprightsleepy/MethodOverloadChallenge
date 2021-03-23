package academy.learnprogramming;

public class Main {
    //TODO Add algorithm that converts the centimeters in the overloaded method back into feet / inches and reprints that in the output*************


    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters(5, 11);
        calcFeetAndInchesToCentimeters(100);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 || (inches < 0 || inches > 12)) {
            return -1;
        } else {
            double centimeters = ((feet * 30.48) + (inches * 2.54));
            System.out.println(feet + "ft, " + inches + "in = " + centimeters + "cm");
            return centimeters;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if ((inches < 0)) {
            return -1;
        } else {
            double centimeters = ((inches * 2.54));
            System.out.println(inches + "in = " + centimeters + "cm");
            return centimeters;
        }
    }
}
