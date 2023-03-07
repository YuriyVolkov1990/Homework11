import java.util.Scanner;
public class Main {
    public static void leapYear(int year) {
        int leapYear, notLeapYear, leapYearPlus;
        year = 500;
        leapYear = year % 4;
        leapYearPlus = year % 400;
        notLeapYear = year % 100;
        switch (leapYear) {
            case 0:
                switch (leapYearPlus) {
                    case 0:
                        System.out.println(year + " год является високосным");
                        break;
                    default:
                        if (notLeapYear == 0) {
                            System.out.println(year + " год не является високосным");
                        } else {
                            System.out.println(year + " год является високосным");
                        }
                }
                break;
            default:
                System.out.println(year + " год не является високосным");
        }
    }
    public static void main(String[] args) {
        task1();

    }

    public static void task1() {
        System.out.println("Задача 1(Бывшая 3)");
        Scanner y = new Scanner(System.in);
        System.out.println("Введите год ");
        String year = s.nextLine();

    }
}