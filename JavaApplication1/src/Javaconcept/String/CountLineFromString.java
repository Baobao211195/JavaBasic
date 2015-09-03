/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Javaconcept.String;

/**
 *sử dụng regex để split string
 * @author oanh
 */
public class CountLineFromString {
    
    static int countLine(String str){
        return str.split("[\n|\r]").length; // split \n hoac \r: tham so truyen vao la bieu thu regex
        
        
    }
    public static void main(String[] args) {
        String str = "pham van oanh\nhanam\ndkbsdc\rkackda";
        int line = countLine(str);
        System.out.println(line);
    }
    
    
    
}
