/*
 * Copyright (c) Siemens AG 2020 ALL RIGHTS RESERVED.
 *
 * SPPA-T3000  
 * 
 */

package singleton;

public enum EnumSingleton
{
    INSTANCE;
    
    private int val;

    public int getVal()
    {
        return val;
    }

    public void setVal(int val)
    {
        this.val = val;
    }
}


/*
 * Copyright (c) Siemens AG 2020 ALL RIGHTS RESERVED
 *
 * SPPA-T3000
 */
