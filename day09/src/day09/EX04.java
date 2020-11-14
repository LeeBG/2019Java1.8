package day09;

public class EX04 {

	public static void main(String[] args) {
		
		// 
		int q1;
		q1 = BigNumber(2,7,-5);		//if
		System.out.println("세 수중 가장 큰 수는 "+q1);
		
		int q2;
		q2 = Summary(1,10);				//for
		System.out.println("1부터 10까지의 합은 "+q2);
		
		int q3;
		q3 = Reverse(1234);				//while
		System.out.println("1234를 거꾸로 하면 "+q3);

		double q4;							//overloading
		q4 = BigNumber(1.2,2.3,-3.4);
		System.out.println("세 실수중 가장 큰 수는 : "+q4);
		
	}

	static int BigNumber(int x,int y,int z) {
		int bigger=0;
		if(x>y&&x>z) {
			bigger =x;
		}
		else if(x==y&&x>z) {
			bigger =x;
		}
		else if(x>y&&x==z) {
			bigger =x;
		}
		else if(y>x&&y>z) {
			bigger =y;
		}
		else if(y==x&&y>z) {
			bigger =y;
		}
		else if(y>x&&y==z) {
			bigger =y;
		}
		else if(z>x&&z>y) {
			bigger =z;
		}
		else if(z==x&&z>y) {
			bigger =z;
		}	
		else if(z>x&&z==y) {
			bigger =z;
		}	
		else{
			System.out.println("모두 같다.");
		}
		return bigger;
	}
	
	static int Summary(int a,int b) {
		int sum=0;
		
		for(int i=a;i<=b;i++)
		{
			sum+=i;
		}
		return sum;
	}
	static int Reverse(int i) {
		int rv = 0;
		while(true) {
			rv+=i%10;
			i=i/10;
			if(i==0) {
				break;
			}
			rv*=10;
		}
	
		return rv;
	}
	static double BigNumber(double x,double y,double z) {
		double bigger=0.0;
		
		if(x>y&&x>z) {
			bigger =x;
		}
		else if(x==y&&x>z) {
			bigger =x;
		}
		else if(x>y&&x==z) {
			bigger =x;
		}
		else if(y>x&&y>z) {
			bigger =y;
		}
		else if(y==x&&y>z) {
			bigger =y;
		}
		else if(y>x&&y==z) {
			bigger =y;
		}
		else if(z>x&&z>y) {
			bigger =z;
		}
		else if(z==x&&z>y) {
			bigger =z;
		}	
		else if(z>x&&z==y) {
			bigger =z;
		}	
		else{
			System.out.println("모두 같다.");
		}
		return bigger;
	}
}
