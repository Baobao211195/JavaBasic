package Javaconcept.ManageMemory;
/*
biến static, phương thức static
và SIB(static Initialization Block) 
đều là các thành phần static
hoặc là các thành phần static của class , c
các thành phần này được lưu trong Class Memory
để truy cập các thành phần này bạn ko cần khởi tạo đối tượng mà dùng ngay class
*/
public class StaticBlockCode {
    // static block
    static {
        // set of statements
        }
    // static block cua ham main
    static {
        System.out.println("Main Class SIB");
    }
    public static void main(String[] args) {
        //static member directly accessd with class name
        StaticComponets.staticVar = 20;
        StaticComponets.staticMethod();
    }
}
class StaticComponets{
     static int staticVar;
     static{
         System.out.println("StaticComponents SIB");
         staticVar =10 ;
     }
     static void staticMethod(){
         System.out.println("From StaticMethod");
         System.out.println(staticVar);
     }
}
/*
cac buoc thuc hien :
B1 : Java command đưa vào trong stack
+ kiểm tra MainClass được load vào trong heap chưa.nếu chưa thì load
+ một vùng nhớ ngẫu nhiên được tạo ra để đặt mainclass -> class memory
+ tất cả các biến static được load và class memory này, chỉ một thành phần
static trong mainclass. Nó được load vào trong MainClass
B2:
+ sau khi load tất cả các thành phần static, SIB được thực hiện
"chú ý.SIB ko lưu trong heap nó vừa đến stack thực hiện nhiệm vụ và rời đi"
+ sau khi load main() thì thực hiện SIB của mainclass => in ra "MainClass SIB" 
sau đó SIB rời stack
B3: java command gọi hàm main để thực hiện. main() đưa vào trong stack
    câu lệnh  StaticComponents.staticVar = 20 được thực hiện như sau :
___ nó kiểm tra xem class StaticComponents đươc load và trong memory chứa.
nếu chưa..thì load.Một vùng nhớ ngẫu nhiên được tạo ra.Tất cả các thành phần
Static của class StaticComponents bao gồm ‘staticVar and ‘staticMethod()’ 
 được load.
do biến 'staticVar' là global nên giá trị default của nó mà =0
thực tế lúc này staticVar = 0;
B4 :
sau khi load tất..thì SIB của class StaticComponents đưa và trong stack
để thực hiện và in ra  “StaticComponents SIB” và gán staticVar = 10;
sau đó rời khỏi stack
B5:
quay lại hàm main(). staticVar được gán = 20 được thực hiện
sau đó gọi staticMethod() của class StaticComponents để thực hiện
B6 :
staticMethod() đưa vào trong stack. và in ra =>  “From staticMethod”
và in giá trị staticVar = 10.sau đó rời khỏi stack
B7 :
quay trở lại hàm main().
ko còn lệnh nào..rời stack và java command cũng rời stack






*/


























