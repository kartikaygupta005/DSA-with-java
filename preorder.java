import java.util.*;
 public class main{
    static class Node{
        int val ; 
        Node left;
        Node right ;
        Node(int val ){
            this.val = val ;
        }
    }
    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.right = new Node(5);
        preOrder(root);
    }
    static void preOrder(Node root){
        if(root == null){
            return ; 
        }
        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
 }
