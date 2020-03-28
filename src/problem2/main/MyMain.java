/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;
// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
import problem1.mybst.MyBinarySearchTree;

public class MyMain {
    public static void main(String args[]) {
        MyBinarySearchTree obj = new MyBinarySearchTree();
        obj.insert(5);
        obj.insert(2);
        obj.insert(7);
        obj.insert(6);
        obj.insert(4);
        obj.insert(9);
        obj.insert(11);
        //obj.insert(8);
        obj.preOrder(obj.root);
        System.out.println();
        obj.postOrder(obj.root);
        System.out.println("\nFirst statement is true");
        System.out.println("Second statement is false as we didn't get the middle point same.");
    }
}
