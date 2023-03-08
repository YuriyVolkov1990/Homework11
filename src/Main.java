import java.time.LocalDate;
import java.util.Scanner;
public class Main {
    public static void leapYear(int yearCalc) {
        int leapYear, notLeapYear, leapYearPlus;
        leapYear = yearCalc % 4;
        leapYearPlus = yearCalc % 400;
        notLeapYear = yearCalc % 100;
        if (leapYear == 0) {
            if (leapYearPlus == 0) {
                System.out.println(yearCalc + " год является високосным");
            } else {
                if (notLeapYear == 0) {
                    System.out.println(yearCalc + " год не является високосным");
                } else {
                    System.out.println(yearCalc + " год является високосным");
                }
            }
        } else {
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
    //public static void delivery (int deliveryDistance) {
        //int deliveryTime = 1;
        //if (deliveryDistance > 0 && deliveryDistance <= 20) {
            //System.out.println("Потребуется дней: " + deliveryTime);
        //} else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            //deliveryTime = deliveryTime + 1;
            //System.out.println("Потребуется дней: " + deliveryTime);
        //} else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            //deliveryTime = deliveryTime + 2;
            //System.out.println("Потребуется дней: " + deliveryTime);
        //} else {
            //System.out.println("Свыше 100 км доставки нет");
        //}
    //}
    public static int deliveryV1 (int deliveryDistance) {
        int deliveryTime = 1;
        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryTime = deliveryTime + 1;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryTime = deliveryTime + 2;
        }
        return deliveryTime;
    }
    public static void main(String[] args) {
        task1();
        task2();
        //task3();
        task3v1();
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
    //public static void task3() {
        //System.out.println("Задача 3");
        //Scanner d = new Scanner(System.in);
        //System.out.println("Введите расстояние от офиса до адреса доставки");
        //int distance = d.nextInt();
        //delivery(distance);
    //}
    public static void task3v1() {
        System.out.println("Задача 3 вариант 2");
        Scanner d = new Scanner(System.in);
        System.out.println("Введите расстояние от офиса до адреса доставки");
        int distance = d.nextInt();
        int time = deliveryV1(distance);
        if (distance > 100) {
            System.out.println("Свыше 100 км доставки нет");
        } else if (time == 1) {
            System.out.println("Для доставки потребуется " + time + " день");
        } else {
            System.out.println("Для доставки потребуется " + time + " дня");
        }
    }
}