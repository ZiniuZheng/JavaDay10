package Abstract;
/*
 * 基础班学员，就业班学员
 * 
 * 共性：
 * 		属性   姓名，年龄，性别
 * 		行为   上课，学习
 */
public class AbstractTest2 {

	public static void main(String[] args) {
		BasicStudent bs = new BasicStudent();
		bs.name = "安迪";
		bs.study();
		JobStudent js = new JobStudent();
		js.name = "奥利弗";
		js.study();
	}
}

abstract class Student{
	String name; //姓名
	int age; //年龄
	String gender; //性别
	
	//上课
	public abstract void study();
}

class BasicStudent extends Student{
	public void study() {
		System.out.println(name + "上基础班课程");
	}
}

class JobStudent extends Student{
	public void study() {
		System.out.println(name + "上就业班课程");
	}
}
