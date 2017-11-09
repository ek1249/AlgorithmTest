package exam01;

import java.util.Scanner;

public class ArrayTest01 {
 
	/*영어 대소문자와 띄어쓰기만으로 이루어진 문장이 주어진다. 이 문장에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오. 단, 단어는 띄어쓰기 하나로 구분된다고 생각한다.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int cnt=0;
		
		String[] arr = str.split(" ");
		for(int i=0;i<arr.length;i++){
			if(!arr[i].equals("")){
				cnt++;
			}
		}
		System.out.println(cnt);
		
	}

}
