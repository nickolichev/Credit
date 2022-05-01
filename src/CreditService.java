public class CreditService {
    public double calculate(int PeriodEndCredit) {

        int AmountCredit = 1_000_000;
        double YearRate = 9.99;
        double MonthlyRate = YearRate / (100 * 12);
        int PeriodEndCreditMinus = -PeriodEndCredit;
        double PaymentMonthly = AmountCredit * (MonthlyRate / (1 - Math.pow((1 + MonthlyRate), PeriodEndCreditMinus)));

        System.out.printf("Ежемесячный платеж составляет " + "%.0f", PaymentMonthly);

        return PaymentMonthly;

    }
}
