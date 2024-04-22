import java.util.Scanner;

public class jUnit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wellcome!!!");
        
        while (true) {
            System.out.print("Nhap mot so nguyen: ");
            int number = scanner.nextInt();
            
            if (number % 2 == 0) {
                System.out.println("So " + number + " la so chan.");
            } else {
                System.out.println("So " + number + " la so le.");
            }
            
            System.out.print("Ban co muon tiep tuc? (Y/N): ");
            String choice = scanner.next();
            
            if (!choice.equalsIgnoreCase("Y")) {
                break;
            }
        }
        
        System.out.println("Ket thuc.");
        scanner.close();
    }
}
