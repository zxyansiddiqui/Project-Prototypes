import java.util.Random;
import java.util.Scanner;

public class VariableClass {

    public VariableClass() {

    }

    Random random = new Random();
    Scanner sc = new Scanner(System.in);

    int chooseYX = random.nextInt(2);
    int operatorGenerator_SIDE = random.nextInt(3);
    int operatorGenerator_MAIN = random.nextInt(3);
    int expressionGenerator = random.nextInt(4);
    int variableGenerator = random.nextInt(2);

    int valueUpperbounds = 49;
    int x = (random.nextInt(valueUpperbounds) + 1);
    int y = (random.nextInt(valueUpperbounds) + 1);

    int number_of_expressions;

    public void leaveLine() {
        System.out.println(" ");
    }

    public void printValues() {
        System.out.println("The value of x is: "+x);
        System.out.println("The value of y is: "+y);
        leaveLine();
    }

    public void GenerateRandomVariable() {
        if(variableGenerator==0) {
            System.out.print("x ");
        } else if(variableGenerator==1) {
            System.out.print("y ");
        }
    }
    public void ask_for_expressions() {
        System.out.println("Enter the number of expressions needed: ");
        number_of_expressions = sc.nextInt();
        leaveLine();
    }

    public void reRollValues() {
        variableGenerator = random.nextInt(2);
        expressionGenerator = random.nextInt(4);
        operatorGenerator_MAIN = random.nextInt(3);
        operatorGenerator_SIDE = random.nextInt(3);
        chooseYX = random.nextInt(2);
    }
}