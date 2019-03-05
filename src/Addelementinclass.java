import java.sql.SQLOutput;
import java.util.Scanner;

public class Addelementinclass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] myList= new int[10];
        myList[0] = 10;
        myList[1] = 4;
        myList[2] = 6;
        myList[3] = 7;
        myList[4] = 8;
        myList[5] = 2;
        myList[6] = 1;
        myList[7] = 9;

        int index;
        int value;
        System.out.println("Nhập vị trí cần chèn:");
        index = sc.nextInt();
        if (index<0||index>9){
            System.out.println("Chịu");
        }else{
            System.out.println("Nhập giá trị cần chèn");
            value = sc.nextInt();
            for (int i=0;i < myList.length;i++){
                if (index == i){
                    int replacement;
                    for (int j = i;j<myList.length;j++){
                        replacement = myList[j];
                        myList[j]= value;
                        value = replacement;
                    }
                }
                System.out.print(myList[i]+"\t");
            }
        }

    }

}
