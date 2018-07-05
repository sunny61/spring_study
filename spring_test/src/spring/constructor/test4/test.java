package spring.constructor.test4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * setter方法注入： <2>引用注入
 * 
 * @author Administrator
 *
 */
public class test {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext4.xml");

		// 对象由spring容器创建，客户端直接拿来使用，这种思想叫IOC反转控制,之前的思想是new 由客户端创建
		/**
		 * 第一种方式 :
		 */
		Student student = (Student) applicationContext.getBean("student");

		/**
		 * 第二种方式： User user = applicationContext.getBean(User.class);
		 */
		/**
		 * 第三种方式： User user = applicationContext.getBean("user", User.class);
		 */
		// student中属性为javaBean引用
		System.out.println(student.getBook());
		System.out.println(student.getBook().getBookName());

	}
}
