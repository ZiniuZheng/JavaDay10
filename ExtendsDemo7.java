package Extends;
/*
 * this和super的区别：
 * 		this:当前对象的引用
 * 			调用子类的成员变量
 * 			调用子类的成员方法
 * 			在子类的构造方法第一行调用子类其他构造方法
 * 		super:子类对象的父类引用
 * 			调用父类的成员变量
 * 			调用父类的成员方法
 * 			在子类的构造方法第一行调用父类的构造方法
 */
public class ExtendsDemo7 {

	public static void main(String[] args) {
		Son z = new Son();
		z.function();
	}
}

class Parent{
	int num = 10;
	
	public Parent() {
		System.out.println("我是父类无参构造");
	}
	
	public Parent(int num) {
		System.out.println("我是父类有参构造");
	}
	
	public void method() {
		System.out.println("我是父类的方法");
	}
}

class Son extends Parent{
	int num = 30;
	
	public Son() {
		this(1); //第一行不调用子类其他构造或者是父类构造，默认调用父类无参构造
		//super();
		System.out.println("我是子类无参构造");
	}
	
	public Son(int num) {
		System.out.println("我是子类有参构造");
	}
	
	public void method() {
		System.out.println("我是子类的方法");
	}
	
	public void function() {
		//this.num = 50;
		//System.out.println(num);
		//this.method();
		
		//super.num = 40;
		super.method();
		
		//System.out.println(super.num);
		//System.out.println(this.num);
	}
}
