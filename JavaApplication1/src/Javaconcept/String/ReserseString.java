/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Javaconcept.String;

/**
 *
 * c1 : chuyen doi ve mang kieu char c2 : dung string buffer c3; chung charAt[i]
 * c4 : dung de quy
 */
public class ReserseString {

    public static void main(String[] args) {
        String str = "oanh";
        //c1
        char[] ch = str.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {
            System.out.print(ch[i]);
        }

        //c2 :
        StringBuffer stB = new StringBuffer(str);
        System.out.println("\n" + stB.reverse());
        //c3
        String srt3 = "vanoanhpham";
        for (int i = srt3.length() - 1; i >= 0; i--) {
            System.out.print(srt3.charAt(i));
        }

        // goi c4
            System.out.println(dequyChuoi(new String("vanoanhhanam")));
    }
    // c4
    static String dequyChuoi(String str2) {

        if ((null == str2) || (str2.length() <= 1)) {
            return str2;
        }

        return dequyChuoi(str2.substring(1)) + str2.charAt(0);
    }
    

}
