package essentials.basic;

import javax.swing.*; //Import JOption Pane

public class Input {
    public static void main(String[] args) {
        //Method 1: Using JOption Pane this is a library
        //Exists other methods... You can search for others

        String nameInput; //Create a var to store the input
                          //JOption Pane store Strings

        nameInput = JOptionPane.showInputDialog("What's your Name");

        //Output using JOP
        JOptionPane.showMessageDialog(null, "Hi " + nameInput );

        //Console output
        System.out.println("Hi " + nameInput);

    }
}
