package java1;

import java.util.Scanner;

import java.util.Random;

public class Java_omikuji {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("あなたの今日のおみくじを引きます。");
		//入力メッセージ
		System.out.print("あなたのお名前は？");
		String inputName = name(); //入力を受け取る
		String re_Kuji = kuji();
		
		System.out.println(inputName + "さんの今日のおみくじの結果は・・・" + "【" + re_Kuji + "】です！");
	}
	public static String name() {
		Scanner scanner = new Scanner(System.in);
		//名前入力
		String input = scanner.nextLine();
		return input;
	}
	public static String kuji() {
		String[] omikuji = {"大吉","吉","中吉","小吉","末吉","凶"};
		//ランダム
		Random r = new Random();
		String kuji = omikuji[r.nextInt(6)];
		return kuji;
	}
}
