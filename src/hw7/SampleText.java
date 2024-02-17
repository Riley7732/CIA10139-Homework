package hw7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class SampleText {

	public static void main(String[] args) {
		int i;
		String j;
		int characters = 0;
		int line = 0;
		try {
			File f = new File("C:\\CIA101_Workspace\\CIA10139-Homework\\Sample.txt");
			System.out.println("Sample.txt檔案共有 " + f.length() + " 個位元組");

			FileReader fr1 = new FileReader("C:\\CIA101_Workspace\\CIA10139-Homework\\Sample.txt");
			BufferedReader br1 = new BufferedReader(fr1);
			while ((i = br1.read()) != -1) {
				characters += 1;
			}
			System.out.println("Sample.txt檔案共有 " + characters + " 個字元");
			br1.close();
			fr1.close();

			FileReader fr2 = new FileReader("C:\\CIA101_Workspace\\CIA10139-Homework\\Sample.txt");
			BufferedReader br2 = new BufferedReader(fr2);
			while ((j = br2.readLine()) != null) {
				line += 1;
			}
			System.out.println("Sample.txt檔案共有 " + line + " 列資料");
			br2.close();
			fr2.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
