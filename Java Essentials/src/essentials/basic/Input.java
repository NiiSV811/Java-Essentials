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

        //If you want to store a number, you can cast

        String booksNumber;
        String calculusGrade;

        booksNumber = JOptionPane.showInputDialog("How many books you have?");
        calculusGrade = JOptionPane.showInputDialog("What is your calculus grade?");

        int numberOfBooks = Integer.parseInt(booksNumber);
        double gradeOfCalculus = Double.parseDouble(calculusGrade);

        //Now you can operate your inputs




    }
}
