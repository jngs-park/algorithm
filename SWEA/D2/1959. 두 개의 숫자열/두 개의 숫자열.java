import java.util.*;
import java.io.FileInputStream;
 
class Solution
{
    public static void main(String args[]) throws Exception
    {
         
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        for(int tc = 1; tc <= T; tc++)
        {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[m];
             
            for(int i=0; i<n;i++) a[i] = sc.nextInt();
            for(int i=0; i<m;i++) b[i] = sc.nextInt();
             
            int sum=0;
            int max=0;
                for(int i=0; i<m-n+1;i++){
                    sum=0;
                    for(int j=0; j<n;j++) sum += a[j]*b[j+i];
                    if(sum >max) max = sum;
                }   
  
                for(int i=0; i<n-m+1;i++){
                    sum =0;
                    for(int j=0; j<m;j++) sum += a[i+j] * b[j];
                    if(sum > max) max = sum;
                }
            System.out.println("#"+tc+" "+max);
             
        }
    }
}