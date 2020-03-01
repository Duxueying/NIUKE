import java.util.Stack;
public class MinStack {
    Stack<Integer> stack1 = new Stack<>(); //创建两个栈 Stack1作为主栈
    Stack<Integer> stack2 = new Stack<>(); //用辅栈来存放最小数据
    public void push(int node) {
        stack1.push(node); //主栈存放数据
        if (stack2.isEmpty()) { //如果辅栈为空，添加该数据。
            stack2.push(node);
        }
        else if (node < stack2.peek()) {//如果新添数据比辅栈最小值还要小，那么辅栈添加该数据
            stack2.push(node);
        }
    }
    public void pop() { //在弹出的时候，如果当前弹出值为最小值，辅栈也进行pop。
        if(stack1.peek()==stack2.peek())
            stack2.pop();
        stack1.pop();
    }
    public int top() {
        return stack1.peek(); //top只是返回栈顶元素，不用进行增删操作。
    }
    public int min() {
        return stack2.peek(); //返回辅栈栈顶元素，栈顶存放的是最小元素。
    }
}