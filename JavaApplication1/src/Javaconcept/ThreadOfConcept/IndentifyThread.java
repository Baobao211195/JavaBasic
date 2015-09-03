/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Javaconcept.ThreadOfConcept;

/**
 *
 * @author oanh
 */
public class IndentifyThread extends Thread {

    public void run() {
        System.out.println("Indentify threand : " + getId());
    }

    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Name of main thread :" + t.getName() +": "+ t.getId());        
        IndentifyThread identify = new IndentifyThread();
        identify.start();
        System.out.println(identify.getId() +": "+ identify.getName());
                
    }

}
