package com.slugsource.sty3600.lab6;

import java.util.Iterator;

/**
 * 2. Implement a custom collection class that is generic and uses a linked list
 *
 * @author Scott Beaudry
 */
public class Lab6Collection<T> implements Iterable<T>, ListInterface<T>
{

    private Node<T> head;
    private int listCount;

    @Override
    public Iterator<T> iterator()
    {
        return new Lab6CollectionIterator<>(this);
    }

    @Override
    public boolean add(T newEntry)
    {
        try
        {
            Node<T> temp = new Node<>(newEntry);
            Node<T> current = head;
            // starting at the head node, crawl to the end of the list
            while (current.getNext() != null)
            {
                current = current.getNext();
            }
            // the last node's "next" reference set to our new node
            current.setNext(temp);
            listCount++;// increment the number of elements variable
            return true;
        } catch (Exception e)
        {
            return false;
        }
    }

    @Override
    public boolean add(int newPosition, T newEntry)
    {
        try
        {
            Node<T> temp = new Node<>(newEntry);
            Node<T> current = head;
            // crawl to the requested index or the last element in the list,
            // whichever comes first
            for (int i = 1; i < newPosition && current.getNext() != null; i++)
            {
                current = current.getNext();
            }
            // set the new node's next-node reference to this node's next-node reference
            temp.setNext(current.getNext());
            // now set this node's next-node reference to the new node
            current.setNext(temp);
            listCount++;// increment the number of elements variable
            return true;
        } catch (Exception e)
        {
            return false;
        }
    }

    @Override
    public T remove(int givenPosition)
    {
        try
        {
            // if the index is out of range, exit
            if (givenPosition < 1)
            {
                return null;
            }
            if (givenPosition > listCount)
            {
                return null;
            }
            Node<T> current = head;
            for (int i = 1; i < givenPosition; i++)
            {
                if (current.getNext() == null)
                {
                    return null;
                }
                current = current.getNext();
            }
            T toBeRemoved = current.payload;
            current.setNext(current.getNext().getNext());
            listCount--; // decrement the number of elements variable
            return toBeRemoved;
        } catch (Exception e)
        {
            return null;
        }
    }

    @Override
    public void clear()
    {
        head.next = null;
    }

    @Override
    public boolean replace(int givenPosition, T newEntry)
    {
        try
        {
            // index must be 1 or higher
            if (givenPosition < 1)
            {
                return false;
            }

            Node<T> current = head.getNext();
            for (int i = 1; i < givenPosition; i++)
            {
                if (current.getNext() == null)
                {
                    return false;
                }
                current = current.getNext();
            }
            current.payload = newEntry;
            return true;
        } catch (Exception e)
        {
            return false;
        }
    }

    @Override
    public T getEntry(int givenPosition)
    {
        // index must be 1 or higher
        if (givenPosition <= 0)
        {
            return null;
        }

        Node<T> current = head.getNext();
        for (int i = 1; i < givenPosition; i++)
        {
            if (current.getNext() == null)
            {
                return null;
            }
            current = current.getNext();
        }
        return current.getData();
    }

    @Override
    public boolean contains(T anEntry)
    {
        // index must be 1 or higher
        if (anEntry == null)
        {
            return false;
        }

        Node<T> current = head.getNext();
        for (int i = 1; i < listCount; i++)
        {
            if (current.getData() == anEntry)
            {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public int getLength()
    {
        return listCount;
    }

    @Override
    public boolean isEmpty()
    {
        if (head.next == null)
        {
            return true;
        } else
        {
            return true;
        }
    }

    @Override
    public boolean isFull()
    {
        return false;
    }

    @Override
    public void display()
    {
        Node<T> current = head.getNext();
        while (current != null)
        {
            System.out.println(current.getData().toString());
            current = current.getNext();
        }
    }

    @Override
    public void swap(int positionOne, int positionTwo)
    {
        try
        {
            Node<T> tempPositionOne;
            Node<T> tempPositionTwo;
            T tempObject;

            // index must be 1 or higher
            if (positionOne < 1 || positionTwo < 1)
            {
                //do nothing
            }

            Node<T> current = head.getNext();
            for (int i = 1; i < positionOne; i++)
            {
                if (current.getNext() == null)
                {
                    //do nothing
                }
                current = current.getNext();
            }
            tempPositionOne = current;
            tempObject = current.getData();

            //reset current
            current = head.getNext();
            for (int i = 1; i < positionTwo; i++)
            {
                if (current.getNext() == null)
                {
                    //do nothing
                }
                current = current.getNext();
            }
            tempPositionTwo = current;

            tempPositionOne.setData(tempPositionTwo.getData());
            tempPositionTwo.setData(tempObject);
        } catch (Exception e)
        {
            //do nothing
        }
    }

    @Override
    public boolean equals(ListInterface<T> otherList)
    {
        if (this.getLength() != otherList.getLength())
        {
            return false;
        }
        try
        {
            for (int i = 1; i < this.getLength(); i++)
            {
                if (this.getEntry(i) == null && otherList.getEntry(i) != null)
                {
                    return false;
                }
                if (!this.getEntry(i).equals(otherList.getEntry(i)))
                {
                    return false;
                }
            }
            return true;
        } catch (Exception e)
        {
            return false;
        }
    }
}
