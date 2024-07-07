package Abstract;
/*
 * 抽象类的特点：
 * 		抽象方法只能在抽象类里面
 * 		抽象类和抽象方法必须被abstract修饰
 * 		抽象类不能创建对象（不能实例化）
 * 		抽象类中可以有非抽象的方法
 * 		抽象类和类的关系也是继承
 * 		一个类继承了抽象类要么重写所有的抽象方法，要么他自己是抽象类
 */
public class AbstractDemo2 {

	public static void main(String[] args) {
		//Animal a = new Animal();
		Cat cat = new Cat();
		cat.eat();
		cat.sleep();
		cat.run();
	}
}

abstract class Animal{
	public void eat() {
		System.out.println("吃饭");
	}
	
	public void sleep() {
		System.out.println("睡觉");
	}
	
	public void run() {
		System.out.println("跑步");
	}
}

class Cat extends Animal{
	public void eat() {
		System.out.println("吃鱼");
	}
	
	public void sleep() {
		System.out.println("打盹");
	}
}
