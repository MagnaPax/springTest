package polymorphism;

public class SamsungTV implements TV{
	// init-method
	private Speaker speaker;
	private int price;
	
	public SamsungTV() {
		System.out.println("�Ｚ TV �⺻���� 1");
	}
	/* �����ڸ� �̿��� ������ ó��
	public SamsungTV(Speaker speaker) {
		System.out.println("�Ｚ TV ����Ŀ ���� 2");
		this.speaker=speaker;
	}
	
	
	public SamsungTV(Speaker speaker, int price) {
		System.out.println("�Ｚ TV ����Ŀ/���� ���� 3");
		// ���� ���� ����
		this.speaker = speaker;
		this.price = price;
	}
	*/
	
	
	public void tvinit() {
		System.out.println("�Ｚ TV �ʱ�ȭ");
		
		
	}

	public Speaker getSpeaker() {
		return speaker;
	}


	public void setSpeaker(Speaker speaker) {
		System.out.println("�Ｚ set Speaker");
		this.speaker = speaker;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		System.out.println("�Ｚ set Price");
		this.price = price;
	}


	public void powerOn() {
		
		System.out.println(price+" ¥�� �Ｚ TV ����");
	}
	public void powerOff() {
		System.out.println("�Ｚ TV ����");
	}
	public void volUp() {
		//System.out.println("�Ｚ TV ���� up");
		//speaker= new SonySpeaker();������ ���� ���� ����
		speaker.vUp();// �ٸ� ����Ŀ�� ��ü
	}
	public void volDown() {
		//System.out.println("�Ｚ TV ���� Down");
		//speaker= new SonySpeaker(); ������ ���� ���� ����
		speaker.vDown();
	}
	// destroy-methond
	public void tvkill() {
		System.out.println("�Ｚ TV ����");
	}
}
