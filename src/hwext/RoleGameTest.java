package hwext;

public class RoleGameTest {

	public static void main(String[] args) {
		Hero saber = new SwordMan("亞拉岡", 1, 0);
		saber.attack();
		saber.defend();
		saber.move();
		
		System.out.println("====================");
		
		Hero archer = new ArrowMan("勒苟拉斯", 1, 0);
		archer.attack();
		archer.defend();
		archer.move();
	}

}
