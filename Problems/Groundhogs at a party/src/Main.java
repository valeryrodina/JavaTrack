import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int cupsNumber = scanner.nextInt();
        boolean weekend = scanner.nextBoolean();

        boolean yesWeekend = cupsNumber >= 15 && cupsNumber <= 25;
        boolean notWeekend = cupsNumber >= 10 && cupsNumber <= 20;

        if (weekend) {
            System.out.println(yesWeekend);
        } else {
            System.out.println(notWeekend);
        }
    }
}