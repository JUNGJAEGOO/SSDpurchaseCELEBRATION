package back2342;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int arr[] = new int[100001];
		int dp[][] = new int[2][100001];
		
		int count=1;
		while( true) {
			 int x= in.nextInt();
			 if ( x == 0) {
				 break;
			 }
			 arr[count++] = x;
			
		}
		
		dp[0][1] = 2;
		dp[1][1] = 2;
		int L = arr[1];
		int R = arr[1];
		for( int i = 2 ; i < count ; i++) {
			int comm = arr[i];
			int Lstep;
			int Rstep;
			if ( comm == 1 ) {
				if ( L == 1) {
					Lstep = dp[0][i-1]+1;
					L=1;
				}else if ( L == 2) {
					Lstep = dp[0][i-1]+3;
					L=2;
				}else if ( L == 3 ) {
					Lstep = dp[0][i-1]+4;
					L=3;
				}else if ( L == 4 ) {
					Lstep = dp[0][i-1]+4;
					L=4;
				}
				
				if ( R == 1) {
					Rstep = dp[1][i-1]+1;
					R=1;
				}else if ( R == 2) {
					Rstep = dp[1][i-1]+3;
					R=2;
				}else if ( R == 3 ) {
					Rstep = dp[0][i-1]+4;
					R=3;
				}else if ( R == 4 ) {
					Rstep = dp[0][i-1]+4;
					R=4;
				}
			}
			if ( comm == 2 ) {
				if ( L == 1) {
					Lstep = dp[0][i-1]+1;
				}else if ( L == 2) {
					Lstep = dp[0][i-1]+3;
				}else if ( L == 3 || L == 4) {
					Lstep = dp[0][i-1]+4;
				}
			}
			if ( comm == 3 ) {
				if ( L == 1) {
					Lstep = dp[0][i-1]+1;
				}else if ( L == 2) {
					Lstep = dp[0][i-1]+3;
				}else if ( L == 3 || L == 4) {
					Lstep = dp[0][i-1]+4;
				}
			}
			if ( comm == 4 ) {
				if ( L == 1) {
					Lstep = dp[0][i-1]+1;
				}else if ( L == 2) {
					Lstep = dp[0][i-1]+3;
				}else if ( L == 3 || L == 4) {
					Lstep = dp[0][i-1]+4;
				}
			}
			
					
			
			
		}
		
		
		
	}
}
