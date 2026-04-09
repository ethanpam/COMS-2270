package lab7;

public class Pyramid {
    public static void main(String args[]){
        System.out.println(getPyramidCount(1));
        System.out.println(getPyramidCount(2));
        System.out.println(getPyramidCount(3));
    }

    public static int  getPyramidCount(int n){
        if (n == 1){
            return 1;
        }
        return n * n + getPyramidCount(n - 1);
    }
}

// getPyramidCount(3)
// = 3*3 + getPyramidCount(2)
// = 9   + getPyramidCount(2)
// = 9   + 2*2 + getPyramidCount(1)
// = 9   + 4   + getPyramidCount(1)
// = 9   + 4   + 1
// = 14