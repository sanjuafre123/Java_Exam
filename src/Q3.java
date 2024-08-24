import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int prime;
        int sum = 0;
        System.out.print("Enter value: ");
        prime = scanner.nextInt();

        for (int i = 1; i < prime; i++) {
            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0 || i==2 || i==3  || i==5|| i==7) {
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println("Sum: " + sum);
    }
}
