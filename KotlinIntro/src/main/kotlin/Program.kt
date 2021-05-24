import `try`.Providers

fun main (args:Array<String>){
    useObject()
    useStaticCompanion()
    listproviders()
}

fun useStaticCompanion() {
   val allProviders =  Providers.getProviders()
    val iterator = allProviders.iterator()
    while (iterator.hasNext()) {
        val provider = iterator.next()
        println(provider.name)
        provider.forEach { key, value -> println("\t$key   :  \t $value") }
    }
}

private fun useObject() {
    val providers = Providers()

    val allProviders = providers.getProviders()
    val iterator = allProviders.iterator()
    while (iterator.hasNext()) {
        val provider = iterator.next()
        println(provider.name)
        provider.forEach { key, value -> println("\t$key   :  \t $value") }
    }
}

private fun listproviders() {
    val providers = getProviders()
    val iterator = providers.iterator()
    while (iterator.hasNext()) {
        val provider = iterator.next()
        println(provider.name)
        provider.forEach { key, value -> println("\t$key   :  \t $value") }
    }
}