package com.slugsource.sty3600.lab6;

import java.util.Iterator;

/**
 * 2. Implement a custom collection class that is generic and uses a linked list
 *
 * @author Scott Beaudry
 */
public class Lab6Collection<T> implements Iterable<T>, ListInterface<T>
{

    @Override
    public Iterator<T> iterator()
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean add(T newEntry)
    {
        throw new UnsupportedOperationException("Not supported yet.");
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
