package day10;

public class EX04_Swap {

	public static void main(String[] args) {
		
		String ph1 = "갤럭시 s4";
		String ph2 = "iphone 6 ";
		
		System.out.println("ph1 : "+ph1);
		System.out.println("ph2 : "+ph2);
		System.out.println();
		
		//두 변수의 값을 서로 교환하기 
		
		String tmp;//잠깐 값을 받아주기 위한 임시변수
		
		tmp=ph1;
		ph1=ph2;
		ph2=tmp;
		
		System.out.println("ph1 : "+ph1);
		System.out.println("ph2 : "+ph2);
		System.out.println();

		//배열을 선택정렬로 오름차순 정렬하기
		int arr[] = {2,7,4,8,6};

		System.out.print("arr : ");
		for(int i=0 ;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}System.out.println();
		
		for(int i=0 ;i<arr.length;i++) {		//기준
			for(int j=i;j<arr.length;j++) {		//비교대상
				if(arr[i]>arr[j]) {				//멤버변수 값을 비교 
					int tmp2 = arr[i];
					arr[i]=arr[j];
					arr[j]=tmp2;
				}
			}
		}
		System.out.print("arr : ");
		for(int i=0 ;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}System.out.println();
		
		
	}

}
