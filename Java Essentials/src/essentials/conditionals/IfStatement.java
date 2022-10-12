package essentials.conditionals;

public class IfStatement {
    public static void main(String[] args) {

        // Simple Condition IF
        if ( 10 < 20){
            //This executes because 10 is less than 20
        }

        // IF-ELSE
        if ("Hola" != "Hola"){
            //Don't Execute
        }else {
            //Execute
        }

        // IF ELSE-IF
        int age = 10;

        if (age > 10){
            //Don't Execute
        } else if (age<=10 && age >5) {
            //Execute
        } else if (age <= 5 ) {
            //Don't Execute
        }else {
            //Don't Execute
        }
    }
}
