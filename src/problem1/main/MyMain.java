/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
// executable class

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree obj =new MyBinarySearchTree();
        obj.insert(10);
        obj.insert(200);
        obj.insert(30);
        obj.insert(50);
        obj.insert(1);

        obj.insert(4);

        obj.insert(88);
        System.out.println("post order traversl");
                obj.postorder(obj.root);

        System.out.println();
        System.out.println("left values traversl");

        obj.printleft(obj.root);
        System.out.println("nodes not having left nodes");

        System.out.println( obj.getCount());

    }
}
