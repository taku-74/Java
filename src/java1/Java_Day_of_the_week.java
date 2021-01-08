package java1;

public class Java_Day_of_the_week {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] day = {"日","月","火","水","木","金","土"};
		String[] dayEnglish = {"Sunday","Monday","Thusday","Wednesday","Thursday","Friday","Saturday"};
		for(int i = 0; i < 7; i++) {
				System.out.println(day[i] + "曜日は英語では" + dayEnglish[i] + "です");
		}
	}

}
