package com.java.collections;

import com.java.model.Card;

import java.io.*;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class CollectionsPractice {
    ArrayList<Integer> arrayList = new ArrayList<>();
    LinkedList<Integer> linkedList = new LinkedList<>();
    Vector<Integer> vector = new Vector<>();

    public void testArrayList() {
        // Basic Operation
        System.out.println(arrayList.size());
        System.out.println(arrayList.isEmpty());
        arrayList.add(122);
        arrayList.add(3);
        arrayList.add(34);
        arrayList.add(534);
        arrayList.add(134);
        arrayList.add(0, 1);
        System.out.println(arrayList);
        arrayList.get(2);
        System.out.println(arrayList);

        arrayList.remove(2);
        arrayList.set(1, 49);
        System.out.println(arrayList);
        System.out.println(arrayList.contains(1));
        // Iteration
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("For " + i + ": " + arrayList.get(i));
        }
        for (Integer i : arrayList) {
            System.out.println("Foreach " + i + ": " + i);
        }
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println("Itr " + iterator.next());
        }
        ListIterator<Integer> listIterator = arrayList.listIterator();
        while (listIterator.hasNext()) {
            System.out.println("ListIterator " + listIterator.next());
        }
        //Searching & Indexing
        Collections.sort(arrayList);
        System.out.println(arrayList);
        arrayList.sort((a, b) -> b - a);
        System.out.println(arrayList);
        Collections.replaceAll(arrayList, 534, 3);
        System.out.println(arrayList);
        Collections.rotate(arrayList, 2);
        System.out.println(arrayList);

        //Conversion
        ArrayList<Integer> arrayList1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Integer[] intArray = arrayList1.toArray(new Integer[arrayList1.size()]);
        System.out.println(intArray[3]);

        //Synchronization
        List<Integer> synchronizedList = Collections.synchronizedList(arrayList);
        synchronized (synchronizedList) {
            synchronizedList.add(4);
            arrayList.add(3);
        }

        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        list.addAll(arrayList);

        //Advanced
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(new Card("a", 1));
        cards.add(new Card("b", 2));

        cards.sort(Comparator.comparing(Card::getCardName));
        cards.forEach(System.out::println);
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("cards.ser"));
            objectOutputStream.writeObject(cards);
            objectOutputStream.close();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("cards.ser"));

            ArrayList<Card> cardsDeserial = (ArrayList<Card>) objectInputStream.readObject();
            System.out.println(cardsDeserial);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        List<String> list1 = new ArrayList<>(Arrays.asList("a", "b", "c"));
        List<String> list2 = new ArrayList<>(Arrays.asList("x", "c", "d"));
        list1.retainAll(list2);
        System.out.println(list1);

        ArrayList<Integer> bigList = new ArrayList<>();
        bigList.ensureCapacity(1000);  // Reserve space

        for (int i = 0; i < 500; i++) bigList.add(i);

        bigList.trimToSize();  // Reduce memory to match size

    }


    public void testLinkedList() {
        linkedList.add(3);
        linkedList.add(2);
        linkedList.add(1);
        linkedList.add(0);
        System.out.println(linkedList);
        Collections.reverse(linkedList);
        System.out.println(linkedList);

        LinkedList<Card> cardLinkedList = new LinkedList<>();
        cardLinkedList.add(new Card("a", 1));
        cardLinkedList.add(new Card("b", 2));
        cardLinkedList.add(new Card("c", 3));

        cardLinkedList.forEach(System.out::println);
        Card newCard = cardLinkedList.get(0);
        cardLinkedList.isEmpty();

        for(Card card : cardLinkedList) {
            System.out.println(card.getCardName());
        }
        if (cardLinkedList.contains(newCard)) {
            System.out.println(cardLinkedList.contains(newCard));
        }
        LinkedList<String> linkedList2 = new LinkedList<>(Arrays.asList("a", "b", "c"));

        cardLinkedList.offer(newCard);


    }

    public void testVector() {
    Vector<Integer> vector1 = new Vector<>();
    Vector<Integer> vector2 = new Vector<>();
    vector1.add(1);
    vector1.add(2);
    vector1.add(3);
    vector1.add(4);

    vector1.remove(2);
    System.out.println(vector1);


    }

    public void testHashSet() {
    HashSet<String> hashSet = new HashSet<>();
    hashSet.add("Apple");
    hashSet.add("Banana");
    hashSet.add("Orange");
    System.out.println(hashSet);

    }

    public void testTreeSet() {
        // can give compartor
        TreeSet<String> treeSet = new TreeSet<> ((a,b)-> b.compareTo(a)) ;
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Banana1");
//        treeSet.add(null); null not allowed
        SortedSet<String> sub = treeSet.subSet("Banana", "Apple");
        TreeSet<String> treeSet1 = new TreeSet<>(sub);
        System.out.println(treeSet1);
    }

    public void testLinkedHashSet() {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Banana1");
        linkedHashSet.add("Orange");
        System.out.println(linkedHashSet);

    }

    public void testPriorityQueue() {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(1);
        PriorityQueue<Card> cardPriorityQueue = new PriorityQueue<>((c1,c2) -> c2.getCardName().compareTo(c1.getCardName()));
        cardPriorityQueue.add(new Card("b", 1));
        cardPriorityQueue.add(new Card("a", 1));
        cardPriorityQueue.add(new Card("t", 1));
        cardPriorityQueue.add(new Card("z", 1));
        cardPriorityQueue.add(new Card("z", 1));

        while (!cardPriorityQueue.isEmpty()) {
            System.out.println(cardPriorityQueue.poll().getCardName());
        }
    }

    public void testHashMap() {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Apple");
        hashMap.put(2, "Banana");
        hashMap.put(3, "Banana1");

        hashMap.keySet().forEach(System.out::println);
        for(Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
//        hashCode() → finds candidate bucket
//        equals() → scans entries in that bucket to find the correct key

    }

    public void testTreeMap() {
    }

    public void testLinkedHashMap() {
    }

    public void testArray() {
    }

    public void testMultiDimensionArray() {
    }

    public void testJaggedArray() {
    }
}
