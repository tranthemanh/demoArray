import java.util.Arrays;
import java.util.Scanner;

public class addNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + i + " cua mang: ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Nhap vi tri can them: ");
        int a = sc.nextInt();
        System.out.println("Nhap gia tri cua vi tri " + a + " : ");
        int b = sc.nextInt();

        addOneNumber(a, b, arr);
    }

    public static void addOneNumber(int n, int m, int[] arr) {
        int[] brr = new int[arr.length + 1];
        for (int i = 0, j = 0; i < arr.length; i++, j++) {
            if (j == n) {
                i = j-1;
                brr[j] = m;
                continue;
            }
            brr[j] = arr[i];
        }
        System.out.println(Arrays.toString(brr));
    }
}
