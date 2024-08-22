package hw2;
//for迴圈

//public class Test99 {
//	public static void main(String[] args) {
//		for (int i = 1; i <= 9; i++) {
//			for (int j = 1; j <= 9; j++) {
//				System.out.print(j + "*" + i + "=" + (i * j) + "\t");
//			}
//			System.out.println();
//		}
//
//	}
//}

//while迴圈
//public class Test99 {
//	public static void main(String[] args) {
//		int i = 1;
//		while (i <= 9) {
//			int j = 1;
//			while (j <= 9) {
//				System.out.print(j + "*" + i + "=" + (i * j) + "\t");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
//
//	}
//}

//do...while迴圈
public class Test99 {
	public static void main(String[] args) {
		int i = 1;
		do {
			int j = 1;
			do {
				System.out.print(j + "*" + i + "=" + (i * j) + "\t");
				j++;
			} while (j <= 9);
			System.out.println();
			i++;
		} while (i <= 9);
	}
}
