package lesson8.TasksArrays;

public class Task2 {
    public static void main(String[] args) {
//2.	Massivin elementlərini tərs sıra ilə çap edən proqram yazın.


        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8};

//        for (int i = 0; i < arr1.length; i++) {
//          int a = arr1[arr1.length - i - 1];
//            if (a == arr1.length - (arr1.length-1)) {
//                System.out.print(a);
//            } else {
//                System.out.print(a +",");
//            }
//        }

        for (int i = arr1.length-1; i >=0 ; i--) {
            System.out.print(arr1[i] +" ");

        }
    }
}