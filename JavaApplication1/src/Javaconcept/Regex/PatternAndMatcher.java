/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Javaconcept.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author oanh
 */
public class PatternAndMatcher {

    public static final String Text = "pham  van     oanh  ha   nam";

    public static void main(String[] args) {

        // khai bao regex
        String regex = "\\s+"; // dau cach xua hien 1 hoc nhieu lan

        Pattern pat = Pattern.compile(regex);
        Matcher mat = pat.matcher(Text);

//        int start = mat.start();
//        int end = mat.end();
//        String group = mat.group();

        int i = 0;
        while (mat.find()) {
            System.out.println("start :" + i + "=" + mat.start());
            System.out.println("end :" + i + "=" + mat.end());
            System.out.println("group :" + i + "=" + mat.group());
            i++;
        }
    }

}
