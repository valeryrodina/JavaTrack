import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        for (int x = 1; x < 1001; x++) {
            if (a * x * x * x + b * x * x + c * x + d == 0) {
                System.out.println(x);
            }
        }
    }
}