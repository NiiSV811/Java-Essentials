package essentials.arrays;

public class ArraysBasics {
    public static void main(String[] args) {

        //creating arrays

        //creating with elements
        char [] myCharArray = new char[]{'a', 'b', 'c'};

        //creating void array
        int [] myNumberArray = new int[4];

        // Filling out my Number array

        for (int i = 0; i < myNumberArray.length; i++){
            myNumberArray[i] = 1;
        }

        // Printing my Number array
        for (int i = 0; i < myNumberArray.length; i++){
            System.out.println(myNumberArray[i]);
        }

        // Editing my char array
        myCharArray[1] = 'v';
        // [ 'a' , 'v', 'c']
    }
}
