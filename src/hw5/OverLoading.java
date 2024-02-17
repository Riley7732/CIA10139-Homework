package hw5;

public class OverLoading {
	
	public int maxElement(int[][] x){
		int maxI = 0, maxJ = 0;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (x[i][j] > x[maxI][maxJ]) {
						maxI = i;
						maxJ = j;
				}
			}
		}
		return x[maxI][maxJ];
	}
	
	public double maxElement(double x[][]) {
		int maxI = 0, maxJ = 0;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (x[i][j] > x[maxI][maxJ]) {
						maxI = i;
						maxJ = j;
				}
			}
		}
		return x[maxI][maxJ];
	}

	public static void main(String[] args) {
		
//	利用Overloading,設計兩個方法int maxElement(int x[][])與double maxElement(double x[][]),
//	可以找出二維陣列的最大值並回傳
		
		int[][] intArray = {{1, 6, 3}, {9, 5, 2}};
		double[][] doubleArray = {{1.2, 3.5, 2.2}, {7.4, 2.1, 8.2}};
		
		OverLoading w = new OverLoading();
		System.out.println("二維陣列的最大值為 " + w.maxElement(intArray));
		System.out.println("二維陣列的最大值為 " + w.maxElement(doubleArray));
		
	}
	
}
