package hw1;

public class No6 {
	/*
	 * 請寫一隻程式,利用System.out.println()印出以下三個運算式結果: 5 + 5 5 + ‘5’ 5 + “5”
	 * 並請用註解各別說明答案的產生原因
	 */
	public static void main(String[] args) {
		int num1 = 5;
		System.out.println(num1 + num1);
		// 算術運算子:此為數字相加
		System.out.println(num1 + '5');
		// 算術運算子:此為數字加unicode可以找到是35 再用16進位表換成10進位可以得到53
		System.out.println(num1 + "5");
		// 算術運算子:此為數字加字串

	}
}