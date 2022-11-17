import java.util.Scanner;

public class Task3 {
    public static int deliveryDistance(int distance) {
        int countDay = 0;
        if (distance <= 20) {
            countDay += 1;
            System.out.println("Потребуется дней: " + countDay);
        } else if (distance > 20 && distance <= 60) {
            countDay += 2;
            System.out.println("Потребуется дней: " + countDay);
        } else if (distance > 60 && distance <= 100) {
            countDay += 3;
            System.out.println("Потребуется дней: " + countDay);
        } else {
            System.out.println("Более 100км расстояния доставка не производится");
        }
        return countDay;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите дистанцию: ");
        deliveryDistance(sc.nextInt());
    }
}
