class LRUCache {

    private HashMap<Integer, Integer> map;
    private int capacity;
    private LinkedList<Integer> ordem;

    public LRUCache(int capacity) {
        this.map = new HashMap<>();
        this.capacity = capacity;
        this.ordem = new LinkedList<>();
    }

    public boolean isFull(){ return this.map.size() >= this.capacity;}
    

    public int get(int key) {
        if (this.map.get(key) != null){
            this.ordem.remove((Integer) key);
            this.ordem.addLast((Integer) key);
            return this.map.get(key);
        } 
        return -1;
    }
    
    public void put(int key, int value) {
        if(this.map.containsKey(key)){
            this.map.put(key, value); 
            this.ordem.remove((Integer) key);
            this.ordem.addLast((Integer) key);
            return;
        } 
        if(isFull()){
            int lastRecentUsed = this.ordem.removeFirst();
            this.map.remove(lastRecentUsed);
        }
        this.map.put(key, value); 
        this.ordem.addLast((Integer) key);
    }
}
