package GitBranchApp1;

public class MainApp {
	public static void main(String[] args) {
		//組長
		System.out.println("1st Version");
		// 組長(新增的)
		Math cMath = new Math();
		System.out.println();
		System.out.println(cMath.add(10, 20));
		System.out.println("高大腳@##$###$%%%^%##E$#@ 我來了!!!!!!!");
		//帥哥
		Handsome hh=new Handsome();
				
		System.out.println(hh.handsome("213213"));
	}
}
class Math {
	int add(int a, int b) {
		return a + b;
	}
}
