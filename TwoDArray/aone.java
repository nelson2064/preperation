

public class aone {
    public static void printSpiral(int matrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;




        
        //print boundaries
        while(startRow <= endRow && startCol <= endCol) {
            for(int j=startCol; j<=endCol; j++) {
                System.out.print(matrix[startRow][j]+" ");
            }
            
            for(int i=startRow+1; i<=endRow; i++) {
                System.out.print(matrix[i][endCol]+" ");
            }

            for(int j=endCol-1; j>=startCol; j--) {
               
                System.out.print(matrix[endRow][j]+" ");
            }

            for(int i=endRow-1; i>startRow; i--) {
             
                System.out.print(matrix[i][startCol]+" ");
            }

            startCol++; 
            endCol--;
            startRow++;
             endRow--;
        }

        System.out.println();
    }

    public static void main(String args[]) {
        int matrix[][] = {{1, 2, 3, 4 ,2},
                        {5, 6, 7, 8 ,2 },
                        {9, 10, 11, 12 ,2},
                        {13, 14, 15, 16 ,2},
                        {17, 18, 19, 20 ,2}};
        printSpiral(matrix);
    }
}
