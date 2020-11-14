package day13;


class RC{
	private TV tv;
	public void setTV(TV tv) {		//TV객체의 주소전달
		this.tv=tv;
	}
	public void Power() {tv.Power();}			//TV의 power 
	public void ChUp() {tv.ChUp();}			//TV의 channel up 
	public void ChDn() {tv.ChDn();}			//TV의 channel down
	public void VlUp() {tv.VlUp();}				//TV의 volume up
	public void VlDn() {tv.VlDn();}				//TV의 volume down 
}
class TV{
	TV(){}//기본생성자
	TV(String name){
		this.name =name;	//오버로딩
		ch = 8;
		vl = 20;				//객체 생성 + 필드의 초기값을 할당하는데에 사용
	}
	private String name;		//접근 제한자 + 필드
	private boolean power;
	private int ch;
	private int vl;
	
	
	public boolean Power() {
		power = !power;
		return power;
	}
	public int ChUp() {
		if(power)
			ch++;
		Show();
		return ch;
	}
	public int ChDn() {
		if(power)
			ch--;
		Show();
		return ch;
	}
	public int VlUp() {
		if(power)
			vl++;
		Show();
		return vl;
	}
	public int VlDn() {
		if(power)
			vl--;
		Show();
		return vl;
	}
	
	public void Show() {
		if(power==true) {
			System.out.println("==="+name+"===");
			System.out.println("ch : "+ch);
			System.out.println("vol : "+vl);
			System.out.println("========\n");
		}
		else if(power==false){
			System.out.println("//////////////");
			System.out.println("//////////////");
			System.out.println("//////////////");
			System.out.println("//////////////\n");
		}
	}
}
public class Ex01_TV {

	public static void main(String[] args) {
		
		TV tv1;
		tv1 = new TV("apple");
		
		tv1.Show();
		tv1.Power();
		tv1.Show();
		
		System.out.println("리모컨 조작");
		RC rc = new RC();
		rc.setTV(tv1);
		
		rc.Power();
		rc.Power();
		rc.ChUp();
		rc.VlDn();
		
	}

}
