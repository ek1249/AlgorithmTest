package exam01;

import java.util.Scanner;

public class StringTest01 {
	/*- ���� ���ڽ����� üũ�ϱ� 
	apple elapp �� ���� ���ڽ���! true ���
	jihye jhjye �� �ٸ� ���ڽ�!	fail ���
	
*/

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		boolean confirm = false;
		int[] arr_a = new int[26];
		int[] arr_b = new int[26];
		boolean c = false;
		char[] chk_a = a.toCharArray();
		char[] chk_b = b.toCharArray();
		
		
		if(chk_a.length==chk_b.length){
			
			
			for(int i=0;i<chk_a.length;i++){
				int tmp = chk_a[i]-'a';
				arr_a[tmp]++;
				arr_b[chk_b[i]-'a']++;
			}
			
			
			int i;
			for(i=0;i<arr_a.length;i++){
				if(arr_a[i]!=arr_b[i]){
					System.out.println("fail");
					break;
					
				}
				
			}
			
			if(i==26){
				System.out.println("true");
			}
			
			
			
		}
		else System.out.println("fail");
		
		
		
		
		
		
		
	
	}
}
