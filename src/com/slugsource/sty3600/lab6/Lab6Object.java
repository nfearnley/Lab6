package com.slugsource.sty3600.lab6;

/**
 * 1. Implement a customer object (i.e. student) that implements the comparable
 * interface
 *
 * @author VivekGuru
 */
public class Lab6Object implements Comparable<Lab6Object>
{

    private int value;

    public void setValue(int value)
    {
        this.value = value;
    }

    public int getValue()
    {
        return value;
    }

    @Override
    public int compareTo(Lab6Object o)
    {
        if (o == null)
        {
            throw new NullPointerException();
        }

        int value1 = this.getValue();
        int value2 = o.getValue();

        if (value1 > value2)
        {
            return +1;
        } else if (value1 < value2)
        {
            return -1;
        } else
        {
            return 0;
        }
    }

    @Override
    public String toString()
    {
        return Integer.toString(value);
    }
}
