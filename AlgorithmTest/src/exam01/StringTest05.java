package exam01;

import java.util.Arrays;
import java.util.Scanner;

public class StringTest05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int[] cnt = new int[26];
		int[] arr;
		
		for(int i=0;i<str.length();i++){
			int num = str.charAt(i);
			if(num>='a'){
				cnt[num-'a']++;
			}
			else{
				cnt[num-'A']++;
			}
		}
		
		int max=cnt[0];
		arr = Arrays.copyOf(cnt, 26);
		Arrays.sort(arr);
		
		if(arr[24]==arr[25]){
			System.out.println("?");
		}
		else{
			for(int j=0;j<arr.length;j++){
				if(arr[25]==cnt[j]){
					System.out.printf("%c",65+j);
				}
			}
		}
		
		
		
	}

}
