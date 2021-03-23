package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters(5, 11);
        calcFeetAndInchesToCentimeters(71);
    }

    public static int calcFeetAndInchesToCentimeters(int feet, int inches) {
        if (feet < 0 || (inches < 0 || inches > 12)) {
            return -1;
        } else {
            double centimeters = ((feet * 30.48) + (inches * 2.54));
            System.out.println(feet + "ft, " + inches + "in = " + centimeters + "cm");
            return (int) centimeters;
        }
    }

    public static int calcFeetAndInchesToCentimeters(int inches) {
        if ((inches < 0)) {
            return -1;
        } else {
            double centimeters = ((inches * 2.54));
            System.out.println(inches + "in = " + centimeters + "cm");
            return (int) centimeters;
        }
    }
}
