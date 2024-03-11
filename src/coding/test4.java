package coding;

import java.util.ArrayList;
import java.util.Collections;

public class test4 {
	public static void main(String[] args) {
		int[] people = {70,50,80,50};
		int result = solution(people, 4); 
		System.out.println(result);
	}
	public static int solution(int[] people, int limit) {
        int answer = 0;
        int len = people.length;
        ArrayList<Integer> peo = new ArrayList<>();
        for(int i=0; i < len; i++) {
        	peo.add(i);
        }
        Collections.sort(peo);
        
        int first = peo.get(1);
        
        return first;
    }
}
