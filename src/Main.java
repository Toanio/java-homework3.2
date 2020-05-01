public class Main {
    public static void main(String[] args) {
        int customer_account=100;
        int sum_of_refill=2000;
        int refill=customer_account+sum_of_refill;
        int personal_bonus;
        if(sum_of_refill>=1000)
        {
            personal_bonus=refill/100;
        }
        else
        {
            personal_bonus=0;

        }
        System.out.println(personal_bonus);
    }
}
