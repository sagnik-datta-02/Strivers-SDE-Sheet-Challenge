import java.io.*;
import java.util.* ;

public class Solution {
    public static void setZeros(int matrix[][]) {
        
        int n=matrix.length;
        int m= matrix[0].length;
        int flag=0,p=0,q=0;
         int[] row = new int[n];

        int[] col = new int[m];

        for(int i=0;i<n;i++) row[i]=0;

        for(int i=0;i<m;i++) col[i]=0;
          for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
               if(matrix[i][j]==0)
               {//flag=1;
               row[i]=1;col[j]=1;
               }
               

            }
        //if(flag==1)
       // break;
        }
         for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if (row[i]==1 || col[j]==1)
                matrix[i][j]=0;
            }
        }
        // Write your code here..
    }

}
