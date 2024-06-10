import java.util.Scanner;

public class minNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhap phan tu thu "+i+" : ");
            arr[i] = sc.nextInt();
        }
        findMinNumber(arr);

    }
    public static void findMinNumber(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Gia tri thap nhat la: "+min);
    }
}
