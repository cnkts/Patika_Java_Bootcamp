# Proje 1

* [22,27,16,2,18,6] -> Insertion Sort
* Yukarı verilen dizinin sort türüne göre aşamalarını yazınız.
* Big-O gösterimini yazınız.
* Time Complexity: Dizi sıralandıktan sonra 18 sayısı aşağıdaki case'lerden hangisinin kapsamına girer? Yazınız
* Average case: Aradığımız sayının ortada olması
* Worst case: Aradığımız sayının sonda olması
* Best case: Aradığımız sayının dizinin en başında olması.
* [7,3,5,8,2,9,4,15,6] dizisinin Selection Sort'a göre ilk 4 adımını yazınız.

```
Insertion Sort ile verilen dizinin aşamaları:

Adım 1: [22, 27, 16, 2, 18, 6]
Adım 2: [22, 27, 16, 2, 18, 6]
Adım 3: [16, 22, 27, 2, 18, 6]
Adım 4: [2, 16, 22, 27, 18, 6]
Adım 5: [2, 16, 18, 22, 27, 6]
Adım 6: [2, 6, 16, 18, 22, 27]

Big-O gösterimi: O(n^2)

Time Complexity: 18 sayısı, dizi sıralandıktan sonra Average case (ortalama durum) kapsamına girer, çünkü aranan sayının ortada olması durumunda ortalama bir arama süresi elde edilir.

[7, 3, 5, 8, 2, 9, 4, 15, 6] dizisinin Selection Sort'a göre ilk 4 adımı:

Adım 1: [2, 3, 5, 8, 7, 9, 4, 15, 6]
Adım 2: [2, 3, 5, 8, 7, 9, 4, 15, 6]
Adım 3: [2, 3, 4, 8, 7, 9, 5, 15, 6]
Adım 4: [2, 3, 4, 5, 7, 9, 8, 15, 6]

Her adımda, en küçük eleman seçilir ve dizinin uygun konumuna yerleştirilir.
```

# Proje 2

* [16,21,11,8,12,22] -> Merge Sort
* Yukarıdaki dizinin sort türüne göre aşamalarını yazınız.
* Big-O gösterimini yazınız.

```
Merge Sort ile verilen dizinin aşamaları:

Adım 1: [16, 21, 11, 8, 12, 22]
Adım 2: [16, 21, 11] [8, 12, 22]
Adım 3: [16] [21, 11] [8] [12, 22]
Adım 4: [16] [11, 21] [8] [12, 22]
Adım 5: [11, 16, 21] [8, 12, 22]
Adım 6: [8, 11, 12, 16, 21, 22]

Big-O gösterimi: O(n log n)
```

# Proje 3

* [7, 5, 1, 8, 3, 6, 0, 9, 4, 2] dizisinin Binary-Search-Tree aşamalarını yazınız.
* Örnek: root x'dir. root'un sağından y bulunur. Solunda z bulunur vb.

```
[7, 5, 1, 8, 3, 6, 0, 9, 4, 2] dizisinin Binary Search Tree aşamaları aşağıdaki gibi olur:

Adım 1: 7 (root)
Adım 2: 7 (root), 5 (solunda)
Adım 3: 7 (root), 5 (solunda), 1 (solunda)
Adım 4: 7 (root), 5 (solunda), 1 (solunda), 0 (solunda)
Adım 5: 7 (root), 5 (solunda), 1 (solunda), 0 (solunda), 3 (sağında)
Adım 6: 7 (root), 5 (solunda), 1 (solunda), 0 (solunda), 3 (sağında), 6 (sağında)
Adım 7: 7 (root), 5 (solunda), 1 (solunda), 0 (solunda), 3 (sağında), 6 (sağında), 8 (sağında)
Adım 8: 7 (root), 5 (solunda), 1 (solunda), 0 (solunda), 3 (sağında), 6 (sağında), 8 (sağında), 9 (sağında)
Adım 9: 7 (root), 5 (solunda), 1 (solunda), 0 (solunda), 3 (sağında), 6 (sağında), 8 (sağında), 9 (sağında), 4 (solunda)
Adım 10: 7 (root), 5 (solunda), 1 (solunda), 0 (solunda), 3 (sağında), 6 (sağında), 8 (sağında), 9 (sağında), 4 (solunda), 2 (solunda)
```
