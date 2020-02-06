/*
 * Copyright (c) Siemens AG 2020 ALL RIGHTS RESERVED.
 *
 * SPPA-T3000  
 * 
 */

package singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonDestroyer
{
    public static void main(String[] args)
    {
        BillPughSingelton instanceOne = BillPughSingelton.initBillPugh();
        BillPughSingelton instanceTwo = null;
        Constructor[] bpConstructors = BillPughSingelton.class.getDeclaredConstructors();
        for (int i = 0; i < bpConstructors.length; i++)
        {
            bpConstructors[i].setAccessible(true);
            try
            {
                instanceTwo = (BillPughSingelton)bpConstructors[i].newInstance();
            }
            catch (InstantiationException e)
            {
                // TODO Auto-generated catch block
                
            }
            catch (IllegalAccessException e)
            {
                // TODO Auto-generated catch block
                
            }
            catch (IllegalArgumentException e)
            {
                // TODO Auto-generated catch block
                
            }
            catch (InvocationTargetException e)
            {
                // TODO Auto-generated catch block
                
            }
        }
        
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
        
        
    }
}


/*
 * Copyright (c) Siemens AG 2020 ALL RIGHTS RESERVED
 *
 * SPPA-T3000
 */
