package linearDataStructures.StackDataStructure.example.linkedListStack;

import linearDataStructures.StackDataStructure.Stack;
import linearDataStructures.StackDataStructure.linkedListImplementation.LinkedListStack;

import java.util.Scanner;

public class DecimalToBinary {

    public static void main(String[] args) {
        System.out.println("Enter a Number to convert into octal : ");
        Integer number = new Scanner(System.in).nextInt();

        Stack<Integer> stack = new LinkedListStack<>();
        while (number > 0) {
            stack.push(number%2);
            number /=2;
        }
        System.out.println(stack);

    }
}