package hw1;

public class No3 {
//請由程式算出256559秒為多少天、多少小時、多少分與多少秒
	public static void main(String[] args) {
		int num1 = 256559, num2 = (24 * 60 * 60);
		System.out.println((num1 / num2) + "天");
		System.out.println(((num1 % num2) / 3600) + "時");
		int num3 = (num1 % num2); // 剩下的小時
		System.out.println(((num3 % 3600) / 60) + "分");
		System.out.println(((num3 % 3600) % 60) + "秒");

	}
}
