
import java.util.LinkedList;
import java.util.Spliterator;
import java.util.Spliterators;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yeheni
 */
import java.util.LinkedList;
import java.util.SequencedCollection;

public class LinkedListSequencedCollectionExample {
    public static void main(String[] args) {
        // Create a LinkedList (which implements SequencedCollection)
        SequencedCollection<String> fruits = new LinkedList<>();

        // Add elements to the end
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.addLast("Orange"); // alternative to add()
        System.out.println("Initial list: " + fruits);
        // Output: Initial list: [Apple, Banana, Orange]

        // Add element to the beginning
        fruits.addFirst("Mango");
        System.out.println("After adding Mango first: " + fruits);
        // Output: After adding Mango first: [Mango, Apple, Banana, Orange]

        // Get first and last elements
        System.out.println("First fruit: " + fruits.getFirst());
        // Output: First fruit: Mango
        System.out.println("Last fruit: " + fruits.getLast());
        // Output: Last fruit: Orange

        // Remove first and last elements
        System.out.println("Removed first: " + fruits.removeFirst());
        // Output: Removed first: Mango
        System.out.println("Removed last: " + fruits.removeLast());
        // Output: Removed last: Orange
        System.out.println("After removals: " + fruits);
        // Output: After removals: [Apple, Banana]

        // Get reversed view
        SequencedCollection<String> reversed = fruits.reversed();
        System.out.println("Reversed view: " + reversed);
        // Output: Reversed view: [Banana, Apple]
        System.out.println("Original remains unchanged: " + fruits);
        // Output: Original remains unchanged: [Apple, Banana]

        // Add to the reversed view (adds to beginning of original)
        reversed.add("Peach");
        System.out.println("After adding to reversed view: " + fruits);
        // Output: After adding to reversed view: [Peach, Apple, Banana]
    }
}