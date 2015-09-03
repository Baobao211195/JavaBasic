package Javaconcept.Until.Array;

import java.util.Arrays;

/**
 *
 * @author oanh
 */
public class BinarySearching {

    public static void main(String[] args) {
        int[] arr = {2, 5, 9, 4, 1, 0, 45, 34, 28, 18};

        // phai sap xem truoc, sau do luu lai khi tim kiem
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr, 9));
        System.out.println(Arrays.binarySearch(arr, 78)); // tra ve ket qua la -11 = -(length+ 1)
        
        
        
    }
    
}
