package java1;

public class Java_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int money = 160;
		if (money == 160) {
			System.out.println("ドリンクが購入できました【お釣りなし】");
		}else if (money > 160) {
			System.out.println("ドリンクが購入できました【お釣りあり】");
		}else if (money < 160) {
			System.out.println("金額が足りません");
		}
		
		//年齢の変数を準備して未成年、20代、30代、40代以上を表示
		int age = 20;
		if (age < 20) {
			System.out.println("未成年");
		}else if (age >= 20 && age < 30) {
			System.out.println("20代");
		}else if (age >= 30 && age < 40) {
			System.out.println("30代");
		}else if (age >= 40) {
			System.out.println("40代");
			
		}
		
	}

}
