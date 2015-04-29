package easy.problem1_20;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by Adam on 2015/4/24.
 */
public class MinStack {
    private Stack<Integer> _stack = new Stack<Integer>();
    private Stack<Integer> _minStack = new Stack<Integer>();

    public void push(int x) {
        _stack.push(x);
        if(_minStack.isEmpty()||x<=_minStack.peek()){
            _minStack.push(x);
        }
    }

    public void pop() {
        int poped = _stack.pop();
        if(poped == _minStack.peek()){
            _minStack.pop();
        }
    }

    public int top() {
        return _stack.peek();

    }

    public int getMin() {
        return _minStack.peek();

    }
}
