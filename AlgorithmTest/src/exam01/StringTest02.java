package exam01;

import java.util.Scanner;
//입력받은 문자 아스키코드값으로 출력하기
public class StringTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		char character = sc.next().charAt(0);
		
		System.out.println((int)character);
	}

}
