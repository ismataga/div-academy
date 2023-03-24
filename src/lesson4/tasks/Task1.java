package lesson4.tasks;

public class Task1 {
    public static void main(String[] args) {
//1.	String str = “             1,e 6,e 0,e 9           ”;
// verilmiş sətirdəki rəqəmlərin kvadratları cəmini tapan proqram yazın.
//Yəni, 12 + 62 + 02 + 92 = 118
//Output:
//118


        String str = "1,e 6,e 0,e 9";

        int i =0;
        int sum=0;
        for (i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if (Character.isDigit(c)) {
                int num = Character.getNumericValue(c);
                sum += num * num;
            }
        }
        System.out.println(sum);
    }
}

