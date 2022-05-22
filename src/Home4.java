public class Home4 {
    public static void main(String[] args) {

        //Task 221
        int[] arr = new int[100];
        int a = 10;
        int b = 20;
        int x = 0;
        for (int i = 0; i <= b; i++) {
            arr[i] = i + 1;
            if (i >= a) {
                x += arr[i];
            }
        }
        System.out.println(x);

        //Task 222
        int[] ar = new int[50];
        int c = 7;
        int d = 15;
        int y = 1;
        for (int i = 0; i <= d; i++) {
            arr[i] = i;
            if (i >= c) {
                y *= arr[i];
            }
        }
        System.out.println(y);

        //Task 223
        int[] array = new int[100];
        int aa = 80;
        int bb = 10;
        int count = 0;
        for (int i = 0; i <= aa; i++) {
            array[i] = i;
            if (i >= bb) {
                count++;
            }
        }
        System.out.println(count);

//        //Task ete avelacnenq +1
//        int[] newAr = new int[40];
//        int xx = 0;
//        int k = 8;
//        for (int i = 0; i < newAr.length; i++) {
//            newAr[i] = i;
//            if (i % k == 0) {
//                xx = xx + (newAr[i] * newAr[i]);
//            }
//        }
//        System.out.println(xx);
//
//        int n = (8 * 8) + (16 * 16) + (24 *24)+ (32 * 32);
//        System.out.println(n);

        //Task 227
        int[] newArr = new int[40];
        int countt = 0;
        int h = 0;
        int j = 8;
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = i;
            if (i % j == 0) {
                countt++;
                h = h + newArr[i];
            }
        }
        int l = h / countt;
        System.out.println("L = " + l);

        //Task 228
        int[] newArray = new int[40];
        int m = 4;
        int v = 0;
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = i;
            if (i % m == 0) {
                v = v + newArray[i];
            }
        }
        System.out.println(v);

        //Task 229
        int[] ara = {12, 8, 5, 8, 2, 4, 3, 1, 10};
        int z = 1;
        for (int i = 0; i < ara.length; i++) {
            if (ara[i] - i > 0) {
                z = z * ara[i];
            }
        }
        System.out.println(z);
    }
}





