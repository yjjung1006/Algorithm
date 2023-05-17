package coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code_9012 {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		int testCase = 0;
		String s = "";
	    testCase  = Integer.parseInt(br.readLine()); 
	    for (int i = 0; i < testCase; i++) {
			s = br.readLine();
			int size = s.length();
			int length = 0;
			for(int j = 0; j < size; j++) {
				if(size%2 != 0) {
					length = -1;
					break;
				} else {
					if(length >= 0) {
						if("(".equals(Character.toString(s.charAt(j)))) {
							length++;
						}else if(")".equals(Character.toString(s.charAt(j)))) {
							length--;
						}else {
							length = -1;
							break;
						}
					}else {
						
					}	
				}
			}
			if(length == 0) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
	    } 
	}
}
