package linearDataStructures.StackDataStructure.linkedListImplementation;

import linearDataStructures.StackDataStructure.Stack;

public class LinkedListDemo {

    public static void main(String[] args) {
        Stack<Integer> linkedListStack = new LinkedListStack<>();

        System.out.println("Stack : "+ (linkedListStack.isEmpty() ? "Stack is empty" : linkedListStack));

        for (int i=1; i<=5 ; i++) linkedListStack.push(i);

        System.out.println("Stack : "+ (linkedListStack.isEmpty() ? "Stack is empty" : linkedListStack));
        System.out.println("peek : "+linkedListStack.peek());
        System.out.println("pop() : "+linkedListStack.pop());
        System.out.println("peek : "+linkedListStack.peek());
        System.out.println("Stack : "+ (linkedListStack.isEmpty() ? "Stack is empty" : linkedListStack));

        System.out.println("length : "+linkedListStack.size());
        System.out.println("Clear all element of the stack. clear()");
        linkedListStack.clear();
        System.out.println("Stack : "+ (linkedListStack.isEmpty() ? "Stack is empty" : linkedListStack));
    }

}
