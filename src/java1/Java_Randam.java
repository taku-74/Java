package java1;

import java.util.Random;

public class Java_Randam {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] hands = {"グー", "チョキ", "パー"};
		Random r = new Random();
		for(int i =0; i < 5; i++) {
			String hand = hands[r.nextInt(3)];
			System.out.println(hand);
		}
	}

}
