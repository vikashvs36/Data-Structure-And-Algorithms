package linearDataStructures.StackDataStructure.arrayBasedImplementation;

import linearDataStructures.StackDataStructure.Stack;

public class ArrayDemo {

    public static void main(String[] args) {

        Stack<String> stack = new ArrayStack<>(5);

        stack.push("JAVA");
        stack.push("C");
        stack.push("Python");
        stack.push("C++");
        System.out.println("Length : "+stack.size());
        System.out.println("Stack : "+stack);
        System.out.println("pop() : "+stack.pop());
        stack.push("JavaScript");
//        stack.push("PHP");
        System.out.println("Stack : "+stack);
        System.out.println("Peek() : "+stack.peek());
        System.out.println("Length : "+stack.size());

        System.out.println("Clear all element of the stack. clear()");
        stack.clear();
        System.out.println("length : "+stack.size());
    }

}
