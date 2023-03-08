import javax.lang.model.element.VariableElement;
import java.time.LocalDate;
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
    public static void bankApp(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        switch (clientOS) {
            case 0:
                if (clientDeviceYear == currentYear) {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                } else if (clientDeviceYear < currentYear) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                } else {
                    System.out.println("Вы из будущего, зачем вам это приложение?");
                }
                break;
            case 1:
                if (clientDeviceYear == currentYear) {
                    System.out.println("Установите версию приложения для Android по ссылке");
                } else if (clientDeviceYear < currentYear) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                } else {
                    System.out.println("Вы из будущего, зачем вам это приложение?");
                }
                break;
            default:
                System.out.println("Такая ОС не предусмотрена");
        }
    }
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        System.out.println("Задача 1");
        Scanner y = new Scanner(System.in);
        System.out.println("Введите год ");
        int year = y.nextInt();
        leapYear(year);
    }
    public static void task2() {
        System.out.println("Задача 2");
        Scanner t = new Scanner(System.in);
        System.out.println("Введите тип операционной системы: iOS - 0, Android - 1");
        int typeOS = t.nextInt();
        System.out.println("Введите год выпуска устройства");
        Scanner y = new Scanner(System.in);
        int year = y.nextInt();
        bankApp(typeOS,year);
    }
}