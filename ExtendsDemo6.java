package Extends;
/*
 * 继承中构造方法的执行顺序
 * 			在子父类中，创建子类对象，调用子类的构造方法，
 * 			在子类的构造方法的第一行代码如果没有调用父类的构造或者没有调用子类的其他构造，则默认调用父类无参构造
 * 为什么要调用父类构造？
 * 			因为需要给父类的成员变量初始化
 * 肯定会先把父类的构造执行完毕，再去执行子类构造中的其他代码
 * 
 * 我是父类无参构造 --- 我是子类有参构造 --- 我是子类无参构造
 */
public class ExtendsDemo6 {

	public static void main(String[] args) {
		// Parent d = new Parent();
		Son6 son = new Son6();
	}
}

class Parent6{
	public Parent6() {
		System.out.println("我是父类无参构造");
	}
	
	public Parent6(int num) {
		System.out.println("我是父类有参构造");
	}
}

class Son6 extends Parent6{
	public Son6() {
		this(1);
		System.out.println("我是子类无参构造");
	}
	
	public Son6(int num) {
		this(1l);
		System.out.println("我是子类有参构造");
	}
	
	public Son6(long num) {
		//会默认调用父类无参构造
		System.out.println("我是子类有参构造");
	}
}
