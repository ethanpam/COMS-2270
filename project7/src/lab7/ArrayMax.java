package lab7;

public class ArrayMax {
    public static void main(String args[]){
        int[] test = {3, 4, 5, 1, 2, 3, 2};
        int result = arrayMax(test);
        System.out.println(result); // 5
    }

    public static int arrayMax(int[] arr){
        return arrayMaxRec(arr, 0, arr.length- 1);
    }

    public static int arrayMaxRec(int[] arr, int start, int end){
        if (start == end){
            return arr[start];
        }
        else{
            int mid = (start + end) / 2;
            int leftMax = arrayMaxRec(arr, start, mid);
            int rightMax = arrayMaxRec(arr, mid + 1, end);

            if (leftMax > rightMax){
                return leftMax;
            }
            else{
                return rightMax;
            }
        }
    }
}
