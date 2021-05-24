package `try`

fun main(args: Array<String>) {
    val providers = Providers()
    val allProviders = providers.getAllProviders()
//    allProviders.forEach { detial -> println("-- ${detial.providerName }\t ${detial.name}")} }
//    allProviders.forEach { println("-- ${it.providerName }\t ${it.name}")} }// kotlin provides a default pointer it so we dont need to provide detail

//    allProviders.forEach { println(it)} // prints the to string of ProviderDetails
    allProviders.forEach ( ::println ) // same as above   , not as clean as it does not make it visible what class is being used
}



//    getAllProviders{
//        key,value -> println("------------- \t$key   :  $value")
//    }


fun getAllProviders(fn:(String,String) -> Unit) {
    val allProviders = Providers.getProviders()
    val iterator = allProviders.iterator()
    while (iterator.hasNext()) {
        val provider = iterator.next()
        println(provider.name)
        provider.forEach { key, value -> fn(key.toString(), value.toString()) }
    }
}
