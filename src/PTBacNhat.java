import java.util.Scanner;

public class PTBacNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cho phuong trinh ax + b = c, dien hang so: ");
        System.out.print("a: ");
        double a = scanner.nextDouble();
        System.out.print("b: ");
        double b = scanner.nextDouble();
        System.out.print("c: ");
        double c = scanner.nextDouble();

        if ( a != 0 ) {
            double answer = ( c - b ) / a;
            System.out.printf("x = %f\n", answer);
        } else {
            if ( b == c ) {
                System.out.print("Voi moi x");
            } else {
                System.out.print("Vo nghiem!");
            }
        }
    }
}
