package lesson1.tasks;

public class Task1 {
    public static void main(String[] args) {

        // 1.	Öz ad və soyadınızı console-da çap edin.

        System.out.println("Ad ve soyad " + "Ismat " + "Aghamirzayev");
        System.out.println("Ad ve soyad " + "Ismat" + " " + "Aghamirzayev");
        System.out.println("Ad ve soyad " + "Ismat Aghamirzayev");

        //2.	Kvadratın sahəsini və perimetrini tapan proqram yazın.
        // kvadratin sahesi  = terefi a-dirsa  sahe S = a^;  perimetri p = 4a

        //terefi 5 olan kvadratin sahesi
        int a = 5;
        System.out.println("Kvadratin sahesi = " + a * a);
        System.out.println("Kvadratin sahesi = " + Math.pow(a, 2));

        //terefi 5 olan kvadratin perimetri

        System.out.println("Kvadratin perimetri = " + 4 * a);

        //3.	Dairənin sahəsi və perimetrini tapan proqram yazın.
        // Dairenin sahesi S = 2pir^   perimetri L = 2pir

        //radisu 5 olan dairenin sahesi
        double r = 5;
        double pi = 3.14;
        System.out.println("Dairenin sahesi = " + 2 * pi * r * r);
        System.out.println("Dairenin sahesi = " + 2 * Math.PI * Math.pow(5, 2));

        //radisu 5 olan dairenin perimetri

        System.out.println("Dairenin perimetri = " + 2 * pi * r);
        System.out.println("Dairenin perimetri = " + 2 * Math.PI * r);

        //4.  2 dəyişən üzərində keçdiyimiz bütün riyazi operatorları tətbiq edin. (toplama, çıxma, vurma, bölmə və qalıq)

        int x = 35;
        int y = 20;

        System.out.println(x+y);
        System.out.println(x*y);
        System.out.println(x/y);
        System.out.println(x-y);
        System.out.println(x%y);

        //5.	Int tipində 2 dəyişən təyin edirsiz: age və experience. Daha sonra aşağıda deyəcəyim təlimatları bu dəyişənlərin üzərindən yerinə yetirin.
        //
        //•	Yalnız yaş 18-ə bərabərdirsə və təcrübə 0-dan fərqlidirsə, console-da true çap olunsun.
        //•	Yalnız yaş 18-dən böyük bərabərdirsə və ya təcrübə 3 ildən çoxdursa, console da true çap olunsun.
        //•	Yalnız yaş 18-dən kiçikdirsə və təcrübə 0-dırsa, console-da true çap olunsun.

        int age = 18;
        int experience = 5;

        System.out.println(age ==18 && experience  !=0);
        System.out.println(age >=18 || experience  <3);

        int age1 = 17;
        int experience1 = 0;

        System.out.println(age1 <18 && experience1 ==0);


    }
}
