package Day 3;

class Search_a_2D_Matrix {
    public boolean searchMatrix(int[][] m, int t){
        int r=m.length-1,k=m[0].length,c=0;
        while(r>=0&&c<k)
        {
            if(m[r][c]==t)
                return true;
            else if(m[r][c]>t)
                r--;
            else
                c++;
        }
        return false;
    }
}