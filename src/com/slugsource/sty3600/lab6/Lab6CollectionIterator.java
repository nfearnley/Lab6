package com.slugsource.sty3600.lab6;

import java.util.Iterator;

/**
 * 3. Implement a customer iterator class for your collection
 *
 * @author Nathan Fearnley
 */
public class Lab6CollectionIterator<T> implements Iterator<T>
{
    private int position = 0;
    private Lab6Collection<T> coll;
    
    public Lab6CollectionIterator(Lab6Collection coll)
    {
        this.coll = coll;
    }
    
    @Override
    public boolean hasNext()
    {
        return position < coll.getLength();
    }

    @Override
    public T next()
    {
        // Return item at position, then increment position
        return coll.getEntry(position++);
    }

    @Override
    public void remove()
    {
        throw new UnsupportedOperationException("This iterator does not support remove.");
    }
}
