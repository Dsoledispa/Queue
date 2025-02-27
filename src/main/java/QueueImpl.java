public class QueueImpl<E> implements Queue<E>{
    private E[] data;
    private int p;

    public QueueImpl(int len) {
        // TO-DO
        this.data = (E[])new Object[len];
    }

    public void push(E e) throws FullQueueException {
        // TO-DO
        int numero=this.p;
        if (isFull(numero)) throw new FullQueueException();
        System.out.println(e);
        this.data[this.p++]=e;

    }


    @Override
    public E pop() throws EmptyQueueException {
        // TO-DO
        int numero=this.p;
        if (isEmpty(numero)) throw new EmptyQueueException();
        E removedElement = data[this.p-1];
        this.p= this.p -1;
        return removedElement;
    }

    private boolean isFull(int numero) {
        // TO-DO
        if (numero >=5) {
            return true;
        } else{
            return false;
        }

    }

    private boolean isEmpty(int numero) {
        // TO-DO
        if (numero >0) {
            return false;
        } else{
            return true;
        }
    }

    public int size() {
        //TO-DO
        return this.p;
    }
}
