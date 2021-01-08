package java1;

import java.util.Scanner;

import java.util.Random;

public class Java_janken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] jankens = {"グー","チョキ","パー"};
		//クラスのインスタンス作成
		Scanner scanner = new Scanner(System.in);
		Random r = new Random();
		//ゲームのイントロ
		System.out.println("ガチャピン「ちょっと待ったー！」");
		System.out.println("「ガチャガチャじゃんけんはじまるよ！」");
		//勝ち数の定義
		int playerWins = 0;
		int cpuWins = 0;
		int draw = 0;
		int again = 0;
		//
		//じゃんけんゲームの繰り返し処理
		while (playerWins < 3 && cpuWins < 3) {
			
			//相手の手
			int comHand = r.nextInt(3);
			
			System.out.println("0:グー、1:チョキ、2:パー" + " " + "から" + " " + "えらんでね");
			//手を入力
			int hand = scanner.nextInt();
			//結果
			if (hand == 0 && comHand == 1 || hand == 1 && comHand == 2 || hand == 2 && comHand == 0) {
				System.out.println(jankens[hand] + "を出しました");
				System.out.println("ガチャピンは" + jankens[comHand] + "を出しました");
				System.out.println("かち！");
				playerWins++;
			}else if (hand == 0 && comHand == 2 || hand == 1 && comHand == 0 || hand == 2 && comHand == 1) {
				System.out.println(jankens[hand] + "出しました");
				System.out.println("ガチャピンは" + jankens[comHand] + "を出しました");
				System.out.println("まけ！");
				cpuWins++;
			}else if (hand == 0 && comHand == 0 || hand == 1 && comHand == 1 || hand == 2 && comHand == 2) {
				System.out.println(jankens[hand] + "を出しました");
				System.out.println("ガチャピンは" + jankens[comHand] + "を出しました");
				System.out.println("あいこ！");
				draw++;
			}else {
				System.out.println("エラー");
				System.out.println("もう一度入力してください");
				again++;
			}
		}
		//最終結果
		System.out.println("結果は" + playerWins + "勝" + cpuWins + "敗" + draw + "引き分けでした！");
		if (playerWins == 3) {
			System.out.println("おめでとう！ガチャ回数が2倍になったよ！");
			}else {
			System.out.println("ざんねん・・・また挑戦してね！");
			}
	}
}
