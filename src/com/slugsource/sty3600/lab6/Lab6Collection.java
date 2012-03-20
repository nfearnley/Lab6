package com.slugsource.sty3600.lab6;

import java.util.Iterator;

/**
 * 2. Implement a custom collection class that is generic and uses a linked list
 *
 * @author Scott Beaudry
 */
public class Lab6Collection<T> implements Iterable<T>, ListInterface<T>
{

    private Node head;
    private int listCount;
    
    @Override
    public Iterator<T> iterator()
    {
        head = new Node(null);
        listCount = 0;
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean add(T newEntry)
    {
        try
        {
            Node temp = new Node<T>(newEntry);
            Node current = head;
            // starting at the head node, crawl to the end of the list
            while(current.getNext() != null)
            {
                current = current.getNext();
            }
            // the last node's "next" reference set to our new node
            current.setNext(temp);
            listCount++;// increment the number of elements variable
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
    }

    @Override
    public boolean add(int newPosition, T newEntry)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public T remove(int givenPosition)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void clear()
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean replace(int givenPosition, T newEntry)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public T getEntry(int givenPosition)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean contains(T anEntry)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getLength()
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isEmpty()
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isFull()
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void display()
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void swap(int positionOne, int positionTwo)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean equals(ListInterface<T> otherList)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
