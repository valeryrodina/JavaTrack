import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int notReady = 0;
        int ready = 0;
        int needRepair = 0;

        for (int i = 0; i < n; i++) {
            int part = scanner.nextInt();
            if (part == 0) {
                ready++;
            }
            if (part == 1) {
                needRepair++;
            }
            if (part == -1) {
                notReady++;
            }
        }

        System.out.println(ready + " " + needRepair + " " + notReady);
    }
}