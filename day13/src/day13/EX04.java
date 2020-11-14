package day13;

class STD{
	String name;
	int score;
	
	STD(String name , int score){
		this.name=name;
		this.score =score;
	}
	public void Show() {
		System.out.println("이름 : "+name);
		System.out.println("점수 : "+score);
	}
}
public class EX04 {
	public static void main(String[] args) {
		STD arr[] = new STD[3];
		arr[0] = new STD("A",10);
		arr[1] = new STD("B",20);
		arr[2] = new STD("C",30);
		
		for(int i=0 ;i<arr.length;i++) {
			arr[i].Show();
			System.out.println();
		}//for

	}//main
}//class
