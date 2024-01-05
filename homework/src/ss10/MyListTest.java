package ss10;

public class MyListTest {
    public static void main(String[] args) {
        MyList<String> myList1 = new MyList<>();
        testMyList(myList1);

        MyList<String> myList2 = new MyList<>();
        testMyList(myList2);
    }

    public static void testMyList(MyList<String> myList){
        myList.add("Element 1");
        myList.add("Element 2");
        myList.add("Element 3");

        System.out.println("Size" + myList.size());

        for (int i = 0; i < myList.size; i++) {
            System.out.println("Element at index " + i + ": " + myList.get(i));
        }

        myList.set(1, "New Element");
        System.out.println("Update element at index 1: " + myList.get(1));

        myList.remove(0);
        System.out.println("After removing elements at index 0;");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println("Element at index: " + i + ": " + myList.get(i));
        }

        System.out.println("Contains 'New Element': " + myList.contains("New Element"));
        System.out.println("Index of 'New Element' : " + myList.IndexOf("New Element"));

        myList.clear();
        System.out.println("After clearing: " + myList.size());
    }
}
