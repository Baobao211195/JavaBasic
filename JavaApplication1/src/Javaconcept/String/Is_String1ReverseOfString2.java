package Javaconcept.String;

/**
 * kiem tra xem string 1 co la rotation cua string 2 hay ko
 * 
 */
public class Is_String1ReverseOfString2 {
    
    public static void main(String[] args) {
        String s1 = "pham van oanh ha nam";
        String s2 = "ha nam pham van oanh";
        // buoc 1
        if (s1.length() != s2.length()) {
            System.out.println("s2  is not rotatioin of s1");
        }else{
            // buoc 2
            String s3 = s1 + s1;
            System.out.println(s3);
            // buoc 3
            if(s3.contains(s2)){
                System.out.println("s2 is rotated of s1");
            }else{
                System.out.println("s2 is not rotation of s1");
            }
        }
        
        
    }
    
}
