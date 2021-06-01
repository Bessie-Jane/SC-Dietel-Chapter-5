package exerciseTwoPointTwoFive;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        OddOrEven oddOrEven = new OddOrEven();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int numberEntered = scanner.nextInt();


       if(oddOrEven.evenNumberChecker(numberEntered)) {
           System.out.println("Number is Even");
       }else{
           System.out.println("Number is Odd");
       }

    }

}
