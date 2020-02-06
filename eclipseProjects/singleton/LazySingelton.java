package singleton;
/*
 * Copyright (c) Siemens AG 2020 ALL RIGHTS RESERVED.
 *
 * SPPA-T3000  
 * 
 */

public class LazySingelton
{
    private LazySingelton()
    {
        // TODO Auto-generated constructor stub
    }
    
    private static LazySingelton learnSingeltonLazy;
        
    public static LazySingelton initiLazy()
    {
        if (learnSingeltonLazy == null)
        {
            learnSingeltonLazy = new LazySingelton();
        }
        return learnSingeltonLazy;
    }
}

/*
 * Copyright (c) Siemens AG 2020 ALL RIGHTS RESERVED
 *
 * SPPA-T3000
 */
