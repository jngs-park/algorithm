import java.util.Scanner;

public class Main{

public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     int N = sc.nextInt();
     int[][] arr = new int[100][100];
     int cnt=0;
     for(int i=0; i<N; i++) {
    	 int x = sc.nextInt();
    	 int y = sc.nextInt();
    	 
    	 for(int j=x; j<x+10; j++) {
    		 for(int k=y; k<y+10; k++) {
    			 arr[j][k] = 1;
    		 }
    	 }
     }
     for(int j=0; j<100; j++) {
		 for(int k=0; k<100; k++) {
			 if(arr[j][k] == 1) {
				 cnt++;
			 }
			 
			 }
		 } System.out.println(cnt);
}    
}