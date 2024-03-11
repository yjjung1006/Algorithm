package coding;

import java.util.ArrayList;
import java.util.Scanner;

public class test3_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int brown = sc.nextInt();
        int yellow = sc.nextInt();
        
		int[] answer = new int[2];
        int sum = brown + yellow;
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i<=sum; i++) {
        	if(sum%i == 0) {
        		list.add(i);
        	}
        }
        //System.out.println(list.size());
        int size = list.size()/2 ;
        int avg = list.size()%2;

        System.out.println("리스트 홀수여부"+avg);
        
        if(avg == 0) {
        	for(int i=0; i<size; i++) {
            	System.out.println("i값"+i+"list값"+list.get(i));
            	System.out.println("list-1값"+list.get(list.size()-i-1));
            	int x = (2 * list.get(i)) + (2 * list.get(list.size()-i-1)) -4;
            	System.out.println("x의값"+x);
            	if(sum == x) {
            		if(list.get(i) >= list.get(list.size()-i-1)) {
            			answer[0] = list.get(i);
                		answer[1] = list.get(list.size()-i-1);
            		}else {
            			answer[0] = list.get(list.size()-i-1);
            			answer[1] = list.get(i);
            		}
            	}
            }
        }else {
        	for(int i=0; i<size; i++) {
            	System.out.println("i값"+i+"list값"+list.get(i));
            	System.out.println("list-1값"+list.get(list.size()-i-1));
            	int x = (2 * list.get(i)) + (2 * list.get(list.size()-i-1)) -4;
            	System.out.println("x의값"+x);
            	if(sum == x) {
            		answer[0] = list.get(i);
            		answer[1] = list.get(list.size()-i-1);
            	}
            }
        }
        System.out.println(answer[0]);
        System.out.println(answer[1]);
    }
}
