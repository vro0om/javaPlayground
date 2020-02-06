package singleton;
/*
 * Copyright (c) Siemens AG 2020 ALL RIGHTS RESERVED.
 *
 * SPPA-T3000  
 * 
 */


/**
 * pvt constructor 
 * one static public getter
 * instance should be private static
 * synchronization
 * implement ReadResolve()
 * implement clone()
 * overcome reflection
 * 
 * @author z0031bha
 *
 */
public class EagerSingelton
{
    private static final EagerSingelton learnSingeltonEager = new EagerSingelton();
    
    private EagerSingelton(){
    }
    
    public static EagerSingelton eagarInitialization()
    {
        return learnSingeltonEager;
    }
    
}

/*
 * Copyright (c) Siemens AG 2020 ALL RIGHTS RESERVED
 *
 * SPPA-T3000
 */
