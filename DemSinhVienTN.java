import java.util.Scanner;

public class DemSinhVienTN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] studens = new int[10];

        for (int i = 0; i < studens.length; i++) {
            System.out.println("Nhap diem cua sinh vien "+i+": ");
            studens[i] = sc.nextInt();
        }
        xetTotNghiep(studens);
    }

    public static void xetTotNghiep(int[] arr){
        int sl = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] <= 10 && arr[i] > 5){
                System.out.println("Sinh vien "+i+" co so diem la: "+arr[i]+" duoc tot nghiep.");
                sl++;
            }
        }
        System.out.println("So luong sinh vien tot nghiep: "+sl);
    }
}
