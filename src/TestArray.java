public class TestArray {
    public static void main(String[] args) {
        int[] array1={1,2,3,4,5};
        int[] array2={7,6,5,4,3,2,1};
        int[] array3 = new int[array1.length+array2.length];
        int z= array1.length;
        for (int i=0;i<array1.length;i++){
            array3[i]=array1[i];
        }
        for (int j=0;j<array2.length;j++){
            array3[z]=array2[j];
            z++;
        }
        for (int a=0;a<array3.length;a++){
            System.out.print(array3[a]+"\t");
        }
    }
}
