package spring.constructor.test3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ���췽��ע�룺 <1> ������ע��
 * 
 * @author Administrator
 *
 */
public class test {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext3.xml");

		// ������spring�����������ͻ���ֱ������ʹ�ã�����˼���IOC��ת����,֮ǰ��˼����new �ɿͻ��˴���
		/**
		 * ��һ�ַ�ʽ :
		 */
		Book book = (Book) applicationContext.getBean("book");

		/**
		 * �ڶ��ַ�ʽ�� User user = applicationContext.getBean(User.class);
		 */
		/**
		 * �����ַ�ʽ�� User user = applicationContext.getBean("user", User.class);
		 */

		System.out.println(book.getBookName());

	}
}
