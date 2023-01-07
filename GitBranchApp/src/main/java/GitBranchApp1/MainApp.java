package GitBranchApp1;

public class MainApp {
	public static void main(String[] args) {
		// 蝯
		System.out.println("1st Version");
		// 蝯(�憓�)
		Math cMath = new Math();
		System.out.println();
		System.out.println(cMath.add(10, 20));
		
		
		
		
		//帥哥
		Handsome hh=new Handsome()
				
		System.out.println(hh.handsome("213213"));
	}
}
class Math {
	int add(int a, int b) {
		return a + b;
	}
}
class Handsome{
	private String s="大腳";
	int handsome(String str) {
		return  str+s;
	}
}