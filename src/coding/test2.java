package coding;

import java.util.Stack;

public class test2 {
	
	public boolean solution(String s) {
		boolean answer = true;
        Stack<Character> stack = new Stack<Character>();
        
        if (s == null || s.length() == 0) {
            return false;
        }
        if(s.charAt(0) == ')') {
			 return false;
		}else {
			for(int i = 0; i < s.length(); i++) {
				if('(' == s.charAt(i)) {
					stack.push('(');
				} else if(!stack.isEmpty() && ')' == s.charAt(i)) {
					stack.pop();
				}else {
					return false;
				}
			}
			if(!stack.isEmpty()) {
				answer = false;
			}
			return answer;
		}
	}
}
