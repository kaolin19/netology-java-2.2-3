public class CreditPaymentService {
    public int calculate (int amount, int term, double percent) {
        double coefficient = percent / 100 / 12;
        int monthlyPayment = (int)(amount * coefficient * Math.pow(coefficient + 1, term) / (Math.pow(coefficient + 1, term) - 1));
        return monthlyPayment;
    }
}
