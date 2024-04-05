package hw8;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TrainTest {

	public static void main(String[] args) {

		Set<Train> set = new TreeSet<>();
		Train a = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		Train b = new Train(1254, "區間", "屏東", "基隆", 700);
		Train c = new Train(118, "自強", "高雄", "台北", 500);
		Train d = new Train(1288, "區間", "新竹", "基隆", 400);
		Train e = new Train(122, "自強", "台中", "花蓮", 600);
		Train f = new Train(1222, "區間", "樹林", "七堵", 300);
		Train g = new Train(1254, "區間", "屏東", "基隆", 700);

		set.add(a);
		set.add(b);
		set.add(c);
		set.add(d);
		set.add(e);
		set.add(f);
		set.add(g);

//		for (Train obj : set) {
//			System.out.println(obj.getNumber() + ", " + obj.getStart() + ", " + obj.getStart() + ", " + obj.getDest()
//					+ ", " + obj.getPrice());
//		}

		Iterator it = set.iterator();
		while (it.hasNext()) {
			Train obj = (Train) it.next();
			System.out.println(obj.getNumber() + ", " + obj.getStart() + ", " + obj.getStart() + ", " + obj.getDest()
					+ ", " + obj.getPrice());
		}

	}

}
