class MinStack {
    Stack<Integer> pushstack = new Stack<>();
    Stack<Integer> minstack = new Stack<>();

    public MinStack() {
        
    }
    
    public void push(int val) {
        pushstack.push(val);
        if(minstack.isEmpty() || pushstack.peek()<=minstack.peek()){
            minstack.push(val);
        }
    }
    
    public void pop() {
        if(pushstack.peek().equals(minstack.peek())){
            minstack.pop();
        }
        pushstack.pop();
    }
    
    public int top() {
        return pushstack.peek();
    }
    
    public int getMin() {
        return minstack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */