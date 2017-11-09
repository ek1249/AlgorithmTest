package exam01;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DfsTest02 {

	static int[][] arr;
	static int[] visited;
	static int n;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int m = sc.nextInt();
		int v = sc.nextInt();
		arr = new int[n+1][n+1];
		visited = new int[n+1];
		for(int i=0;i<m;i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			arr[a][b]=arr[b][a]=1;
		}
		
		dfs(v);
		for(int i=1;i<=n;i++){
			visited[i]=0;
		}
		System.out.println();
		bfs(v);
	}
	
	public static void dfs(int v){
		visited[v]=1;
		System.out.print(v+" ");
		for(int i=1;i<=n;i++){
			if(arr[v][i]==1 && visited[i]!=1){
				dfs(i);
			}
		}
	}
	
	public static void bfs(int v){
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(v);
		visited[v]=1;
		System.out.print(v+" ");
		
		int temp;
		while(!q.isEmpty()){
			temp = q.poll();
			for(int j=1;j<=n;j++){
				if(arr[temp][j]==1 && visited[j]!=1){
					q.offer(j);
					visited[j]=1;
					System.out.print(j+" ");
				}
			}
		}
	}

}
