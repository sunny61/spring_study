package spring.constructor.test4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * setter����ע�룺 <2>����ע��
 * 
 * @author Administrator
 *
 */
public class test {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext4.xml");

		// ������spring�����������ͻ���ֱ������ʹ�ã�����˼���IOC��ת����,֮ǰ��˼����new �ɿͻ��˴���
		/**
		 * ��һ�ַ�ʽ :
		 */
		Student student = (Student) applicationContext.getBean("student");

		/**
		 * �ڶ��ַ�ʽ�� User user = applicationContext.getBean(User.class);
		 */
		/**
		 * �����ַ�ʽ�� User user = applicationContext.getBean("user", User.class);
		 */
		// student������ΪjavaBean����
		System.out.println(student.getBook());
		System.out.println(student.getBook().getBookName());

	}
}
