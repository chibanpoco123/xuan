import java.util.Scanner;

public class namnhuan {
    public static void main(String[] agrs) {
        int year;
        Scanner scan = new Scanner(System.in);
        System.out.println("nhap nam vao day: ");
        year = scan.nextInt();
        scan.close();
        boolean isleap = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    isleap = true;
                else
                    isleap = false;
            } else// chia hết cho 4 nhưng không chia hết cho 100 là năm nhuận
                isleap = true;
        } else {
            isleap = false;

        }
        if (isleap == true)
            System.out.println("year+thi nam do la nam nhuan ");
        else
            System.out.println("year+khong phai la nam nhuan");
    }
}
