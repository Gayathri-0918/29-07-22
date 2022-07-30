package basic2;
import java.util.Scanner;

public class multiplytwobbinary {
	
	static long calc(long b1, long b2) {
	    int i = 0;
	    long rmndr = 0;
	    long result = 0;
	    long[] sum = new long[20];
	    while (b1 != 0 || b2 != 0) {                  //actual multiplying process-heart of this program
	      sum[i++] = (b1 % 10 + b2 % 10 + rmndr) % 2;     
	      rmndr = (b1 % 10 + b2 % 10 + rmndr) / 2;
	      b1 = b1 / 10;
	      b2 = b2 / 10;
	    }
	    if (rmndr != 0) {
	      sum[i++] = rmndr;
	    }--i;
	    while (i >= 0) {                              //forming the result
	      result = result * 10 + sum[i--];
	    }
	    return result;
	  }
	  public static void main(String[] args) {
	    long b1, b2, m = 0;
	    long d, f = 1;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter A: ");
	    b1 = sc.nextLong();
	    System.out.println("\nEnter B: ");
	    b2 = sc.nextLong();
	    while (b2 != 0) {
	      d = (b2 % 10);
	      if (d == 1) {
	        b1 = b1 * f;
	        m = calc(b1, m);
	      } else {
	        b1 = b1 * f;
	      }
	      b2 = b2 / 10;
	      f = 10;
	    }
	    System.out.println("\nA X B is: " + m + "\n");
	  }
	}


