import java.util.Scanner;

public class TinhTongCuaCot {
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

        System.out.println("Nhap cot can tinh tong: ");
        int a = sc.nextInt();
        tinhTongCuaCot(a,arr);
    }
    public static void tinhTongCuaCot(int a,int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == a) {
                    sum = sum + arr[i][j];
                }
            }
        }
        System.out.println("Tong cua cot "+a+" la: "+sum);
    }
}
