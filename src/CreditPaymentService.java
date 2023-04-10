public class CreditPaymentService {
    public int calculate(int loan, double interest, int period) {
        double payment = loan * (interest/12 * Math.pow(1 + interest/12, period) / (Math.pow(1 + interest/12, period) - 1));
        return (int) payment;
    }
}
