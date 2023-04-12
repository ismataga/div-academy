package lesson8.TasksArrays;

public class task13 {
    public static void main(String[] args) {
//    13.	For dövründən istifadə edərək aşağıdakı nəticələri çap edən 3 proqram yazın.


        //iii)	          *
        //               **
        //              ***
        //             ****
        //            *****
        //

        for (int i = 1; i < 7; i++) {
            for (int j = 0; j < 7 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }


    }
}