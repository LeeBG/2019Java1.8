package day12;

import java.util.Scanner;

class Card{
	int cnt;
	char ch;
	
	void show() {
		for(int i=0;i<cnt;i++) {
			System.out.print(ch+" ");
		}System.out.println();
	}
	Card(){
	}
	Card(char ch, int cnt){
		this.ch=ch;
		this.cnt=cnt;
	}//card construct
	
}//card class

public class Ex02_Card {

	public static void main(String[] args) {
		
		Card c1 = new Card('♥',3);
		c1.show();

		Card c2 = new Card('♠',7);
		c2.show();

		Card c3 = new Card('♣',4);
		c3.show();
	
//		Card c4 = new Card();
//		Scanner sc = new Scanner();
//		생성자가 정의 되지 않으면 해당 형태로 호출 할 수 없다 .
//		= 객체를 생성 할 수 없다.
//		생성자를 호출 x 이면 그 어떤 객체도 생성 할 수 없다.
//		생성자는 일반적으로 public으로 쓰는 편이다. 
	}//main

}//class