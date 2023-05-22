import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.print("Bir değer giriniz : ");
        int input = scanner.nextInt();
        double result=0;
        for(double i=1; i<=input; i++){

            result=result+(1.0/ i);
        }
        System.out.println("Harmonik değer : "+result);

    }
}