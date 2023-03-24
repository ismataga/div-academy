package lesson4;

public class StringEx {
    public static void main(java.lang.String[] args) {

        String s = "Hello world";
        String s1 = s;
        String s2 = "Hllo" + "world";
        String s3 = new String("Hello ");
        String s4 = s3 + "world";

        System.out.println(s1.equals(s4));//Deyerlrin muqayisesi ucun istifaded edirik

        System.out.println(s1.length());

        System.out.println(s.charAt(0)); // s[0]; ile eynidir

        System.out.println(s.indexOf('e'));
        int index = -1;
        do {
            index = s.indexOf('i');
          if(index>-1) { System.out.println(index+1);}
        } while (index >= 0);

        String srt   = "divacademy";



    }
}
