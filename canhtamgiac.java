import java.util.Scanner;

public class canhtamgiac {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Khai báo biến
        float a, b, c;

        // Nhập dữ liệu
        System.out.print("nhap vao canh thu nhat: ");
        a = sc.nextFloat();
        System.out.print("nhap vao canh thu hai: ");
        b = sc.nextFloat();
        System.out.print("Nhap vao cah thu ba ");
        c = sc.nextFloat();

        // Kiểm tra điều kiện lập thành tam giác
        if ((a + b > c) && (a + c > b) && (b + c > a) &&
                (a > 0) && (b > 0) && (c > 0)) {
            // Kiểm tra điều các tam giác đặc biệt
            if ((a == b) && (b == c)) {
                System.out.println("Tam giac deu!");
            }
            if ((a == b) || (a == c) || (b == c)) {
                System.out.println("Tam giac can!");
            }
            if ((a * a == b * b + c * c) ||
                    (b * b == a * a + c * c) ||
                    (c * c == a * a + b * b)) {
                System.out.println("Tam giac vuong!");
            }
            if (((a * a + b * b == c * c) && (a == b)) ||
                    ((a * a + c * c == b * b) && (a == c)) ||
                    ((b * b + c * c == a * a) && (b == c))) {
                System.out.println("Tam giác vuông cân!");
            } else {
                System.out.println("Tam giac thuong");
            }
        } else {
            System.out.println("3canh khong phai la canh tam giac!");
        }

        sc.close();
    }
}
