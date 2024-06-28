package linearsearch;

public class ApplicationRunner {

    public static void main(String[] args) {
        
        int[] list = {1, 4, 4, 2, 5, -3, 6, 2};
        int i = LinearSearch.linearSearch(list, 4);
        int j = LinearSearch.linearSearch(list, -4);
        int k = LinearSearch.linearSearch(list, -3); 
        
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
    }

}
