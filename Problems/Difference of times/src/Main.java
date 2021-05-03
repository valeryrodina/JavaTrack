import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int firstHours = scanner.nextInt();
        int firstMin = scanner.nextInt();
        int firstSec = scanner.nextInt();

        int secondHours = scanner.nextInt();
        int secondMin = scanner.nextInt();
        int secondSec = scanner.nextInt();

        int result = secondSec + secondMin * 60 + secondHours * 3600
                - (firstSec + firstMin * 60 + firstHours * 3600);

        System.out.println(result);
    }
}