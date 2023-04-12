package lesson8.TasksArrays;

public class Task6 {
    public static void main(String[] args) {
//        6.	Daxil edilmiş 2 ölçülü massivin bütün elementlərinin cəmini hesablayan proqram yazın.

        int[][] arr = {{1, 3, 5, 10, 17}, {21, 25, 28, 30}};

        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int a = arr[i][j];
                sum += a;
            }
        }
        System.out.println(sum);
    }
}
