package lesson8.TasksArrays;

public class Task9 {
    public static void main(String[] args) {
//     9.	Daxil edilmiş 2 ölçülü massivin sol diaqonal elementlərini tərsinə çevirən proqram tərtib edin.

        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

        for (int i = arr.length - 1; i >= 0; i--) {
            int i1 = arr[i][arr.length-4];
            System.out.print(i1 + " ");
        }
    }
}
