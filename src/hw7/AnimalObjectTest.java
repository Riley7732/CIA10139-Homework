package hw7;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class AnimalObjectTest {

	public static void main(String[] args) throws Exception {

//	請寫一支程式,利用老師提供的Dog與Cat類別分別產生兩個物件,寫到C:\data\Object.ser裡。
//	注意物件寫入需注意的事項,若C:\內沒有data資料夾,請用程式新增這個資料夾
//	承上題,請寫一個程式,能讀取Object.ser這四個物件,並執行speak()方法觀察結果如何 (請利用多型簡化本題的程式設計)
		//資料夾路徑（檢查資料夾是否存在，若不存在則新增一資料夾）
		File dir = new File("C:\\Data");	
		if (!dir.exists()) {				
			dir.mkdir();
		}

		File file = new File("C:\\Data\\Object.ser");
		AnimalObject[] animal = new AnimalObject[4];
		animal[0] = new Cat("Teemo");
		animal[1] = new Cat("Boo");
		animal[2] = new Dog("Lucky");
		animal[3] = new Dog("Happy");
		// 輸出
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		for (int i = 0; i < animal.length; i++) {
			oos.writeObject(animal[i]);
		}
		oos.close();
		fos.close();
		// 輸入
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		System.out.println(file.getName() + "檔案內容如下: ");
		System.out.println("------------------------------");
		try {
			while (true) {
				((AnimalObject) ois.readObject()).speak();
				System.out.println("------------------------------");
			}
		} catch (EOFException e) {
			System.out.println("資料讀取完畢！");
		}
		ois.close();
		fis.close();

	}

}
