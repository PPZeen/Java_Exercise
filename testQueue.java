public class testQueue {
    public static void main(String[] agrs)
    {
        Queue q1 = new Queue(20);

        for(int i = 0; i < 20; i++) q1.enqueue(i+1);

        System.out.println("Queue is empty: " + q1.empty());

        for(int i = 0; i < 20; i++)
        {
            System.out.print(q1.dequeue() + " ");
        }

        System.out.println("\nQueue is empty: " + q1.empty());
    }
}
