package ss11_Thuc_Hanh.Bai1;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> lissInteger = new MyList<Integer>();
        lissInteger.add(1);
        lissInteger.add(2);
        lissInteger.add(3);
        lissInteger.add(4);
        lissInteger.add(5);

        System.out.println("element 4 :" + lissInteger.get(4));
        System.out.println("element 3 :" + lissInteger.get(3));
        System.out.println("element 2 :" + lissInteger.get(2));

        lissInteger.get(6);
        System.out.println("element 6: " + lissInteger.get(6));

        lissInteger.get(-1);
        System.out.println("element -1L " + lissInteger.get(-1));

    }
}
