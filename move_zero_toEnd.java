public class Solution {
        public static int[] moveZeros(int n, int []a) {
        int res[]=new int[n];
        int j=0;
        for(int i=0;i<n;i++){
            if(a[i]!=0)
            res[j++]=a[i];
        }
        return res;
    }
}
