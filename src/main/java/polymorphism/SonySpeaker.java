package polymorphism;

public class SonySpeaker implements Speaker {
	public SonySpeaker() {
		System.out.println("�Ҵ� ����Ŀ ����");
	}
	@Override
	public void vUp() {
		System.out.println("�Ҵ� ���� Up");
	}
	@Override
	public void vDown() {
		System.out.println("�Ҵ� ���� Down");
	}
}
