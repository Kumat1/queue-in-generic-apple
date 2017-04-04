package Tugas;

import java.lang.reflect.Array;

public class queue<T>{
    public T[] element;
    public int head = 0;
    public int tail = 0;

    queue(Class<?> namaClass,int size)
    {
        element = (T[]) Array.newInstance(namaClass,size);
    }

    public static void main(String[] args){
        queue<Integer> Queue = new queue<>(Integer.class,5);
        Queue.enqueue(10);
        Queue.enqueue(11);
        Queue.dequeue();
        Queue.dequeue();
        Queue.dequeue();
    }

    public void enqueue(T item){
        element[tail++] = item;
    }

    public T dequeue() {
        if(head== 0 && tail == 0) {
            System.out.println("Antrian masih kosong");
        }else if(head == tail)
        {
            System.out.println("Antrian sudah kosong");
        }
        else{
            System.out.println("Nomor antrian yang keluar adalah :" + element[head++]);
        }
        return null;
    }
}
