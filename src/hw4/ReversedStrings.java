package hw4;

public class ReversedStrings {

	public static void main(String[] args) {

//		請建立一個字串,經過程式執行後,輸入結果是反過來的
//		例如String s = “Hello World”,執行結果即為dlroW olleH
//		String[] str = { "H", "e", "l", "l", "o", " ", "W", "o", "r", "l", "d" };
//		reverseString(str);

		String a = "Hello World";
		char[] str = a.toCharArray();
		reverseString(str);

	}

	public static void reverseString(char[] s) {
		for (int i = s.length - 1; i < s.length; i--) {
			if (i < 0) {
				break;
			} else {
				char newS = s[i];
				System.out.print(newS);
			}
		}
	}

}
