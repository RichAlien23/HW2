import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number of seconds: ");
        int numOfSeconds = scanner.nextInt();

        int hours = numOfSeconds / 3600;
        int remainingSeconds = numOfSeconds - (hours*3600);
        int minutes = remainingSeconds / 60;
        int seconds = numOfSeconds - (hours*3600) - (minutes*60);

        System.out.println("It is " + hours + " hour(s)" + " " + minutes + " minute(s)" + " " + seconds +" second(s)");
    }
}
