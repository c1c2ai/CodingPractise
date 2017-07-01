/**
 * Created by Chetan on 01/07/17.
 * Find the prime factors of a number.
 *
 * Logic: Divide by 2 , then 3 and then till the squareroot of the original number because max if a=b which the max case possible so one factor cannot be greater than squareroot of the original number
 */
public class PrimeFactors {

    public static void main(String[] args) {

        double n=711;
        String primefactors="";
        double max=Math.sqrt(n);
        max=Math.ceil(max);

        while(n%2==0){
            n=n/2;
            primefactors=primefactors+" "+2;
        }

        while(n%3==0){
            n=n/3;
            primefactors=primefactors+" "+3;
        }

        int i=3;
        while (i<=max){

            while(n%i==0){
                n=n/i;
                primefactors=primefactors+" "+i;
            }
            i=i+2;
        }

        if(n!=1){
            primefactors=primefactors+" "+n;
        }

        System.out.println(primefactors);

    }
}
