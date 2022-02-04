import java.util.Scanner;

public class basic_calculator {
    public static void main(String[] args) {

        System.out.println("Welcome to your calculator!");

        Scanner inputScanner = new Scanner(System.in);
        String operation ;
        double firstNumber ;
        double secondNumber ;

        System.out.println("Select and operation to perform: add, sub, mult");
        operation = inputScanner.nextLine();

        System.out.println("Enter your first number: ");
        firstNumber = inputScanner.nextDouble();

        System.out.println("Enter your second number: ");
        secondNumber = inputScanner.nextDouble();

        if (operation.equalsIgnoreCase("add")) {
            double addition = add ( firstNumber, secondNumber);
            System.out.println("Your result is: "+ addition);
            //add
        } else if (operation.equalsIgnoreCase("sub")) {
            //sub
            double division = sub ( firstNumber, secondNumber);
            System.out.println("Your result is: "+ division);
        } else if (operation.equalsIgnoreCase("mult")) {
            //mult
            double multiplication = mult ( firstNumber, secondNumber);
            System.out.println("Your result is: "+ multiplication);
        } else
        {
            System.out.println("We do not offer that...");
        }


    }
    static double add (double firstNumber,double secondNumber){
        return firstNumber+secondNumber;
    }
    static double sub (double firstNumber,double secondNumber){
        return firstNumber/secondNumber;
    }
    static double mult (double firstNumber,double secondNumber){
        return firstNumber*secondNumber;
    }

}



