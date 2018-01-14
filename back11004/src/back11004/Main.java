package back11004;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		double arr[] = new double[N];
		st = new StringTokenizer(br.readLine()," ");
		for ( int i = 0 ; i < N ; i++) {
			arr[i] = Double.parseDouble(st.nextToken());
		}
		Arrays.sort(arr);
		System.out.format("%.0f",arr[K-1]);
	}
}