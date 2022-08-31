public class Main {
    public static void main(String[] args) {

        int n = 2;
        int j = 2;
        boolean notprime = false;

        while ((!notprime) && (j < n) || ((n == 2) && (notprime == false))) {
            if (n % j == 0) {
                System.out.println("The integer " + n + " is not a prime, because it's divisible atleast by " + j);
                notprime = true;
            } else {
                j = j + 1;
            }
        }
        if (!notprime) {
            System.out.println("The integer " + n + " is a prime");
        }
    }
}