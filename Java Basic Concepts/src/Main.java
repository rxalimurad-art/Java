import com.java.Collections;
import com.java.basic.VariablesAndDataTypes;
import com.java.basic.Operators;
import com.java.basic.ControlFlowStatements;
import com.java.oop.Animal;
import com.java.oop.Cat;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        VariablesAndDataTypes variablesAndDataTypes = new VariablesAndDataTypes();
        variablesAndDataTypes.printAllVariables();

        Operators operators = new Operators();
        operators.performOperations();

        ControlFlowStatements controlFlowStatements = new ControlFlowStatements();
        controlFlowStatements.demonstrateControlFlow();

        Cat cat = new Cat(8);
        Animal animal1 = (Animal)  cat;
        animal1.run();

        Animal animal = new Cat(3);
        Cat cat1= (Cat) animal;
        cat1.run();

        Collections c = new Collections();
        c.manuplate();

    }
}