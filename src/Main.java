public class Main {
    public static void main(String[] args) {

        double creditBal = 5000;
        double interest = 0.17;
        double total1 = creditBal * interest;
        double month1 = total1 + creditBal;
        double total2 = month1 * interest;
        double month2 = (month1 + total2);

        System.out.println("Your total plus interest for this month is " + month1);

        System.out.println("Your total plus interest for next month is " + month2);





    }
}