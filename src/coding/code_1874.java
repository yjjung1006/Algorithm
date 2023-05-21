package coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class code_1874 {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
		int testCase  = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<Integer>();
		StringBuilder sb = new StringBuilder();
		int checkNum = 0;
        for (int i = 0; i < testCase; i++) {
        	int num = Integer.parseInt(br.readLine());    	
        	if(checkNum < num) {
        		for(int j = checkNum + 1; j <= num; j++){
             	   stack.push(j);
             	   sb.append("+\n");	   
                 }
        		checkNum = num;
        	}else if(stack.peek() != num) {
        		System.out.println("NO");
            	return;
        	}
        	stack.pop();
        	sb.append("-\n");
		}
        System.out.println(sb);
	} 
}
