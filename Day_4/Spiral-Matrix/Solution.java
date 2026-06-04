1class Solution {
2    public List<Integer> spiralOrder(int[][] matrix) {
3        List<Integer> ans = new ArrayList<>();
4        int m=matrix.length, n=matrix[0].length;
5        int fr=0, lr=m-1, fc=0, lc=n-1;
6        int tn=m*n;
7        while(ans.size()<tn){
8            for(int j=fc;j<=lc;j++){
9                ans.add(matrix[fr][j]);
10            }
11            fr++;
12            if(ans.size()>=tn) break;
13            for(int i=fr;i<=lr;i++){
14                ans.add(matrix[i][lc]);
15            }
16            lc--;
17            if(ans.size()>=tn) break;
18            for(int j=lc;j>=fc;j--){
19                ans.add(matrix[lr][j]);
20            }
21            lr--;
22            if(ans.size()>=tn) break;
23            for(int i=lr;i>=fr;i--){
24                ans.add(matrix[i][fc]);
25            }
26            fc++;
27            if(ans.size()>=tn) break;
28        }
29      return ans;
30    }
31}