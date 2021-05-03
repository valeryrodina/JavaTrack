import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int sum = 0;
        int firstGroup = scanner.nextInt();
        int secondGroup = scanner.nextInt();
        int thirdGroup = scanner.nextInt();

        if (firstGroup % 2 == 0) {
            sum += firstGroup / 2;
        } else {
            sum += firstGroup / 2 + 1;
        }
        if (secondGroup % 2 == 0) {
            sum += secondGroup / 2;
        } else {
            sum += secondGroup / 2 + 1;
        }
        if (thirdGroup % 2 == 0) {
            sum += thirdGroup / 2;
        } else {
            sum += thirdGroup / 2 + 1;
        }

        System.out.println(sum);
    }
}