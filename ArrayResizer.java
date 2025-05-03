public class ArrayResizer {
    public static boolean isNonZeroRow (int [][] array2D, int r ) {
        for (int i : array2D [r] ) {
            if (i == 0 ) {
                return false;
            }
            
        }
        return true;
    }
    public static int numNonZeroRows (int [][] array2D ) {
        int count = 0; 
        for (int i = 0 ;i<array2D.length; i++) {
            if (isNonZeroRow (array2D, i)) {
                count++;
            }
        }
        return count;
    }
    public static int[][] resize (int [][] array2D ) {
        int a = 0 ;
        int row = numNonZeroRows(array2D);
        int col= array2D [0].length;
        int [] [] list  = new int [row] [col];
        for (int i = 0 ;i<array2D.length; i++) {
            if (isNonZeroRow (array2D, i)) {
                list[a]=array2D[i];
                a++;
            }
        }
        return list;
    }


}