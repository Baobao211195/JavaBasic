/*
 * Given an integer array, you have to find all the leader elements in this array.
An element is said to be leader if all the elements on it’s right side are smaller than it. 
Rightmost element is always a leader.
For example, if {14, 9, 11, 7, 8, 5, 3} is the given array
then {14, 11, 8, 5, 3} are the leaders in this array.
 */
package Javaconcept.Until.Array;

import java.util.Arrays;


public class FindLeaderNumberArray {
    
    static void findleaderNumber(int... arr){

    int arrLength  = arr.length;
    // gia thiet phan tu cuoi cung la max
    // va coi phan tu cuoi cung la leader nubber
   
    int max = arr[arrLength-1];
    System.out.println("The leaders in "+Arrays.toString(arr)+" are : ");
    // phan tu cuoi cung luon la leader number
     System.out.println(arr[arrLength-1]);
    // duyet cac phan tu con lai tu trai qua phai
        for (int i = arr.length-2; i >= 0; i--) {
            // neu thanh phan do lon hon max
            if (arr[i] >max) {
                // In ra man hinh
                 System.out.println(arr[i]);
                //gan no = max
                max = arr[i];
            }
        }
    }
    
    public static void main(String[] args) {
        findleaderNumber(new int [] {12, 9, 7, 14, 8, 6, 3});
        findleaderNumber(new int[] {8, 23, 19, 21, 15, 6, 11});
    }
    
    
    
    
    
    
    
    
    
}
