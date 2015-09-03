package Javaconcept;

public class GlobalAndLocalVariable {

    static int globalvar; //default = 0 khai bao la static thi moi goi tuoc tat car
                            // tai bat cu vi tri nao trong class
//method

    static void methodOne() {
        int localMethodVar = 0;
        System.out.println(localMethodVar);
        System.out.println(globalvar);
        globalvar = globalvar + 6;
        System.out.println(globalvar);

    }

    // block

  static {
        int globalVar = 6; // day la bien cuc bo cua block
        System.out.println(globalvar); // bien toan cuc cua class = 0
        System.out.println(globalVar); // =6
        
    }

    public static void main(String[] args) {
        int localMainVar = 0;
        System.out.println(localMainVar);
        System.out.println(globalvar);
        System.out.println(globalvar);
        methodOne(); //after this method, globalVar = 6
        System.out.println(globalvar);
    }

}
