import java.util.Scanner;

public class SoLanXuatHienTrongChuoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a;
        System.out.println("Nhap chuoi can tim: ");
        a = sc.nextLine();

        System.out.println("Nhap vao ky tu can tim: ");
        char kt = sc.next().charAt(0);
        soLanXuatHienTrongChuoi(a, kt);

    }
    public static void soLanXuatHienTrongChuoi(String str, char ch) {
        int dem = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                dem++;
            }
        }
        System.out.println("So lan xuat hien "+ str+ " la: "+dem);
    }
}
