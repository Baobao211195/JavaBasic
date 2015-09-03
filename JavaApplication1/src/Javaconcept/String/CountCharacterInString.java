package Javaconcept.String;

import java.util.Arrays;

/**
 * dem mot ky tu xuat hien bao lan trong string
 * c1 : dùng mảng duyêt : rồi tăng biến đếm
 * c2 : lấy chiều dài của mảng ban đầu trừ đi chiều dài của mảng
 *      sau khi đã thay chuỗi "a" = chuỗi trống :""
 * @author oanh
 */
public class CountCharacterInString {

    public static void main(String[] args) {

        String s1 = "pham van oanh ha nam";
        // c1
        char[] ch = s1.toCharArray();
        int counter = 0;
        System.out.println(Arrays.toString(ch));
        for (int i = 0; i < ch.length; i++) {

            if (ch[i] == 'a') {
                counter++;

            }
        }
        System.out.println(counter);
        
        
        // c2
        int count= s1.length() - s1.replaceAll("a", "").length();
        System.out.println(s1.replaceAll("a", "")); // thay ký tự string a = string c
        System.out.println(count);

    }

}
