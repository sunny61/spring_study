package spring.test;

public class User {

	private String userName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void Hello() {
		
		System.out.println("��ã�����" + userName);
	}

	public void HelloName(String userName) {
		System.out.println("��ã�����" + userName);
	}
}
