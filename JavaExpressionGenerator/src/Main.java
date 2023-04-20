import java.beans.beancontext.BeanContextServiceAvailableEvent;

public class Main {
    final private static VariableClass VARIABLE_CLASS = new VariableClass();
    public Main() {

        final String[] xExpressions = {"++x", "--x", "x++", "x--"};
        final String[] yExpressions = {"++y", "--y", "y++", "y--"};
        final char[] sideOperators = {'+', '-', '*'};

        for(int i = 1; i<= VARIABLE_CLASS.number_of_expressions; i++) { /* LOOPS THE LOGIC OF PRINTING EXPRESSIONS */

            VARIABLE_CLASS.reRollValues(); // RANDOMIZES THE VALUES OF THE VARIABLES

            if (VARIABLE_CLASS.chooseYX == 0) /* IF RANDOM INITIALIZES THIS VARIABLE AS '0' THEN THE EXPRESSIONS OF 'X' ARE PRINTED */ {
                if(i!= VARIABLE_CLASS.number_of_expressions) /* THIS AVOIDS PRINTING AN UNNECESSARY OPERATOR AT THE END OF THE OVERALL EXPRESSION */ {
                    System.out.print(xExpressions[VARIABLE_CLASS.expressionGenerator] + " " + sideOperators[VARIABLE_CLASS.operatorGenerator_SIDE] + " "); /* THIS PRINTS AN 'X' EXPRESSION WITH AN OPERATOR. */
                } else {
                    System.out.print(xExpressions[VARIABLE_CLASS.expressionGenerator] + " "); /* PRINTS AN 'X' EXPRESSION WITHOUT AN OPERATOR */
                }

                VARIABLE_CLASS.reRollValues(); // RANDOMIZES THE VALUES OF THE VARIABLES

            } else if (VARIABLE_CLASS.chooseYX == 1) /* IF RANDOM INITIALIZES THIS VARIABLE AS '1' THEN THE EXPRESSIONS OF 'Y' ARE PRINTED */ {
                if(i!= VARIABLE_CLASS.number_of_expressions) /* THIS AVOIDS PRINTING AN UNNECESSARY OPERATOR AT THE END OF THE OVERALL EXPRESSION */ {
                    System.out.print(yExpressions[VARIABLE_CLASS.expressionGenerator] + " " + sideOperators[VARIABLE_CLASS.operatorGenerator_SIDE] + " "); /* THIS PRINTS AN 'Y' EXPRESSION WITH AN OPERATOR. */
                } else {
                    System.out.print(yExpressions[VARIABLE_CLASS.expressionGenerator] + " "); /* PRINTS AN 'Y' EXPRESSION WITHOUT AN OPERATOR */
                }

                VARIABLE_CLASS.reRollValues(); // RANDOMIZES THE VALUES OF THE VARIABLES

            }
        }
    }

    public static void main(String[] args) {
        final String[] mainOperator = {"+=", "-=", "*="};

        VARIABLE_CLASS.printValues(); // PRINTS THE VALUES OF 'X' AND 'Y'
        VARIABLE_CLASS.ask_for_expressions(); // ASKS FOR THE NUMBER OF EXPRESSIONS NEEDED
        VARIABLE_CLASS.GenerateRandomVariable(); // PRINTS EITHER 'X' OR 'Y' AS THE FIRST VARIABLE WHOSE VALUE IS BEING INITIALIZED
        System.out.print(mainOperator[VARIABLE_CLASS.operatorGenerator_MAIN]+" "); // PRINTS THE MAIN OPERATOR
        new Main(); // RUNS THE CONSTRUCTOR WHICH CONTAINS THE MAIN LOGIC OF THIS PROGRAM
    }
}
