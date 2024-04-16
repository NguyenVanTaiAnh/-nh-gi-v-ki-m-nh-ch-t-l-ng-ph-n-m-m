import java.util.Scanner;

public class jUnit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập hệ số a: ");
        double a = scanner.nextDouble();

        System.out.println("Nhập hệ số b: ");
        double b = scanner.nextDouble();

        System.out.println("Nhập hệ số c: ");
        double c = scanner.nextDouble();

        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phương trình có hai nghiệm phân biệt:");
            System.out.println("Nghiệm 1 = " + root1);
            System.out.println("Nghiệm 2 = " + root2);
        } else if (delta == 0) {
            double root = -b / (2 * a);
            System.out.println("Phương trình có nghiệm kép:");
            System.out.println("Nghiệm kép = " + root);
        } else {
            System.out.println("Phương trình không có nghiệm thực.");
        }
        
        scanner.close();
    }
}

