package exam01;

import java.util.Scanner;

public class IfTest03 {
	public static void main(String[] args){
		/*����
		�����̴� �⸻��縦 ���ƴ�. �����̴� ������ �����ؼ� ���� ��������� �ߴ�. �ϴ� �����̴� �ڱ� ���� �߿� �ִ밪�� �����. �� ���� M�̶�� �Ѵ�. �׸��� ���� ��� ������ ����/M*100���� ���ƴ�.

		���� ���, �������� �ְ����� 70�̰�, ���������� 50�̾����� ���������� 50/70*100�� �Ǿ� 71.43���� �ȴ�.

		�������� ������ ���� ������ ���� ������� ��, ���ο� ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.*/
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double [] arr = new double[n];
		
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		
		double max=0;
		double sum = 0;
		for(int i=0;i<arr.length;i++){
			
			if(max<arr[i]){
				max=arr[i];
			}
		}
		
		for(int i=0;i<arr.length;i++){
			arr[i] = arr[i]/max*100;
			sum+=arr[i];
		}
		
		double avg=0;
		avg = sum/n;
		System.out.printf("%.2f",avg);
	
	}
}
