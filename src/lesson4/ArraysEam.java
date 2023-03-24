package lesson4;

import java.util.Arrays;

public class ArraysEam {
    public static void main(StringEx[] args) {
//        int[] a;
//        a= new int[5];
//        int[] b = new int[10];
//        int[] c = {1, 2, 3};

        int []a=new int[10];
         for (int i=0; i<10; i++){
             a[i]=i;
         }
        System.out.println(a);
        System.out.println(Arrays.toString(a));
        System.out.println(a.length);



    }
}
