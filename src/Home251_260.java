public class Home251_260 {
    public static void main(String[] args) {

        //Task 251, 252, 253, 254
        int[] ar = {45, 12, 78, 98, 65, 32, 10, 20, 30, 50, 60, 780, 8, 5, 94, 6, 16, 8,};
        int max = ar[0];
        int min = ar[0];
        int sum = 0;
        int art = 1;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > max) {
                max = ar[i];
            }
            if (ar[i] < min) {
                min = ar[i];
            }
        }
        art = max * min;
        sum = max + min;
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
        System.out.println("Sum = " + sum);
        System.out.println("Art = " + art);
        System.out.println();

        //Task 255, 256
        int[] arr = {12, 6, 45, 91, 37, 58, 72, 20, 4, 9, 55};
        int maxx = arr[0];
        int minn = arr[0];
        int maxIndex = 0;
        int minIndex = 0;
        int maxSum = 0;
        int minSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxx) {
                maxx = arr[i];
                maxIndex = i;
            }
            if (arr[i] < minn) {
                minn = arr[i];
                minIndex = i;
            }
        }
        maxSum = maxx + maxIndex;
        minSum = minn + minIndex;
        System.out.println("MaxSum = " + maxSum);
        System.out.println("MinSum = " + minSum);
        System.out.println();

        //Task 257, 258, 259, 260
        int[] array = {12, 40, 5, 3, 40, 3, 18, 20};
        int maxik = array[0];
        int maxik2 = array[0];
        int maxikIndex = 0;
        int maxik2Index = 0;
        int mini = array[0];
        int mini2 = array[0];
        int miniIndex = 0;
        int mini2Index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxik) {
                maxik = array[i];
                maxikIndex = i;
            }
            if (array[i] >= maxik2) {
                maxik2 = array[i];
                maxik2Index = i;
            }
            if (array[i] < mini) {
                mini = array[i];
                miniIndex = i;
            }
            if (array[i] <= mini2) {
                mini2 = array[i];
                mini2Index = i;
            }
        }
        System.out.println("Maxikindex = " + maxikIndex);
        System.out.println("Maxik2Index = " + maxik2Index);
        System.out.println("MiniIndex = " + miniIndex);
        System.out.println("Mini2Index = " + mini2Index);
    }
}
