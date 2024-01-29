package coding;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class code_2164 {
	 public static void main(String[] args)  {
		 Scanner in = new Scanner(System.in);
		 int cnt = in.nextInt();
		 int result = 1;
		 Queue<Integer> queue = new LinkedList<> ();

		 for(int i = 1; i <= cnt; i++) {
			 queue.add(i);
		 }
		 
		 while(queue.size() > 1) {
			 queue.remove();
			 if(queue.size() == 1) {
				 result = queue.peek();
			 }else {
				 int next = queue.peek();
				 queue.remove();
				 queue.add(next);
			 }
		 }
		 System.out.println(result);
	 }
}
