public class circular_arr_queue {
    private final int maxSize;
    private int front;
    private int rear;
    private int currentSize;
    private final int[] queueArray;

    circular_arr_queue(int size){
        this.maxSize = size;
        this.front = -1;
        this.rear = -1;
        this.currentSize = 0;
        this.queueArray = new int[maxSize];
    }

    public boolean isEmpty(){
        return currentSize == 0;
    }

    public boolean isFull(){
        return currentSize == maxSize;
    }

    public void enqueue(int item){
        if(isFull()){
            System.out.println("Queue is full. Cannot enqueue element.");
            return;
        }
        if(isEmpty()){
            front = 0;
        }
        rear = (rear + 1) % maxSize;
        queueArray[rear] = item;
        currentSize++;
        System.out.println(item+" enqueued to the queue.");
    }

    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty. Cannot dequeue element.");
            return;
        }
        int element = queueArray[front];
        front = (front + 1) % maxSize;
        currentSize--;

        if(isEmpty()){
            front = -1;
            rear = -1;
        }
        System.out.println(element + " dequeued from the queue.");
    }

    public void displayQueue(){
        if(isEmpty()){
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue elements: ");
        for(int i = 0; i < currentSize; i++){
            System.out.print(queueArray[(front+i) % maxSize] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        circular_arr_queue q = new circular_arr_queue(5);
        System.out.println(q.isFull());
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);
        System.out.println(q.isFull());
        q.displayQueue();
        q.dequeue();
        q.dequeue();
        q.displayQueue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        System.out.println(q.isEmpty());
        q.displayQueue();
    }
}
