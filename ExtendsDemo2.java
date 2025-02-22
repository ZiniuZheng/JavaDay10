package Extends;
/*
 * Java中继承的特点：
 * 			Java语言只支持单一继承，只能继承一个父类（一个儿子只能有一个亲爹）
 * 			Java语言支持多层继承（一个儿子可以有一个亲爹，还可以有一个亲爷爷）
 */
public class ExtendsDemo2 {
	public static void main(String[] args) {
		LOL l = new LOL();
		l.update();
		l.start();
	}
}

class Game {
	public void start() {
		System.out.println("游戏启动了");
	}
}

class PCGame extends Game{
	public void update() {
		System.out.println("PCGame更新了");
	}
}

class MobileGame extends Game{
	public void update() {
		System.out.println("MobileGame更新了");
	}
}

class LOL extends PCGame{}
