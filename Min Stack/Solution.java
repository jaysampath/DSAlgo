class MinStack {

    private Stack<Integer> pq;
    private int min ;

    public MinStack() {
        pq = new Stack<>();
        min = Integer.MAX_VALUE;
    }
    
    public void push(int x) {
        if(x <= min){          
            pq.push(min);
            min=x;
        }
        pq.push(x);
    }
    
    public void pop() {
        if(pq.pop() == min) min=pq.pop();
    }
    
    public int top() {
        return  pq.peek();
    }
    
    public int getMin() {
        return min;
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
