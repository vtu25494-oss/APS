import java.util.Arrays;
class Squares of a Sorted Array {
    public int[] sortedSquares(int[] arr){
        int n = arr.length;
        int result[] = new int[n];
        for(int i=0;i<n;i++){
            result[i]  = arr[i]*arr[i];
        }
        Arrays.sort(result);
        return result;
    }
}