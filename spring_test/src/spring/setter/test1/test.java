package spring.setter.test1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * setter方法注入： <1>非引用注入（值注入）
 * 
 * @author Administrator
 *
 */
public class test {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		// 对象由spring容器创建，客户端直接拿来使用，这种思想叫IOC反转控制,之前的思想是new 由客户端创建
		/**
		 * 第一种方式 :
		 */
		User user = (User) applicationContext.getBean("user");

		/**
		 * 第二种方式： User user = applicationContext.getBean(User.class);
		 */
		/**
		 * 第三种方式： User user = applicationContext.getBean("user", User.class);
		 */
		// user中属性为普通类型，为基本数据类型
		user.Hello();

	}
}
