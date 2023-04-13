package lesson8.TasksArrays;

public class Task3 {
    public static void main(String[] args) {
//3.	Massiv elementləri içərisində yalnız 4 və 5-ə qalıqsız bölünən ədədləri çap edin.

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 20, 40,5};


        for (int i = 0; i < arr1.length; i++) {
            boolean b =false;
            int a = arr1[i];
            if (a % 4 == 0 && a % 5 == 0) {
                if (a == arr1[arr1.length-1] ) {
                    b=true;
                    System.out.print(a);
                } else {
                    System.out.print(a +",");
                }
                if(i!=0){
                    System.out.print(" ");
                }
            }
        }
    }
}