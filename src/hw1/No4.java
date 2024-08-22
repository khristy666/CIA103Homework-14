package hw1;

public class No4 {
//請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
	public static void main(String[] args) {
		final double num1 = 3.1415, num2 = 5;
		System.out.println("圓面積" + (num2 * num2 * num1));
		System.out.println("圓周長" + ((num2 + num2) * num1));

	}
}