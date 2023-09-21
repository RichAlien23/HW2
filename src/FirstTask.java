import java.util.Scanner;

public class FirstTask {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Please enter the width of a rectangle: ");
        double width = scanner.nextDouble();
        System.out.println("Please enter the height of a rectangle: ");
        double height = scanner.nextDouble();

        double area = width*height;
        System.out.println("Area of a rectangle is "+ area);
        double perimeter = 2 * (width+height);
        System.out.println("Perimeter of a rectangle is: " + perimeter);
    }
}
