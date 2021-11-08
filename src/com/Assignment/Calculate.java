package com.Assignment;

import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {

        int option, a, b, result;
        Scanner read = new Scanner(System.in);

        do{
            System.out.println("Enter 1 to Add");
            System.out.println("Enter 2 to Subtract");
            System.out.println("Enter 3 to Mul");
            System.out.println("Enter 4 to Div");
            System.out.println("Enter 5 to Quit");

            System.out.println("______________________________");
            System.out.print("Enter a option ");
            option = read.nextInt();

            switch (option){
                case 1:
                    System.out.println("You choose Add");
                    System.out.println("Enter two first number and second number");
                    a = read.nextInt();
                    b = read.nextInt();

                    result = a+b;
                    System.out.println("Addition : "+ result);
                    System.out.println("______________________");
                    break;

                case 2:
                    System.out.println("You choose Subtraction");
                    System.out.println("Enter two first number and second number");
                    a = read.nextInt();
                    b = read.nextInt();

                    result = a-b;
                    System.out.println("Subtraction : "+ result);
                    System.out.println("______________________");
                    break;

                case 3:
                    System.out.println("You choose Multiplication");
                    System.out.println("Enter two first number and second number");
                    a = read.nextInt();
                    b = read.nextInt();

                    result = a*b;
                    System.out.println("Multiplication : "+ result);
                    System.out.println("______________________");
                    break;

                case 4:
                    System.out.println("You choose Division");
                    System.out.println("Enter two first number and second number");
                    a = read.nextInt();
                    b = read.nextInt();

                    result = a/b;
                    System.out.println("Division : "+ result);
                    System.out.println("______________________");
                    break;

                case 5:
                    System.out.println("You choose to exit ");
                    System.out.println("______________________");
                    break;

                default:
                    System.out.println("Wrong Options");
                    System.out.println("______________________");



            }
        }while (option != 5);


    }

//    public void calculate(int option,int a, int b,, int result){
//        if(option == 1){
//            result  = a +b;
//            System.out.println("Addition " + result);
//        }
//        else if (option == 2){
//            result = a-b;
//            System.out.println("Subtraction " + result);
//        }
//        else if(option == 3){
//            result = a*b;
//            System.out.println("Multiplication " + result);
//        }
//        else if(option == 4)
//        {
//           result = a / b;
//            System.out.println("Division "+result);
//        }
//
//        else if (option == 5){
//            System.out.println("you choose to exit");
//
//        }
//    }



}
