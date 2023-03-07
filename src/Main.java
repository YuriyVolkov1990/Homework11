import javax.lang.model.element.VariableElement;
import java.util.Scanner;
public class Main {
    public static void leapYear(int yearCalc) {
        int leapYear, notLeapYear, leapYearPlus;
        leapYear = yearCalc % 4;
        leapYearPlus = yearCalc % 400;
        notLeapYear = yearCalc % 100;
        switch (leapYear) {
            case 0:
                switch (leapYearPlus) {
                    case 0:
                        System.out.println(yearCalc + " год является високосным");
                        break;
                    default:
                        if (notLeapYear == 0) {
                            System.out.println(yearCalc + " год не является високосным");
                        } else {
                            System.out.println(yearCalc + " год является високосным");
                        }
                }
                break;
            default:
                System.out.println(yearCalc + " год не является високосным");
        }
    }
    public static void main(String[] args) {
        task1();

    }

    public static void task1() {
        System.out.println("Задача 1(Бывшая 3)");
        Scanner y = new Scanner(System.in);
        System.out.println("Введите год ");
        int year = y.nextInt();
        leapYear(year);
    }
}