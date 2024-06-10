import java.util.Arrays;
import java.util.Scanner;

public class deleteOneNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu "+i+" cua mang: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Nhap phan tu can xoa: ");
        int a = sc.nextInt();
        deleteNumber(a,arr);

    }

    public static void deleteNumber(int a, int[] arr) {
        int vt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                vt = i;
            }
        }
        for (int j = vt; j < arr.length-1; j++) {
            arr[j] = arr[j+1];
        }
        arr[arr.length-1] = 0;
        System.out.println(Arrays.toString(arr));
    }
}
