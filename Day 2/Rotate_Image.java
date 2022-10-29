package Day 2;

public class Rotate_Image {
    public void rotate(int[][] m) {
        for(int i=0;i<m.length/2;i++)
        {
            for(int j=i;j<m.length-i-1;j++)
            {
                int d=m[i][j];
                m[i][j]=m[m.length-j-1][i];
                m[m.length-j-1][i]=m[m.length-i-1][m.length-j-1];
                m[m.length-i-1][m.length-j-1]=m[j][m.length-1-i];
                m[j][m.length-1-i]=d;
            }
        }
    }
}
