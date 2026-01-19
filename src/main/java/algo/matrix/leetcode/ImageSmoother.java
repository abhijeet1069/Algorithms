package algo.matrix.leetcode;

/**
 * An image smoother is a filter of the size 3 x 3 that can be applied to each cell of an image by rounding down the
 * average of the cell and the eight surrounding cells (i.e., the average of the nine cells in the blue smoother).
 * If one or more of the surrounding cells of a cell is not present, we do not consider it in the average
 * (i.e., the average of the four cells in the red smoother).
 *
 * Given an m x n integer matrix img representing the grayscale of an image, return the image after applying the
 * smoother on each cell of it.
 *
 * Input: img = [[100,200,100],[200,50,200],[100,200,100]]
 *
 * Output: [[137,141,137],[141,138,141],[137,141,137]]
 *
 * Explanation:
 * For the points (0,0), (0,2), (2,0), (2,2): floor((100+200+200+50)/4) = floor(137.5) = 137
 * For the points (0,1), (1,0), (1,2), (2,1): floor((200+200+50+200+100+100)/6) = floor(141.666667) = 141
 * For the point (1,1): floor((50+200+200+200+200+100+100+100+100)/9) = floor(138.888889) = 138
 * */
public class ImageSmoother {
    public int[][] imageSmoother(int[][] img) {
        int row = img.length;
        int col = img[0].length;
        int[][] res = new int[row][col];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++)
                res[i][j] = smooth(img,i,j);
        }
        return res;
    }

    private int smooth(int[][] img, int currRow,int currCol){
        int row = img.length;
        int col = img[0].length;
        int count = 0, avg = 0;
        for(int i = -1; i <= 1; i++){
            for(int j = -1; j <= 1; j++){
                int newRow = currRow+i;
                int newCol = currCol+j;
                if(newRow < 0 || newRow >= row || newCol < 0 || newCol >= col)
                    continue;
                avg += img[newRow][newCol];
                count++;
            }
        }
        return avg/count;
    }
}
