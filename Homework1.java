/**
 * @author Elizaveta Elyashova
 * @version 12.08.2018.
 */
public class Homework1 {
    public static void main (String[] args) {
        byte a = 12;
        int b = 15;
        short c = 1234;
        long d = 1234567;
        float e = 123.5f;
        double f = 2345.895;
        char g = 'g';
        boolean h = true;

        System.out.println ("Задание 3: " + calculator(5,6,7,8));

        System.out.println ("Задание 4: " + sum_from10to20(5,8));

        System.out.print ("Задание 5: ");
        is_positive(-46);

        System.out.println ("Задание 6: " + is_negative(-23));

        System.out.print ("Задание 7: ");
        hello("Андрей");

        System.out.print ("Задание 8: ");
        leap_year(2008);

    }

    private static int calculator (int a, int b, int c, int d) {
        return (a*(b+(c/d)));
    }

    private static boolean sum_from10to20 (int a, int b) {
        if ((a+b >= 10) && (a+b <= 20)) return true;
        else return false;
    }

    private static void is_positive (int a) {
        if (a >= 0) System.out.println (a + " положительное");
        else System.out.println (a + " отрицательное");
    }

    private static boolean is_negative (int a) {
        if (a < 0) return true;
        else return false;
    }

    private static void hello (String name) {
        System.out.println ("Привет, " + name + "!");
    }

    private static void leap_year (int year) {
        if ((year%4 == 0) && ((year%100 != 0) || (year%400 == 0))) System.out.println("Это високосный год");
        /*
        * В первых скобках проверяем кратность года 4, если остаток от деления 0, то, значит, год високосный
        * Во вторых скобках проверяем не ялвяется ли этот год сотым, если остаток от деления не равен 0, значит, не является
        * В третьих скобках проверяем не является ли год четырехсотым, если остаток от деления 0, значит, является
        * Чтобы получить вискосный год мы должны знать, что год делится на 4 и либо не делится на 100, либо делится на 400
        * */
        else System.out.println ("Это невисокосный год");
    }
}
