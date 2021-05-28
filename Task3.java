import java.util.Scanner;
import java.math.BigInteger;

class Task3 {

    // calculate the factorial of value
    static BigInteger calcFactorial(int value){
        BigInteger rez = BigInteger.ONE;
        for(int i = 1; i<=value; i++){
            rez  = rez.multiply(BigInteger.valueOf(i));
        }
        return rez;
    }

    // find the sum of the digits in the factorial
    static BigInteger getSum(int value){
        BigInteger sum = BigInteger.ZERO;
        // find factorial of value
        BigInteger tmp = calcFactorial(value);

        // find the sum of the digits in the value
        // until tmp != 0
        while (!tmp.equals(BigInteger.ZERO)) {
            // sum += (tmp % 10)
            sum = sum.add(tmp.mod(BigInteger.valueOf(10)));
            // tmp /= 10
            tmp = tmp.divide(BigInteger.valueOf(10));
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(getSum(num));
    }
}