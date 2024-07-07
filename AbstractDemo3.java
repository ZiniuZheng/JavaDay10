package Abstract;
/*
 * 抽象类的成员特点：
 * 		成员变量
 * 			可以有成员变量
 * 			可以有常量
 * 		成员方法
 * 			可以有抽象方法
 * 			可以有非抽象方法
 * 		构造方法
 * 			可以有构造方法的，需要对抽象类的成员变量进行初始化
 * 
 * final:修饰类、成员变量、成员方法
 */
public class AbstractDemo3 {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.barking();
	}
}

abstract class Animal{
	String name = "啸天犬";
	final int NUM = 10; //常量
	
	public Animal() {
		System.out.println("我是抽象类的无参构造");
	}
	
	public Animal(int n) {
		System.out.println("我是抽象类的有参构造");
	}
	
	public abstract void eat();
	
	public void run() {
		
	}
}

class Dog extends Animal{
	
	public void barking() {
		System.out.println(name);
		System.out.println(NUM);
	}
	
	public void eat(){
		System.out.println("吃东西");
	}
}
