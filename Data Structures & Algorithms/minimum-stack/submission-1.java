class MinStack {
    private ArrayList<Integer> stack;
    private ArrayList<Integer> minStack;

    public MinStack() {
        this.stack = new ArrayList<>();
        this.minStack = new ArrayList<>();
    }
    
    public void push(int val) {
        this.stack.add(val);
        if(minStack.size() != 0) val = Math.min(val, minStack.get(minStack.size()-1));
        this.minStack.add(val);
    }
    
    public void pop() {
        this.stack.remove(stack.size()-1);
        this.minStack.remove(minStack.size()-1);
    }
    
    public int top() {
        return this.stack.get(stack.size()-1);
    }
    
    public int getMin() {
        return this.minStack.get(minStack.size()-1);
    }
}
