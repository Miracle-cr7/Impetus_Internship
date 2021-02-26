package Threads;

class Thread
{
    private static int generateId = 0;
    public final int uniqueId;
    Thread()
    {
        generateId++;
        uniqueId = generateId;
    }
    
    public boolean compare(Thread t)
    {
        if(this.uniqueId == t.uniqueId)
        {
            return true;
        }
        return false;
    }
}