import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int number = scanner.nextInt();
        int firstDigit = number / 100;
        int secondDigit = (number - firstDigit * 100) / 10;
        int thirdDigit = number - firstDigit * 100 - secondDigit * 10;
        System.out.print(thirdDigit * 100 + secondDigit * 10 + firstDigit);
    }
}