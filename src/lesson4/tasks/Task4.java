package lesson4.tasks;

public class Task4 {
    public static void main(String[] args) {
//        4.	Daxil olunmuş sətirin palindrome olub olmamasını yoxlayan proqram yazın.
//                Polindrome – sətirin tərsi ilə düzünün bir-birinə bərabər olmağıdır.
//        Input:                                    Output:
//        noon                                       true
//        Input:                                    Output:
//        Java                                        false


        String str = "false";

        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);

        }

        if(str.equals(reversed)){
            System.out.println("The seneteces is polindrome");
        }else{
            System.out.println("The seneteces is not polindrome");
        }

    }
}
