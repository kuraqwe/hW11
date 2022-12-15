import java.time.LocalDate;

public class Main {

    //the first task
    public static void checkYear(int year){
        if (year % 4 == 0 && year % 100 != 0 && year % 400 != 0) {
            System.out.println(year + " - високосный год.");
        } else {
            System.out.println(year + " - невисокосный год.");
        }

    }

    //the second task
    public static void checkOS(boolean OS, int year) {
        if (OS){
            if (year == LocalDate.now().getYear()) {
                System.out.println("Установите версию приложения для Android.");
            }else{
                System.out.println("Установите облегченную версию приложения для Android по ссылке.");
            }
        }else{
            if (year == LocalDate.now().getYear()) {
                System.out.println("Установите версию приложения для IOS.");
            }else{
                System.out.println("Установите облегченную версию приложения для IOS.");
            }
        }
    }

    //the third task
    public static void timeOfDelivery(int kilometers){
        int days = (kilometers - 20) / 40 + 2;
        System.out.println("Потребуется дней - " + days);
    }

    public static void main(String[] args) {
        //the first task
        for (int i = 1600; i < 2000; i++) {
            checkYear(i);
        }
        //the second task
        boolean OS = false;
        int productionYear = 2022;
        checkOS(OS, productionYear);
        //the third task
        int deliveryDistance = 95;
        timeOfDelivery(deliveryDistance);
    }
}