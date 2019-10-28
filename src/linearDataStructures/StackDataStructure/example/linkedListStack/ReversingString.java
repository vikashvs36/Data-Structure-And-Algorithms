package linearDataStructures.StackDataStructure.example.linkedListStack;

import linearDataStructures.StackDataStructure.Stack;
import linearDataStructures.StackDataStructure.linkedListImplementation.LinkedListStack;

import java.util.Scanner;

public class ReversingString {

    public static void main(String[] args) {

        System.out.println("Enter a String to reverse it : ");
        String str = new Scanner(System.in).nextLine();

        Stack<Character> stack = new LinkedListStack<>();
        for (char ch: str.toCharArray()) {
            stack.push(ch);
        }
        System.out.println(stack);
    }
}
