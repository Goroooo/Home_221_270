public class Home261_270 {
    public static void main(String[] args) {


        //Task 261
        int[] ar = {1, 3, 2, 9, 6, 4, 5};
        int[] arr = {3, 8, 4, 6, 10, 2, 7};
        int x = 0;
        int y = 0;
        int xCount = 0;
        int yCount = 0;
        int xx = 0;
        int yy = 0;
        int result = 0;
        for (int i = 0; i < ar.length; i++) {
            x = x + ar[i];
            xCount++;
        }
        for (int i = 0; i < arr.length; i++) {
            y = y + arr[i];
            yCount++;
        }
        xx = x / xCount;
        yy = y / yCount;
        result = xx * yy;
        System.out.println("Result = " + result);

        //Task 263, 264
        int[] arra = {12, -64, 44, 50, -3, -7, 80, -100};
        int[] array = {45, -8, -32, 64, 70, 80, 50, -5, -400};
        int sum1 = 0;
        int sum2 = 0;
        int sum = 0;
        for (int i = 0; i < arra.length; i++) {
            if (arra[i] > 0) {
                sum1++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                sum2++;
            }
        }
        sum = sum1 + sum2;
        System.out.println("Sum = " + sum);

        //Task 265
        int[] newAr = {10000, 4000, 5600, 7800, 88, 12, 23, 45};
        int[] newArr = {8, 12, 10};
        int count1 = 0;
        int count2 = 1;
        int count = 0;
        for (int i = 0; i < newAr.length; i++) {
            count1 += newAr[i];
        }
        for (int i = 0; i < newArr.length; i++) {
            count2 *= newArr[i];
        }
        count = count1 / count2;
        System.out.println("Count = " + count);

        //Task 266
        int[] are = {12, 45, 78, 98, 65, 32, 10, 20, 30};
        int[] ark = {74, 85, 96, 14, 25, 36, 65, 45, 98};
        int even = 0;
        int odd = 0;
        int ok = 0;
        for (int i = 0; i < are.length; i++) {
            if (are[i] % 2 == 1) {
                odd += are[i];
            }
        }
        for (int i = 0; i < ark.length; i++) {
            if (ark[i] % 2 == 0) {
                even += ark[i];
            }
        }
        ok = odd - even;
        System.out.println("OK = " + ok);

        //Task 267, 268
        int[] aru = {7, 49, 14, 78, 81, 124, 265, 174};
        int[] ari = {21, 28, 459, 38, 255, 314, 268};
        int countA = 0;
        int countB = 0;
        int countAB = 0;
        int con1 = 0;
        int con2 = 0;
        int con12 = 0;
        for (int i = 0; i < aru.length; i++) {
            if (aru[i] % 7 == 0) {
                con1 += aru[i];
                countA++;
            }
        }
        for (int i = 0; i < ari.length; i++) {
            if (ari[i] % 7 == 0) {
                con2 += ari[i];
                countB++;
            }
        }
        countAB = countA + countB;
        con12 = con1 + con2;
        System.out.println("Count = " + countAB);
        System.out.println("Con = " + con12);

        //Task 269, 270
        int[] aro = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] karo = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int f = 0;
        for (int i = 0; i < aro.length; i++) {
            d += aro[i] * aro[i];
            if (i % 2 == 0) {
                a += aro[i];
            }
        }
        for (int i = 0; i < karo.length; i++) {
            e += karo[i] * karo[i];
            if (i % 2 == 1) {
                b += karo[i];
            }
        }
        c = a + b;
        f = d + e;
        System.out.println("C = " + c);
        System.out.println("F = " + f);
    }
}
