import java.util.Scanner;

public class Task1 {
    public static void leapYear(int y) {
        if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
            System.out.println(y + " год является високосным");
        } else {
            System.out.println(y + " год не является високосным");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите год: ");
        leapYear(sc.nextInt());
    }
}
