import java.util.Random;

public class Main {
    public static void main(String[] args) {
        MyHashTable<MyTestingClass, String> table = new MyHashTable<>();

        Random random = new Random();
        for (int i = 0; i < 10000; i++) {
            String value = "Value_" + i;
            MyTestingClass key = new MyTestingClass("Key_" + random.nextInt(100));
            table.put(key, value);
        }

        for (int i = 0; i < table.chainArray.length; i++) {
            int count = 0;
            MyHashTable<MyTestingClass, String>.HashNode<MyTestingClass, String> node = table.chainArray[i];
            while (node != null) {
                count++;
                node = node.getNext();
            }
            System.out.println("Bucket " + i + ": " + count + " elements");
        }
    }
}