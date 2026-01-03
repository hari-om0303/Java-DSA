public class peak_index_in_rotated_bs {
    public static void main(String[] args) {
        int [] arr = {4,5,6,7,1,2,3};
        System.out.println(findPivot(arr));
    }
    static int findPivot(int [] arr){
        int s = 0;
        int e = arr.length-1;
        while (s<=e){
        int mid = s+(e-s)/2;
//        case 1
            if (mid<e && arr[mid]>arr[mid+1]){
                return mid;
            }
//        case 2
            if(mid>s && arr[mid]<arr[mid-1]){
                return mid;
            }
//            case 3
            if (arr[mid] <= arr[s]){
                e = mid-1;
            }else {       //case 4
                s = mid+1;
            }
        }
        return -1;
    }
}
