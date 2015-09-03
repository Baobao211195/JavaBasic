/*/*
Ví dụ:
int a[ ]={1,3,5,7,9,11,13,15}
int b[ ]={2,4,6,8,10,12,14}
System.arraycopy(a,3,b,2,4);
Kết quả của đoạn mã lệnh trên là mảng b có giá trị mới là {2,4,7,9,11,13,14}
Nghĩa là hàm này sẽ thay thế 4 phần tử tính từ phần tử thứ 2 trong mảng b 
bằng ngần ấy phần tử tính từ phần tử thứ 3 trong mảng a.
        */
package Javaconcept.Array;

import java.util.Arrays;

/**
 *
 * @author oanh
 */
public class CopyUsearraycopyMethod {

    // phuong thuc arraycopy() la phuong thuc cua lop system 

    public static void main(String[] args) {
        int[] arrA = {1, 3, 4, 5, 6, 7};
        int[] arrB = new int[arrA.length];
        System.arraycopy(arrA, 0, arrB, 0, arrA.length);
        for (int b : arrB) {
            System.out.println(b + "\n ");
            
        }
        // tim kiem mot phan tu trong mang arrB
        int n = Arrays.binarySearch(arrB, 4); // 4 la so can tim, tra ve index cua so can tim
        System.out.println("\n" + n);
        
    }
}
