import java.util.Scanner;

public class NumberArray {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Nhap phan tu thu "+i+": ");
            numbers[i] = sc.nextInt();
        }
        numberArray(numbers);

    }

    public static void numberArray(int[] arr) {
        int max = arr[0];
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println("Gia tri lon nhat la: "+max);
    }
}
