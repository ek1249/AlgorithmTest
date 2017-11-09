package exam01;

import java.util.Scanner;

/*알파벳 소문자로만 이루어진 단어 S가 주어진다. 
 * 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를,
 *  포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.*/
public class StringTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int[] alph = new int[26];
		for(int i=0;i<alph.length;i++){
			alph[i]=-1;
		}
		char[] chk = str.toCharArray();
		for(int i=0;i<chk.length;i++){
			int temp = chk[i]-'a';
			if(alph[temp]==-1){
				alph[temp]=i;
			}
		}
		
		for(int i=0;i<alph.length;i++){
			System.out.print(alph[i]+" ");
		}
		
	}

}
