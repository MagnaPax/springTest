package polymorphism;

public class TVDesinger {

	public static void main(String[] args) {
		/*case #3
		 * ��ü������ factory �� Ȱ���Ͽ�
		 * ȣ��Ǵ� ��� ��ü ����
		 * arg[0] �� �ݵ�� ȣ�� �Ű�����
		 * run as configuration > arguments
		 * */
		BeanFactory factory= new BeanFactory();
		TV tv=(TV)factory.getBean(args[0]);//"samsung"

		tv.powerOn();
		tv.powerOff();
		tv.volUp();
		tv.volDown();
	}

}
