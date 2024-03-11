package coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class code_2846 {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
		int size = Integer.parseInt(br.readLine());
		int [] arr = new int[size];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < size; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int answer = 0;
		int result = 0;
		for(int i=0; i<size-1; i++) {
			if(arr[i] >= arr[i+1]) {
				answer = 0;
			}else {
				answer += arr[i+1] - arr[i];
			}
			if(answer >= result) {
				result = answer;
			}
		}
		System.out.println(result);
       
	} 
}
