package day10;

public class Ex06_ReferenceValue {

	public static void main(String[] args) {
		
		int [] arr = new int[] {1,2,3,4,5};
		
		//배열을 선언하고 값을 할당한 경우
		//arr은 배열자체를 담고 있지 않고,
		//배열이 위치하고 있는 참조값을 가지고 있다. 
		
		//같은 자료형의 다른 변수를 선언하고 , arr의 값을 대입하면 
		//새로 생성한 변수도 똑같이 arr의 대상을 바라보게 된다.
		
		//배열은 정적인 요소가 있다.
		// 배열을 크기를 주고 선언하면 그 이상 크기를 늘릴수 없다.
		
		int [] tmp = arr;
		System.out.print("tmp : ");
		for(int i=0;i<tmp.length;i++) {
			System.out.print(tmp[i]+" ");
		}System.out.println();
		
		tmp=new int [] {10,20,30,40,50,60,70};
		
		
		System.out.print("arr : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}System.out.println();
	
		arr = tmp;
		
		System.out.print("arr : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		
		}System.out.println();
		
		//tmp도 똑같이 arr를 가르키고 있다.
		//주소값을 대입한다는 것은
		//오른쪽에 있는 것을 왼쪽에 대입한다. 참조변수 
		
		
	}//main

}//class
