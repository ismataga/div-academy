package lesson2;

public class Tasks {
    public static void main(String[] args) {

        //1.	Yaş 18dən böyük bərabərdirsə “Welcome”, əks halda “Access denied” çap edən proqram yazın.
        // Bunu Ternary istifadə edərək yazın.


        //4.	Bir ədədin bütün rəqəmlərini ayrı-ayrılığda çap edən proqram yazın.
        // Məsələn, 562 ədədini yazmışığsa console-da bizə
        //
        //5
        //6
        //2
        //
        //çap etsin. (while-dan istifadə edin.)
//        int value = 562;
//        while (value > 0) {
//            int seperate = 0;
//            int rest = value % 10;
//            value = value / 10;
//            System.out.println("" + rest);
//        }

        int u = 0;
        int r = 562;
        while (r > 0) {
            r = r / 10;
            u++;
        }
        System.out.println(u);

        while (r > 0) {
            System.out.println(r / Math.pow(10, u-1));
        }
    }
}
