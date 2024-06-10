import java.util.Scanner;

public class TongDuongCheoChinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Nhap phan tu hang " + i + " cot " + j + ": ");
                arr[i][j] = sc.nextInt();
            }
        }
        tongDuongCheo(arr);
    }

    public static void tongDuongCheo(int[][] arr) {
        int dc1 = 0;
        int dc2 = 0;
        int sum = 0;
        for (int i = 0, j = 0; i < arr.length; i++, j++) {
            dc1 += arr[i][j];
        }
        for (int i = arr.length - 1, j = arr.length -1; i >= 0; i--, j--) {
            dc2 += arr[i][j];
        }
        sum = dc1 + dc2;
        System.out.println("Tong duong cheo chinh la: "+sum);
    }
}
