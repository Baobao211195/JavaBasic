package Javaconcept.Regex;

/**
 *
 * @author oanh
 */
public class Regex2 {
    
    public static void main(String[] args) {
        String s1 = "a";
        // kiem tra toan bo s1
        // khop voi bat ki ky tu nao
        //===> tra ve true
        boolean match = s1.matches(".");
        System.out.println("s1 la : " + s1 + " : voi match = " + match);
        
        System.out.println( ); 
        
       String s2 = "abc";
       // kiem tra toan bo s1
       // khop voi bat ki ky tu nao
       //==> false (day la 3 ky tu)
        boolean match2 = s2.matches(".");
        System.out.println(match2 + " :" + s2);
        
        System.out.println( ); 
        
        // kiem tra toan bo s2
        // khop vs bat ki ky tu nao 0 hoac nhieu lan
        //ket hop quy tac : . va *
        match = s2.matches(".*");
        System.out.println("====>" + match);
        
        System.out.println( ); 
        
        String s3 = "m";
        // kiem tra toan bo s2
        // bat dau = m
        // su dung quy tac ^
        // == true
        match = s3.matches("^m");
        System.out.println("=====>" + match);
        
        System.out.println( ); 
        // bat dau = m
        // sau do la ki tu bat ki, xuat hien 1 hoa nhiue lan
        // ket thuc = p : p$
        // su dung ^ va .
        s3 = "mnp";
        match = s3.matches("^m.+p$");
        System.out.println("====>" + match);
        System.out.println( ); 
        s3 = "2nnp";
        // kiem tra toan bo s3 dung : "."
        //ki tu bat ki xuat hien 1 la : 
        // tiep theo la n xuat hien toi da la 1 den 3 la {1,3}
        // ket thuc = p
        match = s3.matches(".n{1,3}p$");
        System.out.println("===>" + match);
        
        System.out.println( );
        s3 = "2ybcd";
        // bat dau =2
        // tiep theo sau la x hoac y hoac z : [xyz]
        // tiep sau la 1 ki tu xuat hien 1 hoac nhieu lan : ".+"
        match = s3.matches("2[xyz].+");
        System.out.println("====>" + match);
        
        System.out.println( );
        
        String s4 = "bkbv";
        // bat dau la 1 ki tu bat ki, 1 hoac nhieu lan : ".+"
        //tiep sau la a hoac b hoac c : [abc]
        // tiep theo la z hoac v : [zv]
        // tiep theo la ki tu bat ki : ".*"
        match = s4.matches(".+[abc][zvv].*");
        System.out.println("===>" + match);
        
        
        
    }
    
}
