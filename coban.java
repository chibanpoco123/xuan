import java.util.Scanner;

public class coban {
    public static void main(String[] args) {
        int n;
        System.out.println("nhap vao so nguyen n");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if (n >= 0) {
            System.out.println("day la so nguyen duong ");
        } else {
            System.out.println("day  la so nguyen am");

        }
    }
}
