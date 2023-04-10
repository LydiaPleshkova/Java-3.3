// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println();
        System.out.println("Ежемесячный платеж при сумме кредита 1.000.000 рублей и сроке 1 год составляет:");
        System.out.println(service.calculate(1_000_000, 0.0999, 12) + " рублей.");

        System.out.println();
        System.out.println("Ежемесячный платеж при сумме кредита 1.000.000 рублей и сроке 2 года составляет:");
        System.out.println(service.calculate(1_000_000, 0.0999, 24) + " рублей.");

        System.out.println();
        System.out.println("Ежемесячный платеж при сумме кредита 1.000.000 рублей и сроке 3 года составляет:");
        System.out.println(service.calculate(1_000_000, 0.0999, 36) + " рублей.");
    }
}