package exam01;

import java.util.Scanner;

/*���ĺ� �ҹ��ڷθ� �̷���� �ܾ� S�� �־�����. 
 * ������ ���ĺ��� ���ؼ�, �ܾ ���ԵǾ� �ִ� ��쿡�� ó�� �����ϴ� ��ġ��,
 *  ���ԵǾ� ���� ���� ��쿡�� -1�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.*/
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
