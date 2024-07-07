package Abstract;
/*
 * 基础班老师，就业班老师
 * 
 * 共性：
 * 		属性   姓名，年龄，性别
 * 		行为   讲课，唱歌
 */
public class AbstractTest {

	public static void main(String[] args) {
		BasicTeacher bt = new BasicTeacher();
		bt.name = "张老师";
		bt.teach();
		
		JobTeacher jt = new JobTeacher();
		jt.name = "王老师";
		jt.teach();
	}
}

abstract class Teacher{
	String name; //姓名
	int age; //年龄
	String gender; //性别
	
	//讲课
	public abstract void teach();
}

class BasicTeacher extends Teacher{
	public void teach() {
		System.out.println(name + "讲基础班课程");
	}
}

class JobTeacher extends Teacher{
	public void teach() {
		System.out.println(name + "讲就业班课程");
	}
}
