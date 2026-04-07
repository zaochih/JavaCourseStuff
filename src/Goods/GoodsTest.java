package Goods;

import java.util.Arrays;
import java.util.Scanner;

public class GoodsTest {
    static void main() {
        Goods[] arr = new Goods[3];
//        Goods g1 = new Goods("001", "HUAWEI Mate 40", 200);
//        Goods g2 = new Goods("002", "XIAOMI Su 7", 100);
//        Goods g3 = new Goods("003", "iPhone 17", 300);
//
//        arr[0] = g1;
//        arr[1] = g2;
//        arr[2] = g3;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Goods();
            arr[i].setId(sc.next());
            arr[i].setName(sc.next());
            arr[i].setRemains(sc.nextInt());
        }

        for (int i = 0; i < arr.length; i++) {
            IO.println(arr[i]);
        }
    }


}
