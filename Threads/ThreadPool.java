package Threads;

import java.util.*;

class threadComparator implements Comparator<Thread>
{
    public int compare(Thread t1, Thread t2)
    {
        if(t1.uniqueId < t2.uniqueId)
            return -1;
        return 1;
    }
}

public class ThreadPool
{

    private static PriorityQueue<Thread> inUse;
    private static PriorityQueue<Thread> notInUse;
    private static boolean isFirst = true;

    private ThreadPool()
    {

    }

    public static void initialize(int n)
    {
        if(isFirst)
        {
            inUse = new PriorityQueue<Thread>(new threadComparator());
            notInUse = new PriorityQueue<Thread>(n, new threadComparator());
            if(n < 100)
                n = 100;
            for(int i = 0; i < n; i++)
            {
                notInUse.add(new Thread());
            }
            isFirst = false;
        }
    }

    private static void grow()
    {
        for(int i = 0; i < 100; i++)
        {
            notInUse.add(new Thread());
        }
    }

    private static void shrink()
    {
        for(int i = 0; i < 50; i++)
        {
            notInUse.poll();
        }
    }

    public static Thread getReference()
    {
        if(notInUse.size() < inUse.size() - 10)
        {
            grow();
        }
        Thread threadToReturn = null;
        if(!isFirst)
        {
            threadToReturn = notInUse.poll();
            inUse.add(threadToReturn);   
        }
        return threadToReturn;
    }

    public static void releaseReference(Thread t)
    {
        
        if(t != null)
        {
            if(inUse.size() < notInUse.size() - 7)
            {
                shrink();
            }
            
            inUse.remove(t);
            notInUse.add(t);   
        }
    }
    
    public static void deinitialize()
    {
        notInUse.clear();
        inUse.clear();
        isFirst = true;
    }
}