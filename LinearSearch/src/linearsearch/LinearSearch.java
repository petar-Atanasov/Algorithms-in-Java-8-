package linearsearch;

//Linear Search is useful for finding an element in a small arrray 
//or an unsorted array, but inefficient for large arrays

public class LinearSearch {
    /* The method for finding a key in the list */
    public static int linearSearch(int[] list, int key){
        for(int i = 0; i < list.length; i++){
            if(key == list[i]){
                return i;
            }
        }
        return -1;
    }
}
