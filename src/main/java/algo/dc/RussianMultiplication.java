package algo.dc.textbook;

public class RussianMultiplication {
    int c = 2;
    public int multiply(int y,int z){
        if(z == 0)
            return 0;
        else
            return (multiply(c*y,z/c) + y*(z%c));
    }
}
