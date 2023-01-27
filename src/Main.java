import java.time.LocalDate;

public class Main {
    public static void leapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " Год является високосным");
        } else {
            System.out.println((year + " Год не является високосным"));
        }

    }

    public static void versionDevice(int year, int clientOs) {
        int currentYear = LocalDate.now().getYear();
        if (clientOs == 0) {
            if (year < currentYear) {
                System.out.println("Установите облегченную версию iOS");
            } else {
                System.out.println("Установите обычную версию iOS");
            }

        } else {
            if (year < currentYear) {
                System.out.println("Установите облегченную версию Android");
            } else {
                System.out.println("Установите обычную версию Android");
            }
        }
    }

    public static int calculationDeliveryDays(int distance) {
        int deliveryDays = 1;
        if (distance > 100) {
            deliveryDays = 0;
        } else {
            if (distance > 20 && distance <= 60) {
                deliveryDays++;
            }
            if (distance > 60 && distance <= 100) {
                deliveryDays += 2;
            }
        }


        return deliveryDays;
    }

    private static void task1() {
        System.out.println("Задача №1");
        int year = 2023;
        leapYear(year);
    }

    private static void task2() {
        System.out.println("Задача №2");
        int clientOs = 0;
        int year = 2023;

        versionDevice(year, clientOs);
    }

    private static void task3() {
        System.out.println("Задача №3");
        int deliveryDistance = 95;
        calculationDeliveryDays(deliveryDistance);
        int totalDaysDelivery = calculationDeliveryDays(deliveryDistance);
        if (totalDaysDelivery == 0) {
            System.out.println("Доставка не осуществляется");
            return;
        }
        System.out.println("Итого дней доставки: " + totalDaysDelivery);
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }
}