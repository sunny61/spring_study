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
 * setter����ע�룺 <2>����ע��
 * 
 * @author Administrator
 *
 */
public class test {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext5.xml");

		// ������spring�����������ͻ���ֱ������ʹ�ã�����˼���IOC��ת����,֮ǰ��˼����new �ɿͻ��˴���
		/**
		 * ��һ�ַ�ʽ :
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

		// ��������Map���ϵĵڶ��ַ�ʽ
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
