package day18;
import java.util.ArrayList;
import java.util.Scanner;

class Student{
	private String name;
	private Integer score;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
}

public class Ex02_ArrayList {
	public static void main(String[] args) {
		// ArrayList를 이용하여 3명의 학생 데이터를 리스트에 저장하고
		// 전체 출력하기
		// index 1번에 있는 학생 데이터 삭제 (al.remove())
		// 2명의 학생 데이터 추가			(al.add())
		// 전체 출력하기					(for, sysout)
		Scanner sc = new Scanner(System.in);
//		ArrayList stu = new ArrayList(); // Object 형식의 List
		ArrayList <Student> stu = new ArrayList<Student>(); // Student만 받는 generic type
		
		for(int i=0;i<3;i++) {
			Student tmp = new Student();
			System.out.print("학생의 이름 입력 : ");
			tmp.setName(sc.nextLine());
			System.out.print("학생의 점수 입력 : ");
			tmp.setScore(Integer.parseInt(sc.nextLine()));
			stu.add(tmp);
			System.out.println();
		}
		
		for(int i=0;i<stu.size();i++) {
			System.out.printf("%d번째 학생의 이름 : %s\n", i + 1, stu.get(i).getName());
			System.out.printf("%d번째 학생의 점수 : %d\n", i + 1, stu.get(i).getScore());
			System.out.println();
		}
		
		stu.remove(1);
		
		for(int i=0;i<2;i++) {
			Student tmp = new Student();
			System.out.print("학생의 이름 입력 : ");
			tmp.setName(sc.nextLine());
			System.out.print("학생의 점수 입력 : ");
			tmp.setScore(Integer.parseInt(sc.nextLine()));
			stu.add(tmp);
			System.out.println();
		}
		
		for(int i=0;i<stu.size();i++) {
			System.out.printf("%d번째 학생의 이름 : %s\n", i + 1, stu.get(i).getName());
			System.out.printf("%d번째 학생의 점수 : %d\n", i + 1, stu.get(i).getScore());
			System.out.println();
		}
		
		int [] arr = new int[] {1,2,3,1,5};
		
		
		
		
	}

}
