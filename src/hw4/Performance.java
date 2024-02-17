package hw4;

public class Performance {

	public static void main(String[] args) {

		int[][] student = new int[8][6];
		student[0] = new int[] { 10, 37, 100, 77, 98, 90 };
		student[1] = new int[] { 35, 75, 70, 95, 70, 80 };
		student[2] = new int[] { 40, 77, 79, 70, 89, 100 };
		student[3] = new int[] { 100, 89, 90, 89, 90, 70 };
		student[4] = new int[] { 90, 64, 75, 60, 75, 50 };
		student[5] = new int[] { 85, 75, 70, 75, 90, 20 };
		student[6] = new int[] { 75, 70, 79, 85, 89, 99 };
		student[7] = new int[] { 70, 95, 90, 89, 90, 75 };
		int highestMem = 0;    //記錄分數最高的那位學生
		int[] count = new int[8];
		for (int a = 0; a < count.length; a++) {
			count[a] = 0;
		}

		for (int j = 0; j < student[0].length; j++) {    //int[6]
			highestMem = 0;
			for (int i = 0; i < student.length; i++) {    //int[8]
				if (i == 0) {
					continue;
				} else {
					if (student[i][j] == 100) {
						highestMem = i;
						break;
					} else {
						if (student[i][j] > student[highestMem][j]) {
							highestMem = i;
						}

					}
				}
			}
			count[highestMem]++;
		}
		System.out.println("1號同學考了 " + count[0] + " 次最高分");
		System.out.println("2號同學考了 " + count[1] + " 次最高分");
		System.out.println("3號同學考了 " + count[2] + " 次最高分");
		System.out.println("4號同學考了 " + count[3] + " 次最高分");
		System.out.println("5號同學考了 " + count[4] + " 次最高分");
		System.out.println("6號同學考了 " + count[5] + " 次最高分");
		System.out.println("7號同學考了 " + count[6] + " 次最高分");
		System.out.println("8號同學考了 " + count[7] + " 次最高分");

	}
}
