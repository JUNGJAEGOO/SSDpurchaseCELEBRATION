package back10844;
import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		long dp[][] = new long[101][10];
		
		
		for( int i =1 ; i<10 ; i++) {
			dp[1][i] = 1;
		}
		for ( int i = 2 ; i < 101 ; i++) {
			for ( int  j  = 0 ; j < 10 ; j++) {
				if ( j == 0 ) {
					dp[i][0] = dp[i-1][1];
				}else if ( j == 9) {
					dp[i][9] = dp[i-1][8];
				}else {
					dp[i][j] = (dp[i-1][j-1] + dp[i-1][j+1])%1000000000;
				}
			}
		}
		long sum=0;
		for( int i =0 ; i<10 ; i++) {
			sum+= dp[N][i];
		}
		System.out.println(sum%1000000000);
	}
}