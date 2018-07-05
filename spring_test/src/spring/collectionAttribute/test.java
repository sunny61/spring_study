package spring.collectionAttribute;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

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

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext5.xml");

		// 对象由spring容器创建，客户端直接拿来使用，这种思想叫IOC反转控制,之前的思想是new 由客户端创建
		/**
		 * 第一种方式 :
		 */
		DataTypeAll dataTypeAll = (DataTypeAll) applicationContext.getBean("dataTypeAll");

		String[] a = dataTypeAll.getArrayValue();
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		List b = dataTypeAll.getListValue();
		for (int i = 0; i < b.size(); i++) {
			System.out.println(b.get(i));
		}

		Map cMap = dataTypeAll.getMapValue();
		Iterator iterator = cMap.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry entry = (Entry) iterator.next();
			Object key = entry.getKey();
			Object value = entry.getValue();
			System.out.println("key=" + key + " value=" + value);
		}

		// 迭代遍历Map集合的第二种方式
		/*
		 * Set set = map.entrySet(); Iterator it = set.iterator(); while (it.hasNext())
		 * { Entry entry = (Entry) it.next(); String key = (String) entry.getKey();
		 * String value = (String) entry.getValue(); System.out.println(key + "=" +
		 * value); }
		 */

		Set dSet = dataTypeAll.getSetValue();
		Iterator it = dSet.iterator();
		while (it.hasNext()) {
			String set = (String) it.next();
			System.out.println(set);
		}

		Properties properties = dataTypeAll.getBasicInfo();
		Enumeration enumeration = properties.elements();
		while (enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}

	}

}
