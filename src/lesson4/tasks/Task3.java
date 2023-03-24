package lesson4.tasks;

public class Task3 {
    public static void main(String[] args) {
        //3.	Daxil olunmuş sətirdə hansı hərfdən, neçə dəfə istifadə olunduğunu tapan proqram yazın.
        // Böyük və ya kiçik hərf həssasiyyəti olmasın. Yəni, böyük A-da kiçik a-da eyni simvolu ifadə etsin.
        // (Bu biraz çətin gələ bilər, yazmağa cəhd edin, amma alındıra bilmədizsə problem deyil.
        // Dərsdə bir yerdə baxacayığ.)
        //
        //Input:                                    Output:
        //Java j!                                     j – 2
        //                                                a – 2
        //                                                v – 1
        //                                                   – 1 (space)
        //                                                ! – 1

        int[]  nums = new int[256];

        String s = "Java j!";

        s = s.toLowerCase();


        for (int i = 0; i < s.length(); i++) {
            nums[s.charAt(i)]++;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]   > 0) System.out.println((char) i + " - " + nums[i]);
        }

    }
}