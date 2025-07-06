import javax.swing.*;

public class Processes {
    //menu of system
    static String menu = """
        Menu calculate
        1.add
        2.subtract
        3.multiply
        4.exit
        Enter the number option
        """;

    //method for request numbers
    public static Double requestNumber (String message){
        double num = Double.parseDouble(JOptionPane.showInputDialog(message));
        return num;
    }

    //start method system
    public static void start() {

        int option ;
        do {
            option = Integer.parseInt(JOptionPane.showInputDialog(menu));
            double num1,num2;
            switch (option) {
                //case add
                case 1: {
                    num1 = requestNumber("enter the fist number");
                    num2 = requestNumber("enter the second number");
                    System.out.println(Calculate.add(num1,num2));
                    break;
                }
                //case subtract
                case 2:{
                    num1 = requestNumber("enter the fist number");
                    num2 = requestNumber("enter the second number");
                    System.out.println(Calculate.subtract(num1,num2));
                    break;
                }
                //case multiply
                case 3:{
                    num1 = requestNumber("enter the fist number");
                    num2 = requestNumber("enter the second number");
                     System.out.println(Calculate.multiply(num1,num2));
                     break;
                }

            }

        } while (option !=4);

    }
}
