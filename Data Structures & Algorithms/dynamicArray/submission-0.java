class DynamicArray {

    private int[] array;
    private int capacity;
    private int size;

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.array = new int[capacity];
        this.size = 0;
    }

    public int get(int i) {
        return this.array[i];
    }

    public void set(int i, int n) {
        this.array[i] = n;
    }

    public void pushback(int n) {
        if(this.size == this.capacity) this.resize();
        this.array[size] = n;
        size++;
    }   

    public int popback() {
        //  0  1  2  3  4 
        //[ 1, 2, 3, 4, 5]
        // capacity = 5
        // size = 5
        int element = this.array[size-1];
        this.size--;
        return element;
    }

    private void resize() {
        this.capacity *= 2;
        int[] novoArr = new int[capacity];
        for(int i = 0; i < size; i++){
            novoArr[i] = this.array[i];
        }
        this.array = novoArr;
    }

    public int getSize() {
        return this.size;
    }

    public int getCapacity() {
        return this.capacity;
    }
}
