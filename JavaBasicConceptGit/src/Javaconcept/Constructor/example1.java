/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Javaconcept.Constructor;

/**
 * co lien quan toi tu khoa super va this
 * this su dung trong cung mot class
 * super su dung khi thua ke tu class khac
 * @author oanh
 */
public class example1 {

    public example1() {
        System.out.println("The first constructor");
    }
    public example1(int i) {
        super();
        System.out.println("The second constructor");
    }
    public example1(int i , int j) {
        this();
        System.out.println("The third constructor");
    }
     public example1(int i , int j, int k) {
        this();
        System.out.println("The four constructor");
        //super(); error
    }
     
}
