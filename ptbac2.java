import java.util.Scanner;

class pt_bac2 {
    private static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        System.out.print("nhap gia tri a=");
        float a = input.nextFloat();
        System.out.print("nhap gia tri b=");
        float b = input.nextFloat();
        System.out.print("nhap gia tri c=");
        float c = input.nextFloat();
        float delta = b * b - 4 * a * c;
        if (delta > 0) {
            System.out.println("phuong trinh com 2 nghiem phan biet la");
            System.out.println("nghiem x1=" + (-b + Math.sqrt(delta)) / (2 * a));
            System.out.println("nghiem x2=" + (-b - Math.sqrt(delta)) / (2 * a));
        } else if (delta < 0) {
            System.out.println("phuong trinh nay la vo nghiem");
        } else {
            System.out.println("phuong trinh co nghiem kep la:" + (-b / (2 * a)));

        }
    }
}
