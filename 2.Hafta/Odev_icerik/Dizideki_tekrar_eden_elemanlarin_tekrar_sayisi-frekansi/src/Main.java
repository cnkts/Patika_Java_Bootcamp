import jdk.jfr.Frequency;

import java.sql.ClientInfoStatus;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};

        // Elemanlar ve tekrar sayılarını saklamak için iki ayrı dizi oluşturuyoruz.
        int[] elements = new int[arr.length];
        int[] frequency = new int[arr.length];
        int elementsCount = 0;

        // Diziyi dolaşarak ana dizideki elemanları ve kaç kez tekrar ettklerini teşpit ediyoruz.
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            boolean elementFound = false;

            //Elements dizisinde arr[i] var mı kontrol et
            for (int j = 0; j < elementsCount; j++) {
                // Eleman daha önce elemanlar dizisinde bulunduysa frekansını bir arttır
                if (elements[j] == element) {
                    frequency[j]++;
                    elementFound = true;
                    break;
                }
            }
            // Eleman elemanlar dizisinde bulunmadıysa yeni bir giriş yap
            if (!elementFound) {
                elements[elementsCount] = element;
                frequency[elementsCount] = 1;
                elementsCount++;
            }
        }
        // Tekrar sayılarını yazdır
        for (int i = 0; i < elementsCount; i++) {
            System.out.println(elements[i] + " sayısı " + frequency[i] + " kere tekrar edildi.");
        }

    }
}





