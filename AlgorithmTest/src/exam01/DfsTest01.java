package exam01;

import java.util.Scanner;

public class DfsTest01 {

	static int[] visited;
	static int[][] arr;
	static int n;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();//노드의 수 
		int e = sc.nextInt();// 간선의 수 
		
		arr = new int[n+1][n+1]; //n*n의 2차원 배열 생성
		visited = new int[n+1];// 노드를 지나갔는지 체크할 배열
		
		for(int i=0;i<e;i++){ //간선의 수만큼 for문을 돌면서 
			int t1 = sc.nextInt();//서로 연결할거 입력받아
			int t2 = sc.nextInt();
			
			arr[t1][t2]=arr[t2][t1]=1;//연결되있다고 1로 표시
			
		}
		
		dfs(1);//dfs함수 1부터 실행 <1부터 실행하려고 배열도 n+1씩 메모리 잡음>
	}
	
	public static void dfs(int m){ //int값 넘어와야되니까 
		
		 visited[m]=1;//dfs함수를 실행하면 일단 노드 방문했다는 표시 해줘
		 System.out.print(m+" ");
		 for(int i=1;i<n+1;i++){ //노드 수만큼 포문을 돌면서 
			 if(arr[m][i]==1 && visited[i]!=1){//전달받은 인자값 행의  노드수만큼 i열을 돌면서 간선이 연결되어잇고, 방문이 1이 아니면
				
				 dfs(i); //재귀호출 
			 }
		 }
		 
		

	}

}
