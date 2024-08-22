package hw1;

public class No5 {
	/*
	 * 某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本 金加利息共有多少錢? 複利計算公式：本利和 = 本金 ×
	 * (1 + 年利率)^期間
	 */
	public static void main(String[] args) {
		double num1 = 1500000, num2 = 0.02, num3 = 10;
		System.out.println("本利和" + (num1 * Math.pow(1 + num2, num3)));

	}
}