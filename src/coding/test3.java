package coding;

import java.util.ArrayList;

public class test3 {
	public int[] solution(int brown, int yellow) {
		int[] answer = {};
        int sum = brown + yellow;
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i<=sum; i++) {
        	if(sum%i == 0) {
        		list.add(i);
        	}
        }
        //System.out.println(list.size());
        int size = 0;
        if(list.size()%2 == 0) {
        	size = list.size()/2 ;
        }else {
        	size = list.size()/2 -1;
        }
        
        for(int i=0; i<size; i++) {
        	int x = 2*list.get(i) + 2*list.get(list.size()-i);
        	if(sum == x) {
        		answer[0] = list.get(i);
        		answer[1] = list.get(list.size()-i);
        	}
        }
        return answer;
    }
}
