// program to find prime numbers
import java.util.Scanner;

public class PrimeNumber {

    public static void main (String[]args){
        Scanner input = new Scanner (System.in);

        System.out.println("input number");
        int m = input.nextInt();
        double n = Math.sqrt(m)/2;
                
        if (m==0 && n==0){

            System.out.println ("input is not a prime number"); 
        }
        if ( m % n!= 0 ){
            System.out.println ("input is a prime number");
        }
        else {
            System.out.println ("input is not a prime number");
            }
        }
    }