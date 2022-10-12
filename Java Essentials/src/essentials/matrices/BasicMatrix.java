package essentials.matrices;

public class BasicMatrix {
    public static void main(String[] args) {
        //create matrices
        boolean [][] theTruthMatrix = new boolean[2][2];

        String [][] wordMatrix = new String[][]{{"Hey", "How"}, {"It's", "Going"}};

        //Iterate on Matrices
        for (int y = 0; y < wordMatrix.length; y++){ // x is an Array
            for(int x = 0; x < wordMatrix[y].length; x++){ //We can iterate x because is an array
                theTruthMatrix[y][x] = true;
                System.out.println(wordMatrix[y][x]);
            }
        }


    }
}
