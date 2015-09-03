
package Javaconcept;

/**tinh trung binh cua N so tu nhien
 *
 * @author oanh
 */
public class AverageNumberwithN {

    /// khai bao mot mang N so
    static double averageNumber(int... a){ // cach khai bao cho minh thich truyen
                                        // bay nhieu tham so dau vao tuy thich
        int n = a.length; // chieu dai cua mang
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + a[i];
        }
        return (sum/n);
    }
    public static void main(String[] args) {
        System.out.println(averageNumber(10,20,30));
        System.out.println(averageNumber(10,20,30,40,50,60)); // truyen bao nhieu tham so tuy thich 
                                                            //bang cach chi su dung mot ham
    }
}
