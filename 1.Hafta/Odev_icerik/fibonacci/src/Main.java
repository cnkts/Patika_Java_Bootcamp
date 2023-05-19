import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Bir Sayı Girin:");
        int num = scanner.nextInt();
        int t1 = 0, t2 = 1;
        System.out.print(num + " Sayısının Fibonacci Sayıları: ");

        for (int i = 1; i <= num; ++i)
        {
            System.out.print(t1 + " + ");
            int toplam = t1 + t2;
            t1 = t2;
            t2 = toplam;
        }
    }
}