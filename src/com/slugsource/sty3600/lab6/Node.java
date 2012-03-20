/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slugsource.sty3600.lab6;

/**
 *
 * @author c254395
 */
public class Node<T>
{

    // reference to the next node in the chain,
    // or null if there isn't one.
    Node next;
    // data carried by this node.
    // could be of any type you need.
    T payload;

    // Node constructor
    public Node(T obj)
    {
        next = null;
        payload = obj;
    }

    // another Node constructor if we want to
    // specify the node to point to.
    public Node(T obj, Node nextNode)
    {
        next = nextNode;
        payload = obj;
    }

    // these methods should be self-explanatory
    public T getData()
    {
        return payload;
    }

    public void setData(T obj)
    {
        payload = obj;
    }

    public Node getNext()
    {
        return next;
    }

    public void setNext(Node nextNode)
    {
        next = nextNode;
    }
}
