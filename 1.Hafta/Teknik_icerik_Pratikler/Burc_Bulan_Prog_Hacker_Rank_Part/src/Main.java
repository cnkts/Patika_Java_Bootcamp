import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        // N is odd
        // N%2 give remainder when divided by 2
        // if-else ladder
        if (N%2 != 0) {
            System.out.println("Weird");
        }
        else if (N>=2 && N<=5){
            System.out.println("Not Weird");
        }
        else if (N>=6 && N<=20){
            System.out.println("Weird");
        }
        else{
            System.out.println("Not Weird");
        }

    }
}