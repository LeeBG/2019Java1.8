package day11;

import java.util.Scanner;

public class Quiz01_IncrementArray {

	public static void main(String[] args) {
		
		// 입력 (3): 1
		// 입력 (3): 2
		// 입력 (3): 3
		// 출력 (3): 1,2,3
		
		// 입력 (6): 4
		// 입력 (6): 5
		// 입력 (6): 6
		// 출력 (6): 1,2,3,4,5,6
		

		// 입력 (9): 11
		// 입력 (9): 22
		// 입력 (9): 0
		// 출력 (9): 1,2,3,4,5,6,11,22,0
		
		//0을 입력하여 종료
		
		Scanner sc = new Scanner(System.in);
		int [] arr= new int[3];
		int tmp[];
		
		Loop1:while(true) {
		

				
			for(int i=0;i<arr.length;i++) {
				if(arr[i]==0) {
					System.out.print((i+1)+"번째 배열에 들어갈 숫자를 입력하세요 : ");
					arr[i]=Integer.parseInt(sc.nextLine());
					if(arr[i]==0) {
						System.out.println("0을 입력하여 종료합니다 ");
						break Loop1;
					}
				}
			}
			if(arr[arr.length-1] != 0) {			// 마지막이 0이 아닐때
				System.out.print("출력 : ");
				for(int i=0 ;i<arr.length;i++) {
					System.out.print(arr[i]);
					if(i !=arr.length-1)
						System.out.print(", ");
				}System.out.println();
			}
	
		
			tmp = new int[arr.length+3];		//tmp =  new int[단위길이 +기존길이]
			
			for(int i=0 ;i<arr.length;i++)
			{
				tmp[i]=arr[i];
			}		
			arr=tmp;
		
		}//while
	
	sc.close();
		

	}

}
