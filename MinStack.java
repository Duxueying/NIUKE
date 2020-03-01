import java.util.Stack;
public class MinStack {
    Stack<Integer> stack1 = new Stack<>(); //��������ջ Stack1��Ϊ��ջ
    Stack<Integer> stack2 = new Stack<>(); //�ø�ջ�������С����
    public void push(int node) {
        stack1.push(node); //��ջ�������
        if (stack2.isEmpty()) { //�����ջΪ�գ���Ӹ����ݡ�
            stack2.push(node);
        }
        else if (node < stack2.peek()) {//����������ݱȸ�ջ��Сֵ��ҪС����ô��ջ��Ӹ�����
            stack2.push(node);
        }
    }
    public void pop() { //�ڵ�����ʱ�������ǰ����ֵΪ��Сֵ����ջҲ����pop��
        if(stack1.peek()==stack2.peek())
            stack2.pop();
        stack1.pop();
    }
    public int top() {
        return stack1.peek(); //topֻ�Ƿ���ջ��Ԫ�أ����ý�����ɾ������
    }
    public int min() {
        return stack2.peek(); //���ظ�ջջ��Ԫ�أ�ջ����ŵ�����СԪ�ء�
    }
}