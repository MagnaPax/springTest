package polymorphism;

public class TVUser {
	public static void main(String[] args) {
		/* case #1
		 * ���� ��ü ��� �����
		 * �ٸ� ��ü�� ����ϰ��� �Ҷ� �� �����ؾ��ϴ� ������ ����
		 * ���� �޼������ �� �ٲ�
		 * �Ｚ TV�� ����ϰ� ������
		SamsungTV tv= new SamsungTV();
		tv.powerOn();
		tv.powerOff();
		tv.volUp();
		tv.volDown();
		*/
		
		LgTV tv= new LgTV();
		LgTV tv1= new LgTV();
		LgTV tv2= new LgTV();
		LgTV tv3= new LgTV();
		
		tv.turnOn();
		tv.turnOff();
		tv.soundUp();
		tv.soundDown();
		
		
	}

}
