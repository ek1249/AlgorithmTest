package exam01;

import java.util.Scanner;

public class ArrayTest01 {
 
	/*���� ��ҹ��ڿ� ���⸸���� �̷���� ������ �־�����. �� ���忡�� �� ���� �ܾ ������? �̸� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. ��, �ܾ�� ���� �ϳ��� ���еȴٰ� �����Ѵ�.*/
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
