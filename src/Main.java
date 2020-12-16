public class Main {
    public static void main(String[] args) {
    CreditPaymentService service = new CreditPaymentService();
    int oneYearPayment = service.calculate(1_000_000, 12, 9.99);
    System.out.println(oneYearPayment);
    int twoYearsPayment = service.calculate(1_000_000, 24, 9.99);
    System.out.println(twoYearsPayment);
    int threeYearsPayment = service.calculate(1_000_000, 36, 9.99);
    System.out.println(threeYearsPayment);
    }
}
