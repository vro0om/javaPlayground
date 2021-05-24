package com.objs

interface Signatory {
    fun sign()
}

open class Person(val name: String, var age:Int): Signatory{
    init {
        if( name =="Clark" && age<40) throw ExceptionInInitializerError("Invalid age") // == with strings compares the actual value of the strings
    }
    override fun sign() = println("$name, $age can Sign documents")
}

class Supe(name:String,age:Int): Person(name,age)


fun main(args:Array<String>)
{
    val p =Person("Clark",30)
    p.sign()

    //p.name = "Superman"  This throws error as val cannot change
}