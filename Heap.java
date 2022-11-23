public  class Heap {
   int[] heap;
   int n;

   public Heap(int size){
       heap = new int [size+1];
       n = 0;
   }

   public boolean isEmpty(){
       return n == 0;
   }

   public void insert(int value){
       if(this.n ==heap.length-1){
           int [] temp = new int [n*2];
           for (int i = 0;i<heap.length;i++){
               temp[i] = heap[i];
           }
           heap = temp;
       }
       n++;
       heap[n] = value;
       heapify(n);

   }
   public void heapify(int current){
       while (current>1 && heap[current/2]<heap[current]){
           int temp= heap[current];
           heap[current] = heap[current/2];
           heap[current/2] = temp;
           current = current/2;
       }
   }
   public void display(){
       for (int i =1;i<=n;i++)
           System.out.println(heap[i]+" ");
   }

    public static void main(String[] args) {
        Heap maxHeap = new Heap(5);
        maxHeap.insert(1);
        maxHeap.insert(3);
        maxHeap.insert(2);
        maxHeap.insert(6);
        maxHeap.insert(5);

        maxHeap.display();


    }
}
