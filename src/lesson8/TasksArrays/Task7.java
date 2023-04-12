package lesson8.TasksArrays;

public class Task7 {
    public static void main(String[] args) {
//7.	Daxil edilən 2 ölçülü kvadrat matrisin baş diaqonal elementlərini çap edən proqram yazın. (int[][], for, şərt)

        int[][] matris = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for(int i = 0; i < matris.length; i++){
            System.out.print(matris[i][i] + " ");
        }

    }
}
