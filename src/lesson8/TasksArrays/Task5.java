package lesson8.TasksArrays;

public class Task5 {
    public static void main(String[] args) {
//    5.	Daxil edilmiş 2 ölçülü massivin bütün 5-ə bölünən ədədlərini çap edən proqram tərtib edin.

        int[][] arr = {{1, 3, 5, 10, 17}, {21, 25, 28, 30}};

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    int a = arr[i][j];
                    if (a % 5 == 0) {
                        System.out.print(a + " ");
                    }
                }
            }

    }
}
