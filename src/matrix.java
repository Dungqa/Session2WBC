import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix={
                {2,3,4},
                {3,9,5},
                {7,8,12}
        };
        int i;
        int j;
        int max=0;
        for (i=0;i<matrix.length;i++){
            for (j=0;j<3;j++){
                if (max < matrix[i][j]){
                    max = matrix[i][j];
                }
            }
        }

        System.out.println("Giá trị lớn nhất là: " +max);
    }
}
