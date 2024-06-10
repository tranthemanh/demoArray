import java.util.Scanner;

public class FindMaxTwoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so hang cua ma tran: ");
        int n = sc.nextInt();
        System.out.print("Nhap so cot cua ma tran: ");
        int m = sc.nextInt();
        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Nhap phan tu hang "+i+ " cot "+j+": ");
                arr[i][j] = sc.nextInt();
            }
        }
        findMaxTwoArray(arr);
    }

    public static void findMaxTwoArray(int[][] arr1) {
        int max = arr1[0][0];
        int hang = 0;
        int cot = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                if (arr1[i][j] > max) {
                    max = arr1[i][j];
                    hang = i;
                    cot = j;
                }
            }
        }
        System.out.println("Phan tu lon nhat trong mang la: " + max + "\n" + "Vi tri hang thu " + hang + "\n" + "Vi tri cot thu " + cot);
    }
}
