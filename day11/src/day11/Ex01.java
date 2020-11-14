package day11;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		// 1.참조변수는 데이터 자체가 아니라, 데이터의 위치를 참조하는 주소값을 저장하는 변수
		
		// 2. 하나의 참조변수가 바라보는 방향 (대상,데이터)을 바꿀 수 있다.
		// 3. 배열은 생성 당시의 길이를 변경할 수 없는 정적 데이터 타입이지만, 새로운 배열을 생성하고 
		//	  기존 데이터를 복사하는 형식으로 길이가 늘어나는 것과 같은 효과를 만들어 낼 수 있다
		
		int [] arr = {1,2,3};
		
		System.out.println("arr의 참조변수 : "+arr);		//포인터변수의 주소라고 생각하면됨
		
		System.out.print("arr : ");
		for(int  i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}System.out.println();
		//arr 배열 출력하기
		
		
		int [] tmp = new int[arr.length+3];		//tmp를 arr보다 3길게 생성하기
		
		for(int  i=0;i<arr.length;i++) {				//arr에 있는 모든 값을 tmp에 복사
			tmp[i] = arr[i];
		}
		
		for(int  i=0;i<tmp.length;i++) {				//tmp의 길이가 더 길기 때문에
			if(tmp[i] ==0)								//비어있는 칸에는 i+1값을 대입
				tmp[i]=i+1;
		}
		arr = tmp;										//기존의 arr는 버리고 tmp가 가리키는 배열이 새로운 arr
		System.out.println("arr : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");				//arr배열 출력
		}System.out.println();
		
		}

}
