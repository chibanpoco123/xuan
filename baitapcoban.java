import java.util.Scanner;

public class baitapcoban {
    public static void main(String[] args) {
        float a, b, c;
        System.out.println("Nhập vào 3 số:");
        Scanner sc = new Scanner(System.in);

        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();

        if (a * a + b * b == c * c || b * b + c * c == a * a || c * c + a * a == b * b)
            System.out.println("ba so dung la 3 canh tam giac vuong");
        else
            System.out.println("ba so khong phai là 3 canh tam giac vuong");
    }
}
