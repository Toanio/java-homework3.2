public class Main {
    public static void main(String[] args) {
        int customerAccount = 100;
        int sumOfRefill = 2000;
        int refill = customerAccount + sumOfRefill;
        int personalBonus;
        if (sumOfRefill >= 1000) {
            personalBonus = refill / 100;
        } else {
            personalBonus = 0;

        }
        System.out.println(personalBonus);
    }
}
