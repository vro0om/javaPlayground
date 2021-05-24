package `try`

import java.security.Provider
import java.security.Security

data class ProviderDetails(val providerName:String, val name:String)

class Providers {
    fun getProviders(): List<Provider> {
        val providers = Security.getProviders()
        return providers.asList()
    }

    fun getAllProviders(): List<ProviderDetails>
    {
        val providers = Security.getProviders()
        val listOfProviders = mutableListOf<ProviderDetails>()

        providers.forEach {
            provider ->
            val providerDetail = provider.entries.map { entry -> ProviderDetails(provider.name,entry.key.toString()) }
//            listOfProviders.addAll(providerDetail)
            listOfProviders += providerDetail // same as above statement
        }
        return listOfProviders
    }

    companion object{
        fun getProviders(): List<Provider> {
            val providers = Security.getProviders()
            return providers.asList()
        }
    }
}

