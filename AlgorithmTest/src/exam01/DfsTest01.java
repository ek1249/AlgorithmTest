package exam01;

import java.util.Scanner;

public class DfsTest01 {

	static int[] visited;
	static int[][] arr;
	static int n;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();//����� �� 
		int e = sc.nextInt();// ������ �� 
		
		arr = new int[n+1][n+1]; //n*n�� 2���� �迭 ����
		visited = new int[n+1];// ��带 ���������� üũ�� �迭
		
		for(int i=0;i<e;i++){ //������ ����ŭ for���� ���鼭 
			int t1 = sc.nextInt();//���� �����Ұ� �Է¹޾�
			int t2 = sc.nextInt();
			
			arr[t1][t2]=arr[t2][t1]=1;//������ִٰ� 1�� ǥ��
			
		}
		
		dfs(1);//dfs�Լ� 1���� ���� <1���� �����Ϸ��� �迭�� n+1�� �޸� ����>
	}
	
	public static void dfs(int m){ //int�� �Ѿ�;ߵǴϱ� 
		
		 visited[m]=1;//dfs�Լ��� �����ϸ� �ϴ� ��� �湮�ߴٴ� ǥ�� ����
		 System.out.print(m+" ");
		 for(int i=1;i<n+1;i++){ //��� ����ŭ ������ ���鼭 
			 if(arr[m][i]==1 && visited[i]!=1){//���޹��� ���ڰ� ����  ������ŭ i���� ���鼭 ������ ����Ǿ��հ�, �湮�� 1�� �ƴϸ�
				
				 dfs(i); //���ȣ�� 
			 }
		 }
		 
		

	}

}
