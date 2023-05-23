import java.util.Arrays;

public class Main {

    static boolean isEven(int value, int[] arr) { //Parametre olarak alınan dizideki çift olan elemanların kontrolü

        for (int i : arr) {
            if (arr[i] % 2 == 0) {
                return true;
            }
        }
        return false;
    }

    static boolean isFind(int value, int[] arr) { //aynı olan sayıların ikişer yazılmasın
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[] list = {8, 9, 3, 12, 8, 14, 5, 25, 45, 2, 12, 14}; //Dizi tanımlıyoruz.
        int[] dublicate = new int[list.length]; // tekrar eden sayıların depolanacağı dizi
        int startIndex = 0;
        System.out.print("Kontrol Edilecek Dizi : ");
        //Diziyi ekrana bas
        for (int i = 0; i < list.length; i++) {
            System.out.print(+list[i] + ",");
        }
        System.out.println();
        System.out.print("Dizi içerisindeki tekrar eden çift sayılar : ");

        //diziyi ilk elemandan 0. indisten başlayarak gez
        for (int i = 0; i < list.length; i++) {
            //diziyi tekrar 0. indisten başlayarak gez
            for (int j = 0; j < list.length; j++) {
                //i 0 iken j 0 olunca koşul sağlanmaz ve j 1 olur. dizinin elemanları karşılaştırılmaya başlar
                if ((i != j) && (list[i] == list[j])) {
                    //isfind metoduyla dizi alınır ve tekrar eden sayı varsa tek olarak yazılır
                    if (!isFind(list[i], dublicate)) {
                        //tekrarsız dizideki elemanlar kontrol edilir ve tek olanlar ayrılır. çift olanlar bırakılır.
                        if (isEven(list[i], dublicate))
                            dublicate[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }
        //ayıklanan dizi ekrana yazdırılır.
        System.out.println(Arrays.toString(dublicate));
    }
}