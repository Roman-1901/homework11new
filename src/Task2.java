import java.time.LocalDate;
import java.util.Scanner;

public class Task2 {
    public static void OsYear(int os, int year) {
        switch (os) {
            case 0:
                if (year < LocalDate.now().getYear()) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                } else {
                    System.out.println("Вы можете установить полную версию приложения для iOS по ссылке");
                }
                break;
            case 1:
                if (year < LocalDate.now().getYear()) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                } else {
                    System.out.println("Вы можете установить полную версию приложения для Android по ссылке");
                }
                break;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите номер устройства: ");
        int clientOS = sc.nextInt();
        if (clientOS < 0 || clientOS > 1) {
            System.out.println("Неверно указано устройство");
        } else {
            System.out.print("Введите год выпуска устройства: ");
            int clientDeviceYear = sc.nextInt();
            OsYear(clientOS, clientDeviceYear);
        }
    }
}
