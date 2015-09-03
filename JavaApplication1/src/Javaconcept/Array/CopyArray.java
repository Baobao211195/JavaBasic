/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Javaconcept.Array;

/**
 *
 * @author oanh
 */
public class CopyArray {
    // khi copy mang a sang b nghia la cac bien kieu mang arrA va arrB cung truy cap toi moi doi tuong mang co gia tri trog cung mot bo nho
    
    public static void main(String[] args) {
        int [] arrA = {1,3,4,5,6,7};
        int [] arrB = arrA; // gan bien kieu mang arrA = bien kieu mang arrB..
                            // nghia la 2 bien nay cung tro toi mot vung nho chua
                            // 1 object 
        
        //print arrB
        for (int b : arrB) {
            System.out.print(b + ", ");
        }
        System.out.print("\n"+ arrA[1]);
        System.out.print("\n"+ arrA[5]);
        System.out.print("\n"+ arrB[5]);
        System.out.print("\n"+ arrB[2]+ "\n");
        
        
    }
 
    
    
}
