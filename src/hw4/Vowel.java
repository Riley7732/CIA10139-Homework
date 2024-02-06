package hw4;

public class Vowel {

	public static void main(String[] args) {

//		有個字串陣列如下 (八大行星):
//		{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//		請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
		String[] vowel = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
		int count = 0;
		char[][] a = new char[vowel.length][];
		for (int i = 0; i < vowel.length; i++) {
			a[i] = vowel[i].toCharArray();
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] == 'a' || a[i][j] == 'e' || a[i][j] == 'i' || a[i][j] == 'o' || a[i][j] == 'u') {
					count++;
				}
			}
		}
		System.out.println("共有 " + count + " 個母音");
	}

}
