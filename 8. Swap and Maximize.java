
class Solution {
    public long maxSum(Long[] arr) {
        // code here
        int n = arr.length;
         Arrays.sort(arr);
        int b = 0;
        int l = n-1;
        long sum = 0;
        while(b<=l){
            sum+=Math.abs(arr[b]-arr[l]);
            b++;
            l--;
        }
        return 2*sum;
    }
}
