import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.util.Stack;

public class Pro155_MinStack {

   public static class MinStack {

        public Stack<Integer> stack;
        public Stack<Integer> minStack;

        public MinStack() {

           stack = new Stack<Integer>();
           minStack = new Stack<Integer>();
        }

        public void push(int x) {
          stack.push(x);
          if(!minStack.isEmpty()){
              if(x < minStack.peek()){
                  minStack.push(x);
              }else {
                  minStack.push(minStack.peek());
              }
          }else {
              minStack.push(x);
          }

        }

        public void pop() {

            stack.pop();
            minStack.pop();
        }

        public int top() {
           return stack.peek();
        }

        public int getMin() {
           return minStack.peek();
        }


    }
    public static void main(String[] args) {

        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());

    }



}
