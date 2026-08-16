public class Solution {
    public static int search(int arr[], int key) {
        // Write your code here.
        int left = 0;
        int right = arr.length-1;

        while(left<=right){
            int mid = (left+right)/2;
            //System.out.println(left+" "+right+" "+mid);

            if(arr[mid]==key){
                return mid;
            //right is sorted
            }else if(arr[right]>=arr[mid]){
                if(arr[mid]<key&&arr[right]>=key){
                    left = mid+1;
                }else{
                    right = mid-1;
                }
            //left is sorted
            }else{
                if(arr[mid]>key&&arr[left]<=key){
                    right = mid-1;
                }else{
                    left = mid+1;
                }
            }
        }
        return -1;
    }
}
