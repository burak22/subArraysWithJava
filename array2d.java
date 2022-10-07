import java.util.Arrays;

public class array2d {
    public static void main(String[] args) {
        int[] firstArray = {5,9,8,7};
        int[] secondArray = {1,4,9,8,7,5,3};
        toConsole3D(subArrayList(firstArray));
        System.out.println("---------------------------------------------------");
        System.out.println("------------------------------------------------------");
        toConsole3D(subArrayList(secondArray));
    }


    public static void toConsole3D(int[][][] array3d){
        for (int i = 0; i < array3d.length; i++) {
            System.out.print("{ ");
            for (int j = 0; j < array3d[i].length; j++) {
                System.out.print("{");
                for (int j2 = 0; j2 < array3d[i][j].length; j2++) {
                    if(j2 == array3d[i][j].length-1){
                        System.out.print(array3d[i][j][j2]);
                    }
                    else{
                        System.out.print(array3d[i][j][j2]+ ", ");
                    }
                }
                System.out.print("} ");
            }
            System.out.print("}");
            System.out.print("\n");
        }
    }
    public static void toConsole2D(int[][] array2d){
        for (int i = 0; i < array2d.length; i++) {
            System.out.print("{");
            for (int j = 0; j < array2d[i].length; j++) {
                System.out.print(array2d[i][j]+" ");
            }
            System.out.print("} ");
        }
    }
    public static int[] removeFirstNIndex(int[] inputArray1D,int n){
        int[] outputArray = Arrays.copyOfRange(inputArray1D, n, inputArray1D.length);
        return outputArray;

    }
    private static int[][] subArrayListOfFirstIndex(int[] inputArray1D){
        int[][] array2d = new int[inputArray1D.length][];
        for (int i = 0; i < array2d.length; i++) {
            int[] array1d = new int[i+1];
            for (int j = 0; j <=i; j++) {
                array1d[j] = inputArray1D[j];
            }
            array2d[i] = array1d;
        }
        return array2d;
    }
    public static int[][][] subArrayList(int[] inputArray1D){
        int[][][] outputArray3d = new int[inputArray1D.length][][];
        for (int i = 0; i < inputArray1D.length; i++) {
            outputArray3d[i] = subArrayListOfFirstIndex(removeFirstNIndex(inputArray1D, i));
        }
        return outputArray3d;
    }

}
