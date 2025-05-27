import com.java.collections.CollectionsPractice;
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
        Animal animal1 = (Animal) cat;
        animal1.run();

        Animal animal = new Cat(3);
        Cat cat1 = (Cat) animal;
        cat1.run();

        CollectionsPractice c = new CollectionsPractice();

        // 📦 List Implementations
        c.testArrayList();
        c.testLinkedList();
        c.testVector();
        c.testStack();
        c.testCopyOnWriteArrayList();

        // 🔁 Set Implementations
        c.testHashSet();
        c.testTreeSet();
        c.testLinkedHashSet();
        c.testEnumSet();
        c.testCopyOnWriteArraySet();
        c.testBitSet(); // Appears twice in your code, only calling once here
        c.testNavigableSet();

        // 🔃 Queue & Deque Implementations
        c.testPriorityQueue();
        c.tstQueue();
        c.testDeque();
        c.testLinkedBlockingQueue();
        c.testArrayBlockingQueue();
        c.testDelayQueue();
        c.testSynchronousQueue();
        c.testLinkedTransferQueue();

        // 🗺️ Map Implementations
        c.testHashMap();
        c.testTreeMap();
        c.testLinkedHashMap();
        c.testConcurrentHashMap();
        c.testConcurrentSkipListMap();
        c.testEnumMap();
        c.testWeakHashMap();
        c.testIdentityHashMap();
        c.testNavigableMap(); // Note: was called twice — now only once

        // 🧮 Arrays
        c.testArray();
        c.testMultiDimensionArray();
        c.testJaggedArray();


    }
}