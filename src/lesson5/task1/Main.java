package lesson5.task1;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
//
//        System.out.print("x- i daxil edin: ");
//        sc.nextDouble();
//        System.out.println("y-i daxil edin: ");
//        sc.nextDouble();

//        double a = Calculator.add(5, 6);
//        System.out.println(a);
//
//        double b = Calculator.sub(5, 6);
//        System.out.println(b);
//
//        double c = Calculator.mul(5, 6);
//        System.out.println(c);
//
//        double d = Calculator.div(5, 6);
//        System.out.println(d);
//
//        double f = Calculator.factorial(5);
//        System.out.println(f);
//
//        double x = Calculator.mathPow(5, 6);
//        System.out.println(x);


        double x = calculator();


    }

    static double calculator(){
        Scanner sc = new Scanner(System.in);
        System.out.println("a-ni daxil edin");
        double x = sc.nextDouble();


        System.out.println("b-ni daxil edin");
        double y = sc.nextDouble();

        System.out.println("operatoru daxil edin  + 1, - 2, * 3, / 4, ! 5, ^ 6");
        int operation = sc.nextInt();


        double result = 0;
        switch (operation) {
            case 1:
                result = Calculator.add(x,y);
                System.out.println(result);
                break;
            case 2:
                result = Calculator.sub(x,y);
                System.out.println(result);
                break;
            case 3:
                result = Calculator.mul(x,y);
                System.out.println(result);
                break;
            case 4:
                result = Calculator.div(x,y);
                System.out.println(result);
            case 5:
                result = Calculator.factorial(x);
                System.out.println(result);
                break;
            case 6:
                result = Calculator.mathPow(x,y);
                System.out.println(result);
                break;
            default:
                result = 0;
        }
        return result;

    }
}
