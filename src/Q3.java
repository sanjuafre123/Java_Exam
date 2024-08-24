import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        int i;
        int n;

        System.out.println("Enter no. of elements in the array: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        System.out.println("Enter the element : ");
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();

        for(i=0; i<=n; i++)
        {
            if(i%2==0 || i%3==0 || i%5==0 || i%7==0 || i==2 && i==3 && i==5 && i==0)
            {
                System.out.println(i);
            }
        }
    }
}