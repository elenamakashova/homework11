import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void checkLeapYear(int year) {
        if (year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " год является високосным");
        } else System.out.println(year + " год не високосный");
    }

    public static void checkOSType(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0 && clientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static void countDeliveryTime(int deliveryDistance) {
        int deliveryTime = 1;
        if (deliveryDistance > 20) {
            deliveryTime++;
        }
        if (deliveryDistance > 60) {
            deliveryTime++;
        }
        System.out.println("На доставку потребуется дней: " + deliveryTime);
        if (deliveryDistance > 100) {
            System.out.println("Доставка не осуществляется");
        }
    }

    public static void task1() {
        System.out.println("Задача 1");
        int year = 1700;
        checkLeapYear(year);
        System.out.println();
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 1;
        int clientDeviceYear = 2023;
        checkOSType(clientOS, clientDeviceYear);
        System.out.println();

    }

    public static void task3() {
        System.out.println("Задача 3");
        int deliveryDistance = 70;
        countDeliveryTime(deliveryDistance);
        System.out.println();
    }
}
