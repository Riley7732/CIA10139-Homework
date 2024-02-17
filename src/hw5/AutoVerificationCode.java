package hw5;

public class AutoVerificationCode {

	public static char[] genAuthCode() {
		String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		char[] charArray = characters.toCharArray();
		int randomIndex = 0;
		char[] authCode = new char[8];

		int loChar = 0;
		int upChar = 0;
		int num = 0;

		while ((loChar != 1) || (upChar != 1) || (num != 1)) {
			loChar = 0;
			upChar = 0;
			num = 0;
			for (int i = 0; i < authCode.length; i++) {
				randomIndex = (int) (Math.random() * charArray.length);
				if (randomIndex < 26) {
					loChar = 1;
				} else if (randomIndex > 51) {
					num = 1;
				} else {
					upChar = 1;
				}
				authCode[i] = charArray[randomIndex];
			}
		}
		return authCode;
	}

	public static void main(String[] args) {

//	身為程式設計師的你,收到一個任務,要幫系統的註冊新增驗證碼的功能,請設計一個方法genAuthCode(),
//	當呼叫此方法時,會回傳一個8位數的驗證碼,此驗證碼內容包含了英文大小寫與數字的亂數組合

		System.out.println(genAuthCode());
	}

}
