package coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code_9093 {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
		int testCase = 0;
		String s = "";
        testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
			s = br.readLine();
            String[] split = s.split(" ");
            StringBuilder sb = new StringBuilder();
            int size = split.length;
            for(int j = 0; j < size; j++){
                StringBuilder reverse = new StringBuilder(split[j]);
                sb.append(reverse.reverse());
                sb.append(" ");
            }
            sb.deleteCharAt(sb.length() - 1);
            System.out.println(sb);
		}	
	} 
}
