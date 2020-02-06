package singleton;
/*
 * Copyright (c) Siemens AG 2020 ALL RIGHTS RESERVED.
 *
 * SPPA-T3000  
 * 
 */

public class DoubleLockingSingelton
{
    private DoubleLockingSingelton(){}

    private static DoubleLockingSingelton learnSingeltonDoubleLock;
    
    public static DoubleLockingSingelton initiDoubleLock()
    {
        if (learnSingeltonDoubleLock == null)
        {
            synchronized (DoubleLockingSingelton.class)
            {
                if (learnSingeltonDoubleLock == null)
                {
                    learnSingeltonDoubleLock = new DoubleLockingSingelton();
                }
            }
        }
        return learnSingeltonDoubleLock;
    }
}

/*
 * Copyright (c) Siemens AG 2020 ALL RIGHTS RESERVED
 *
 * SPPA-T3000
 */
