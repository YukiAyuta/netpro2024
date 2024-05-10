package src;

import java.util.ArrayList;
import java.util.Collections;

public class HeikinCKadai {
	public static void main(String[] args){

int h = 0;
int sum = 0;
int[] tensu = new int [100];
ArrayList<Integer>s = new ArrayList<>();
for(int i = 0; i <= 100; i ++){
	Kamoku math = new Kamoku(random.next(bound:101));
	tensu[i] = math.getScore();
	sum += tensu[i];

	if(tensu[i] >= 80){
		s.add(tensu[i]);
	}
}
		int ave=(sum)/tensu.length;
		System.out.println("平均点は" + ave + "です。");
		System.out.println("合格者は以下の通りです。");
		Collections.sort(s);
		for(int i:s){
			System.out.println(i);
		}


	}
}
