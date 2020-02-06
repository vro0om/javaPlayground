package singleton;
/*
 * Copyright (c) Siemens AG 2020 ALL RIGHTS RESERVED.
 *
 * SPPA-T3000  
 * 
 */

public class BillPughSingelton
{
    private BillPughSingelton()
    {
        
    }
    
    // BillPugh is eager and lazy also thread safe    
    public static BillPughSingelton initBillPugh()
    {
        
        return BillPughInit.instance;
    }
    
    private static class BillPughInit
    {
        private static final BillPughSingelton instance = new BillPughSingelton();
    }
    
}

/*
 * Copyright (c) Siemens AG 2020 ALL RIGHTS RESERVED
 *
 * SPPA-T3000
 */
