package WEEK_1.DAY_4;

import java.util.ArrayList;
import java.util.List;

public class spiral_matrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int m=matrix.length, n=matrix[0].length;
        int fr=0, lr=m-1, fc=0, lc=n-1;
        int tn=m*n;
        while(ans.size()<tn){
            for(int j=fc;j<=lc;j++){
                ans.add(matrix[fr][j]);
            }
            fr++;
            if(ans.size()>=tn) break;
            for(int i=fr;i<=lr;i++){
                ans.add(matrix[i][lc]);
            }
            lc--;
            if(ans.size()>=tn) break;
            for(int j=lc;j>=fc;j--){
                ans.add(matrix[lr][j]);
            }
            lr--;
            if(ans.size()>=tn) break;
            for(int i=lr;i>=fr;i--){
                ans.add(matrix[i][fc]);
            }
            fc++;
            if(ans.size()>=tn) break;
        }
      return ans;
    }
}