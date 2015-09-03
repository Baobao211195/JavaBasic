
package Javaconcept.Regex;

/**
 *
 * @author oanh
 */
public class Regex3 {
    
    public static final String TEXT = "This is my text";
    public static void main(String[] args) {
        
        // khoang trang xuat hien 1 hoac nhieu la 
        // cac ky tu khoang trang : \t\n\x0b\r\f
        // ket hop : \s va +
        String regex = "\\s+";
        String [] splitString = TEXT.split(regex);
        for (String spL : splitString) {
            System.out.println(spL + " ");
           
        }
        // thay the cac khoang trang = phim tab
        String newText = TEXT.replaceAll("\\s+", "\t");
        System.out.println(newText);
    }
    
}
