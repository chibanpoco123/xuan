import java.util.Scanner;

/**
 * Giải phương trình bậc 2
 * 
 * @author viettuts.vn
 */
public class BaiTap1 {
    private static Scanner scanner = new Scanner(System.in);

    /**
     * main
     * 
     * @param args
     */
    public static void main(String[] args) {
        System.out.print("nhap he so bac 1, a =");
        float a = BaiTap1.scanner.nextFloat();
        System.out.print("nhap he so bac 2 , b = ");
        float b = BaiTap1.scanner.nextFloat();
        System.out.print("nhap hang so tu do, c = ");
        float c = scanner.nextFloat();
        BaiTap1.giaiPTBac2(a, b, c);
    }

    /**
     * Giải phương trình bậc 2: ax2 + bx + c = 0
     * 
     * @param a: hệ số bậc 2
     * @param b: hệ số bậc 1
     * @param c: số hạng tự do
     */
    public static void giaiPTBac2(float a, float b, float c) {
        // kiểm tra các hệ số
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else {
                System.out.println("Phương trình có một nghiệm: "
                        + "x = " + (-c / b));
            }
            return;
        }
        // tính delta
        float delta = b * b - 4 * a * c;
        float x1;
        float x2;
        // tính nghiệm
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
            System.out.println("Phương trình có 2 nghiệm là: "
                    + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Phương trình có nghiệm kép: "
                    + "x1 = x2 = " + x1);
        } else {
            System.out.println("Phương trình vô nghiệm!");
        }
    }
}