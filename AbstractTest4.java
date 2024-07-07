package Abstract;
/*
 * 足疗店
 * 		技师
 * 			足疗技师
 * 			按摩技师
 * 
 * 共性：
 * 		属性  姓名，年龄
 * 		行为  服务
 */
public class AbstractTest4 {

	public static void main(String[] args) {
		足疗技师 足疗 = new 足疗技师();
		足疗.serve();
		
		按摩技师 按摩 = new 按摩技师();
		按摩.serve();
	}
}

abstract class 技师{
	String name; //姓名
	int age; //年龄
	
	//服务
	public abstract void serve();
}

class 足疗技师 extends 技师{
	public void serve() {
		System.out.println("洗脚");
	}
}

class 按摩技师 extends 技师{
	public void serve() {
		System.out.println("按摩");
	}
}
