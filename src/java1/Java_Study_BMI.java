package java1;

public class Java_Study_BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "大田拓実";
		String sex = "男";
		double bmi = Calculation(45.0,1.7);
		int height = 170;
		double weight = 45.0;
		
		System.out.println("名前：" + name);
		System.out.println("性別：" + sex);
		System.out.println("身長：" + height + "cm");
		System.out.println("体重：" + weight + "kg");
		System.out.println("BMI：" + bmi);
		
		if (bmi > 25) {
			System.out.println("[肥満]");
		}else if (18.5 <= bmi  && bmi <= 25) {
			System.out.println("[標準]");
		}else if (bmi < 18.5) {
			System.out.println("[低体重]");
		}
	}
	public static double Calculation (double a,double b) {
		return a / (b * b);
	}
}