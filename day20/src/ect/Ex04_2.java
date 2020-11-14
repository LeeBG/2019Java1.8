package ect;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex04_2 {

	public static void main(String[] args) throws FileNotFoundException {
		File test = new File("C:\\java_test","test.txt");
		
		Scanner sc = new Scanner(test);
		System.out.println(test.exists()&&test.isFile()&&test.canRead());
		
		while(sc.hasNextLine()) {
			System.out.println(sc.hasNextLine());
			System.out.println();
		}

	}

}
