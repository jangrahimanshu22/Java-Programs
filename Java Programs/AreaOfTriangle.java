import java.util.Scanner;
public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter base and height: ");
        double base = scanner.nextDouble();
        double height = scanner.nextDouble();
        double area = 0.5 * base * height;
        System.out.println("Area: " + area);
    }
}