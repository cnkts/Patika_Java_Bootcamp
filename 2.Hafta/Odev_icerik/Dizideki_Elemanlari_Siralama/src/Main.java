import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizinin boyutu n : ");
        int arrLenght = scanner.nextInt();
        System.out.println("Dizinin elemanlarını giriniz : ");
        int[] arr = new int[arrLenght];

        for (int i = 0; i < arrLenght; i++) {
            System.out.print(i + ". eleman :");
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < arr.length - 1; i++) { //Dizi elemanlarını sırası ile alıyoruz

            int num = arr[i]; //sıradaki değeri sayi değişkenine atıyoruz
            int temp = i; //sayi 'nin indeksini temp değerine atıyoruz

            for (int j = i + 1; j < arr.length; j++) { //dizimizde i' den sonraki elemanlara bakıyoruz
                if (arr[j] < num) { // i den küçük sayı var mı
                    num = arr[j]; //varsa num değişkenimizide değiştiriyoruz
                    temp = j; //indeks değerinide değiştiriyoruz
                }
            }

            if (temp != i) { //num değeri başlangıç değeri ile aynı değil ise , yani list[i]'nin değerinden küçük sayı varsa onları yer değiştiriyoruz
                arr[temp] = arr[i];
                arr[i] = num;
            }

        }
        for (int sayi : arr) {
            //Sıralanmış diziyi ekrana yazdırıyoruz.
            System.out.print(sayi + " ");

        }
    }
}