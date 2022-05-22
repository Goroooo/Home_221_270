public class Home231_250 {
    public static void main(String[] args) {


        //Task 231, 232 , 233
        int[] ar = {10, 11, 24, 57, 56, 4, 3, 8, 15};
        int x = 0;
        int count = 0;
        int art = 1;
        int gum = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] % 2 == 0) {
                x = x + ar[i] * ar[i];
                art = art * ar[i];
                gum = gum + ar[i];
                count++;
            }
        }
        System.out.println("X = " + x);
        System.out.println("Count = " + count);
        System.out.println("Art = " + art);
        System.out.println("Gum = " + gum);
        System.out.println();

        //Task 234, 235, 236
        int[] arr = {31, 45, 84, 60, 17, 28, 42, 66, 38};
        int y = 0;
        int qan = 0;
        int bazm = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                y = y + arr[i];
                qan++;
                bazm = bazm * arr[i];
            }
        }
        int k = y / qan;
        System.out.println("K = " + k);
        System.out.println("Qan = " + qan);
        System.out.println("Bazm = " + bazm);
        System.out.println();

        //Task 237
        int[] array = {10, 0, 25, 0, 44, 78, 0, 0, 0, 0, 1, 2, 3, 46, 55, 0, 0, 0};
        int zro = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                zro++;
            }
        }
        System.out.println("Zro = " + zro);
        System.out.println();

        //Task 238, 240
        int[] newAr = {9, 12, 15, 60, 23, 11, 77, 55, 86, 49, 20};
        int a = 0;
        int hash = 0;
        for (int i = 0; i < newAr.length; i++) {
            if (newAr[i] % 3 == 0) {
                a = a + newAr[i];
                hash++;
            }
        }
        int r = a / hash;
        System.out.println("R = " + r);
        System.out.println("Hash = " + hash);
        System.out.println();

        //Task 241, 242, 243
        int[] newArr = {24, 30, 85, 99, 124, 306, 45, 8, 6, 10, 72, 5, 32};
        int m = 5;
        int aa = 0;
        int bb = 0;
        int cc = 1;
        for (int i = 0; i < newArr.length; i++) {
            if (newArr[i] % m == 0) {
                aa = aa + newArr[i];
                bb++;
                cc = cc * newArr[i];
            }
        }
        System.out.println("AA = " + aa);
        System.out.println("BB = " + bb);
        System.out.println("CC = " + cc);
        System.out.println();

        //Task 244
        int[] newArray = {7, 14, 21, 55, 64, 57, 98, 32, 40, 77,};
        int xx = 1;
        for (int i = 0; i < newArray.length; i++) {
            int z = newArray[i];
            if (z % 5 == 2) {
                xx = xx * z;
            }
        }
        System.out.println("XX = " + xx);
        System.out.println();

        //Task 245
        int[] aram = {12, 40, 55, 62, 32, 84, 10, 20, 30, 40, 8};
        int w = 0;
        for (int i = 0; i < aram.length; i++) {
            if ((aram[i] + i) % 3 == 0) {
                w = w + aram[i] * aram[i];
            }
        }
        System.out.println("W = " + w);
        System.out.println();

        //Task 248
        int[] arm = {35, 84, 6, 2, 14, 12, 10, 80, 65, 35, 25, 41, 73, 66};
        int ww = 0;
        int kk = 5;
        for (int i = 0; i < arm.length; i++) {
            if ((arm[i] + i) * (arm[i] + i) % kk == 0) {
                ww = ww + arm[i];
            }
        }
        System.out.println("WW = " + ww);
        System.out.println();

        //Task 250
        int[] armen = {12, 99, 45, 6, 8};
        int s = 1;
        for (int i = 0; i < armen.length; i++) {
            if ((armen[i] * i) % 3 == 2) {
                s = s * (armen[i] * armen[i]);
            }
        }
        System.out.println("S = " + s);
    }
}
