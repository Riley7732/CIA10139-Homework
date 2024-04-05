package hw8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionTest {

	public static void main(String[] args) {

		List<Object> list = new ArrayList<>();
		list.add(new Integer(100));
		list.add(new Double(3.14));
		list.add(new Long(21L));
		list.add(new Short("100"));
		list.add(new Double(5.1));
		list.add("Kitty");
		list.add(new Integer(100));
		list.add(new Object());
		list.add("Snoopy");
		list.add(new BigInteger("1000"));

		// 傳統for迴圈
//		for (int i = 0; i < list.size(); i++) {
//			Object obj = list.get(i);
//			System.out.println(obj);
//			if (!(obj instanceof Number)) {
//				list.remove(obj);
//				i--;
//			}
//		}
//		System.out.print(list);

		// Iterator
		Iterator it = list.iterator();
		while (it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
			if (!(obj instanceof Number)) {
				it.remove();
			}
		}
		System.out.println(list);

		// for-each
//		for (Object obj : list) {
//			System.out.println(obj);
//		}

	}

}
