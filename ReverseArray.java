import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int[] arr2 = new int[5];

        //Nhap phan tu cua mang
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhap phan tu "+i+" :");
            arr[i] = sc.nextInt();
        }
        reverseArray(arr,arr2);
    }

    public static void reverseArray(int[] arr, int[] arr2) {
        for (int i = 0; i < arr.length; i++) {
            arr2[arr2.length-i-1] = arr[i];
        }
        System.out.println(Arrays.toString(arr2));
    }
}
