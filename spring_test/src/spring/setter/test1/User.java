package spring.setter.test1;

public class User {

	private String userName;
	private int age;
	private double salary;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void Hello() {

		System.out.println("��ã�����" + userName);
		System.out.println("��ã��ҵ�������" + age);
		System.out.println("��ã��ҵĹ�����" + salary);

	}

	public void HelloName(String userName) {
		System.out.println("��ã�����" + userName);
	}

}
