package Extends;
/*
 * 继承：多个类有共同的成员变量和成员方法，抽取到另外一个类中（父类），在让多个类去继承这个父类，我们的多个类就可以获取到父类中的成员了。
 * extends
 */
public class ExtendsDemo {

	public static void main(String[] args) {
		Dota d = new Dota();
		d.start();
		
		LOL l = new LOL();
		l.start();
	}

}

class Game{
	String name;
	double version; //版本号
	String agent; //代理商
	
	public void start() {
		System.out.println("游戏启动了");
	}
	
	public void stop() {
		System.out.println("游戏关闭了");
	}
}

class Dota extends Game{}

class LOL extends Game{}
