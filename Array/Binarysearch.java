public class Binarysearch{

    public static int binarysearch(int[] arr,int left,int right,int target){

        if(left>right){
            return -1;
        }

        int mid= left + (right-left) / 2;

        if(arr[mid]==target){
            return mid;
        }
        else if(arr[mid]<target){
            return binarysearch(arr, mid+1, right, target);
        }
        else{
            return binarysearch(arr, left, mid-1, target);
        }
    }

    public static void main(String[] args) {
        int[] arr={2,3,4,5,6};
        int target=2;

        int result=binarysearch(arr,0,arr.length-1,target);

        System.out.println(result !=-1 ? "found at "+ result : "Not found");

    }
}
