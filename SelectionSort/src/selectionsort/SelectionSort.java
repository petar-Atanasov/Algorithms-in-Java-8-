package selectionsort;

public class SelectionSort {
//    The method for sorting the numbers

    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
//      Find the minimun in the list[i..list.length -1;]
            double currentMin = list[i];
            int currentMinIdx = i;
            
            for (int j = i + 1; j < list.length; j++){
                if(currentMin > list[j]){
                    currentMin = list[j];
                    currentMinIdx = j;
                }
            }
            
//          Swap list[i] with list[currentMinIndex] if necessary 
            if(currentMinIdx != i){
                list[currentMinIdx] = list[i];
                list[i] = currentMin;
            }
        }
    }
}
