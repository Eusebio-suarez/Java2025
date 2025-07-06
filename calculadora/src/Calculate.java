import javax.swing.*;

public class Calculate {

    public static double add (double num1, double num2){
        return num1+num2;
    }

    public static double subtract (double num1,double num2){
        return num1-num2;
    }

    public static double multiply (double num1,double num2){
        return num1 * num2;
    }

    public static double split (double num1,double num2){
        if (num2==0){
            throw new ArithmeticException("canon split with 0");
        }
        return num1 /num2;
    }
}
