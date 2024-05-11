public class HashtableTest {
    public static void main(String[] args){
        MyHashTable<TestingField,Worker> table = new MyHashTable<>();

        for (int i = 0; i < 1000; i++) {
            TestingField key = new TestingField("Key" + (int)(Math.random() * 200));
            Worker value = new Worker("Worker" + i, (int)(Math.random() * 100));
            table.put(key, value);
        }
        System.out.println("Distribution of elements across buckets:");
        table.printBucketCounts();
    }
}

