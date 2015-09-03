/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Javaconcept.Array;

import java.util.Arrays;

/**
 *
 * @author oanh
 */
public class CopyUseCopyOfMethod {
    public static void main(String[] args) {
        
          int [] arrA = {1,3,4,5,6,7};
          int [] arrB = Arrays.copyOf(arrA, 7);
          /*
          ham copy co hai tham so copy(int [] tenmang, chieu dai mang sau khi copy)
          */
          for (int b : arrB) {
              System.out.print(b + " ");
            
        }
    }
}
