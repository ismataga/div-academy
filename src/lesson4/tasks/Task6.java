package lesson4.tasks;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
//        7. Kiçik bir axtarış sistemi quracayıq.String tipində olan massivdə bir çox adlar yer alsın.
//                Və daha sonra console`da bizdən input istənilsin.Məsələn:
//        String[] users = {“Abbas”, “Ləman”, “Xədicə”, “Ilyas”, “Nurlan”, “Nihat”, “Elçin”, “Eldar”,
//        “Mirhəsən”, “Emin”, “Təranə”};-belə bir massivimiz var.
//                Men console - da ‘abb’ –daxil ederkən proqram anlasın ki, mən Abbası axtarıram.
//        Və həmin adı tamamlayaraq yanında index -i olmağla çap etsin.
//                Yox əgər, uyğun gələn bir çox ad varsa hamısını çap etsin.
//        Əks halda isə belə bir user yoxdur desin.
//
//        Input:
//        Output:
//        El Elçin –6
//        Eldar –7



        String[] users = {"Abbas", "Ləman", "Xədicə", "Ilyas", "Nurlan", "Nihat", "Elçin", "Eldar", "Mirhəsən", "Emin", "Təranə"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter users: ");
        String keyword = sc.nextLine();
        boolean found = false;

// using simple iteration over the array elements
        for (int i = 0; i<users.length;i++) {
            if (users[i].toLowerCase().contains(keyword )) {
                System.out.println(users[i] + "[" + i+ "]");
                found = true;
            }
        }
        if(!found){
            System.out.println("Belə bir istifadəçi yoxdur.");
        }
    }
}