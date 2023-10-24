public class Queue {
    int[] elements = {};
    int size = 0;

    Queue(int size)
    {
        elements = new int[size];
    }
    Queue()
    {
        elements = new int[8];
    }

    public void enqueue(int v)
    {
        elements[size] = v;
        size += 1;
    }
    public int dequeue()
    {
        int ans = elements[0];

        for(int i = 0; i < size-1; i++)
        {
            elements[i] = elements[i+1];
        }
        elements[size-1] = 0;
        size -= 1;

        return ans;
    }
    public boolean empty()
    {
        return (this.size == 0);
    }
    public int getSize()
    {
        return this.size; 
    }
}
