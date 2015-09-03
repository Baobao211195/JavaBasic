/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Javaconcept.String;

import java.util.Arrays;

/**
 * c1 : dung replaceALl() c2 : dua ve mang...roi append va string builder
 *
 *
 */
public class RemoveAllSpace {

    public static void main(String[] args) {
        String str1 = "pham     van      oanh";

        // C1
        String st1 = str1.replaceAll("\\s", "");
        // "\\s" : la bieu thu regex = [ \t\n\x0b\r\f]
        System.out.println(st1);

        //c2:
        char[] ch = str1.toCharArray();
        // tao mot string builder
        StringBuilder stB = new StringBuilder();
        // tim nhung ki tu khac spacewhite roi add vao stb
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != ' ') {
                stB.append(ch[i]);
            }
        }
        System.out.println(stB);
        
        //c3
        
        String [] st4 = str1.split(" ");
        System.out.println(Arrays.toString(st4));
        

    }

}
