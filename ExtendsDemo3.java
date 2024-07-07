package Extends;
/*
 * 继承中成员变量的特点
 * 		子类只能获取父类非私有成员
 * 		子父类中成员变量的名字不一样，直接获取父类的成员变量
 * 		子父类中成员变量名字是一样的，获取的是子类的成员变量
 * 
 * 就近原则：谁离我近我就用谁
 * 		如果有局部变量就使用局部变量
 * 		如果没有局部变量，有子类的成员变量就使用子类的成员变量
 * 		如果没有局部变量和子类的成员变量，有父类的成员变量就使用父类的成员变量
 * 		啥都没有，出错了
 * 
 * super：可以获取父类的成员变量和成员方法，用法和this是相似的
 */
public class ExtendsDemo3 {

	public static void main(String[] args) {
		Kid3 k = new Kid3();
		k.show();
	}
}

class Dad3{
	String name = "建林";
	String superName = "父类中的成员变量";
}

class Kid3 extends Dad3{
	String name = "四葱";
	
	public void show() {
		System.out.println(super.superName);
		
		String name = "五葱";
		
		//System.out.println(super.name)
		System.out.println(this.name);
		System.out.println(name);
	}
}
