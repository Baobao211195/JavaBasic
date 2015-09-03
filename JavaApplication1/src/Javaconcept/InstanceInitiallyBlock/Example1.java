/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Javaconcept.InstanceInitiallyBlock;

/**
 *
 * @author oanh
 */
public class Example1 {
int i ;
{
    System.out.println("The first block");
}
{
    System.out.println("The second block");
}

    public Example1() {
        System.out.println("the second constructor");
    }

    public Example1(int i) {
       //this();  // neu bo this() thi khong thuc hien cau lenh trong ham khoi tao trong Example1(){}
        System.out.println("the first constructor");
    }
    
    public static void main(String[] args) {
        Example1 e1 = new Example1(34);// ket qua la The first block,The second block,the first constructor
/*
        neu co this () ket qua laf
        The first block
        The second block
        the second constructor
        the first constructor
        */
    }
}
