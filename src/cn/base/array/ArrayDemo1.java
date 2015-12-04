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
		int[] arr = new int[3];//格式1
		System.out.println(arr);  ///  [I@ae3865e    [I 代表实体类型：数组型实体，int类型的
		
		int[] arr2 = new int[]{2,34,55,23};//格式2
		
		int[] arr3 = {23,23,444,45}; //静态初始化方式
		
		
		System.out.println(arr3);
		
	}
}
