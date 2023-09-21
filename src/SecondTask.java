import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your weight: ");
        double weight = scanner.nextDouble();
        System.out.println("Please enter your height: ");
        double height = scanner.nextDouble();

        double bmi = weight / (height * height);
        System.out.println("Your BMI is " + bmi);
    }
}
