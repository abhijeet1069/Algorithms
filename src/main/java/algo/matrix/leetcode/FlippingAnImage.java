package algo.matrix.leetcode;

public class FlippingAnImage {
    public int[][] flipAndInvertImage(int[][] image) {
        return invert(flip(image));
    }

    private int[][] flip(int[][] img){
        int row = img.length;
        int col = img[0].length;
        int[][] res = new int[row][col];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                res[i][j] = img[i][col-j-1];
            }
        }
        return res;
    }

    private int[][] invert(int[][] img){
        int row = img.length;
        int col = img[0].length;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                img[i][j] ^=1;
            }
        }
        return img;
    }
}
