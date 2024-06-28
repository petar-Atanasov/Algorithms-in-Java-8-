package selectionsort;

public class ApplicationRunner {

      public static void main(String[] args) {
        double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
        SelectionSort.selectionSort(list);
          System.out.println(list.toString());
          
    }    
}
