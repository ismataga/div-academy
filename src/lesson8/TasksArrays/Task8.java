package lesson8.TasksArrays;

public class Task8 {
    public static void main(String[] args) {
//     8.	Daxil edilmiş 2 ölçülü massivin sağ diaqonal elementlərini çap edən proqram yazın.

        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

        for (int i = 0; i < arr.length; i++) {
            int i1 = arr[i][arr[i].length-1];
            System.out.print(i1+" ");
        }
    }
}
