import java.util.Scanner;
public class AverageOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter count of numbers: ");
        int n = scanner.nextInt();
        double sum = 0;
        System.out.println("Enter numbers: ");
        for(int i=0; i<n; i++) {
            sum += scanner.nextDouble();
        }
        System.out.println("Average: " + (sum/n));
    }
}