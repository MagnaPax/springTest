package polymorphism;

public class AppleSpeaker implements Speaker {
	public AppleSpeaker(){
		System.out.println("Apple ����Ŀ ����");
	}
	@Override
	public void vUp() {
		System.out.println("Apple ����Ŀ v UP");
		
	}
	@Override
	public void vDown() {
		System.out.println("Apple ����Ŀ v Down");
		
	}
}
