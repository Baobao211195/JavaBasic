/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExampleJavaConcept;

/**
 *
 * @author oanh
 */
public class Thunghiemj {
    
    String name;
    public Thunghiemj(String perName){
        name = perName;
    }
    public String greet(String yourName){
        return String.format("hi my name  is %s và and %s", name,yourName);
    }
    
    public static void main(String[] args) {
        Thunghiemj th = new Thunghiemj("van oanh");
        System.out.println( th.greet("ha nam"));
        
       String st1 = new String("vanoanh");
      
        
        
        
    }    
    
}
