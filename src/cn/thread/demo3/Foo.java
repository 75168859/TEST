package cn.thread.demo3;

public class Foo {
	private int num = 10;

	public  int getNum() {
		return num;
	}

	

	public  int fix(int x){
		num = num - x;
		return num;
	}
}
