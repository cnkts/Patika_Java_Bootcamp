import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı yazın : ");
        int n= inp.nextInt();

        //Elmasın üst kısmı
        for (int i=1; i <= n ; i++){
            //Boşluklar basıldı
            for (int k = 0; k < (n-i); k++ )
            {
                System.out.print(" ");
            }
            //Satırlara yıldızlar basıldı
            for (int j=1; j<= (2*i-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Elmasın alt kısmı
        for (int a= n-1; a >= 0; a--)
        {
            for (int b=0; b < n-a; b++)
            {
                System.out.print(" ");
            }
            //Satırlara yıldızlar basıldı
            for (int c=1; c<=(2*a-1); c++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}