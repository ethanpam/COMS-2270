package lab7;

public class CountPatterns {
    public static void main(String arg[]){
        System.out.println(countPatterns(1));
        System.out.println(countPatterns(2));
        System.out.println(countPatterns(3));
        System.out.println(countPatterns(4));
        System.out.println(countPatterns(5));
        System.out.println(countPatterns(6));

    }

    public static int countPatterns(int n){
        if (n == 0){
            return 1;
        }
        else if (n < 0){
            return 0;
        }
        else {
            return countPatterns(n - 1) + countPatterns(n - 3);
        }
    }
}


//invalid