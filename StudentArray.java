import java.util.Scanner;

public class StudentArray {
    public static void main(String[] args) {
        String[] students = {"Manh","Trang","Khoi","Nguyen","Quan"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten sinh vien can tim: ");
        String ten = sc.nextLine();

        int dem = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(ten)) {
                System.out.println("Sinh vien can tim la: "+ students[i]+"\n"+"Vị trí "+i+".");
                dem++;
            }
        }
        if (dem == 0){
            System.out.println("Khong co sinh vien can tim.");
        }
    }

}
