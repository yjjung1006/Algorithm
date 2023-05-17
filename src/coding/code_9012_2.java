package coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class code_9012_2 {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		int testCase = 0;
		String s = "";
	    testCase  = Integer.parseInt(br.readLine()); 
	    for (int i = 0; i < testCase; i++) {
			s = br.readLine();
			int size = s.length();
			Stack<String> str = new Stack<String>();
			for(int j = 0; j < size; j++) {
				if(size%2 != 0) {
					break;
				} else {
					if("(".equals(Character.toString(s.charAt(j)))) {
						str.push(Character.toString(s.charAt(j)));
					}else if(")".equals(Character.toString(s.charAt(j)))) {
						if(str.size() > 0) {
							str.pop();
						}else {
							str.push(Character.toString(s.charAt(j)));
							break;
						}
					}else {
						str.push(Character.toString(s.charAt(j)));
						break;
					}	
				}
			}
			if(size%2 != 0) {
				System.out.println("NO");
			}else {
				if(str.isEmpty()) {
					System.out.println("YES");
				}else {
					System.out.println("NO");
				}
			}
			str.clear();
	    } 
	}
}


