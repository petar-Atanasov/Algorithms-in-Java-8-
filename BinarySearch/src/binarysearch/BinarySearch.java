package binarysearch;

public class BinarySearch {

//    The array must be fist sorted and is more effient than linear search
    
    public static int binarySearch(int[] list, int key) {
//        Finding the key in the list with binary search 
        int low = 0;
        int high = list.length - 1;

        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid]) {
                high = mid - 1;
            } else if (key == list[mid]) {
                return mid;
            } else {
                low = mid + 1;
            }
        }
        return -low -1;
    }
}
