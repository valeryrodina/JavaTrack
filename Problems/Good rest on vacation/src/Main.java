import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int durationDays = scanner.nextInt();
        int foodTotal = scanner.nextInt();
        int flightCost = scanner.nextInt();
        int hotelCost = scanner.nextInt();

        System.out.println(foodTotal * durationDays + flightCost * 2 + hotelCost * (durationDays - 1));
    }
}