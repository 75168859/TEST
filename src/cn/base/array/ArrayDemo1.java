package cn.base.array;

public class ArrayDemo1 {
	int i;
	public void sop(){
		int i;
//		System.out.println(i);
		System.out.println(this.i);
	}
	public static void main(String[] args) {
		int i;
//		System.out.println(i);
		new ArrayDemo1().sop();
		System.out.println("---" + "\u0000" + "---");
	}
}
