package Abstract;
/*
 * 	雇员(Employee)示例：
 * 	需求：
 * 		公司中
 * 			程序员(Programmer)有姓名(name)，工号(id)，薪水(pay)，工作内容(work)
 * 			项目经理（Manager)除了有姓名(name)，工号(id)，薪水(pay)，工作内容(work)，还有奖金(bonus)
 * 
 * 	员工：
 * 		属性  name，id，pay
 * 		行为  work
 */
public class AbstractTest3 {

	public static void main(String[] args) {
		Programmer p = new Programmer();
		p.work();
		
		Manager m = new Manager();
		m.work();
	}
}

abstract class Employee{
	String name; //姓名
	String id; //id
	double pay; //薪水
	
	//工作
	public abstract void work();
}

class Programmer extends Employee{
	public void work() {
		System.out.println("写代码");
	}
}

class Manager extends Employee{
	public void work() {
		System.out.println("盯着程序员写代码");
	}
}
