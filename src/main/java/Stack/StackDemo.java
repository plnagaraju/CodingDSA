package src.main.java.Stack;

import java.util.Stack;

public class StackDemo {

    public static void main(String[]args){

        Stack obj = new Stack();
        obj.push("Lakshmi");
        obj.push("Nagaraju");
        obj.push(206);

        System.out.println(" Print Stack : "+obj);
        System.out.println(" Top element of stack : "+obj.peek());
        System.out.println(" Remove top element of stack : "+obj.pop());
        System.out.println(" is empty() : "+obj.isEmpty());
        System.out.println(" Print Stack 2 : "+obj);
        System.out.println(" Print Stack 3 : "+obj.push("Java"));


    }

}

       /*
        Output :
        Print Stack : [Lakshmi, Nagaraju, 206]
        Top element of stack : 206
        Remove top element of stack : 206
        is empty() : false
        Print Stack 2 : [Lakshmi, Nagaraju]
        Print Stack 3 : Java
        */