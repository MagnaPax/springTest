package polymorphism;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class BeanFactory {
	/* ��ü ���� ��ȯ Ŭ����
	 * */
	public Object getBean(String beanName) {
		if(beanName.equals("samsung")) {
			return new SamsungTV();
		}else if(beanName.equals("sharp")) {
			return new SharpTV();
		}
		return null;
	}
}
