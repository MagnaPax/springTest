package polymorphism;

public class TVman {

	public static void main(String[] args) {
		/* case #2
		 * �������� �̿��� ��ü ���� ���
		 * �ſ� ���� ��ü ��ü ����
		 * */
		//TV tv=new SamsungTV();
		TV tv=new SharpTV();
		tv.powerOn();
		tv.powerOff();
		tv.volUp();
		tv.volDown();

	}

}
