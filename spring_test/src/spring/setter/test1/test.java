package spring.setter.test1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * setter����ע�룺 <1>������ע�루ֵע�룩
 * 
 * @author Administrator
 *
 */
public class test {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		// ������spring�����������ͻ���ֱ������ʹ�ã�����˼���IOC��ת����,֮ǰ��˼����new �ɿͻ��˴���
		/**
		 * ��һ�ַ�ʽ :
		 */
		User user = (User) applicationContext.getBean("user");

		/**
		 * �ڶ��ַ�ʽ�� User user = applicationContext.getBean(User.class);
		 */
		/**
		 * �����ַ�ʽ�� User user = applicationContext.getBean("user", User.class);
		 */
		// user������Ϊ��ͨ���ͣ�Ϊ������������
		user.Hello();

	}
}
