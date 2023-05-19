import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.print("Bir n sayisi giriniz:");
        int n=scanner.nextInt();
        for (int i=n;i>=1;i--){
            for (int j=(n-i);j>=1;j--){
                System.out.print(" ");
            }
            for (int k=((2*i)-1);k>=1;k--){
                System.out.print("*");
            }
            System.out.println("");
        }


    }
}