package singleton;
/*
 * Copyright (c) Siemens AG 2020 ALL RIGHTS RESERVED.
 *
 * SPPA-T3000  
 * 
 */

public class ThreadSafeSingelton
{
    private ThreadSafeSingelton()
    {
        // TODO Auto-generated constructor stub
    }
    
    private static ThreadSafeSingelton learnSingeltonThreadSafe;
    
    synchronized public static ThreadSafeSingelton initiThreadSafe()
    {
        if (learnSingeltonThreadSafe == null)
        {
            learnSingeltonThreadSafe = new ThreadSafeSingelton();
        }
        return learnSingeltonThreadSafe;
    }
}

/*
 * Copyright (c) Siemens AG 2020 ALL RIGHTS RESERVED
 *
 * SPPA-T3000
 */
