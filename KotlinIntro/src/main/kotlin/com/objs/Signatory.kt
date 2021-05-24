package com.objs

interface Signatory {
    fun sign()
}


open class Person(val name: String, var age:Int, var isMarried : Boolean = false): Signatory  //  isMarried is optional parameter with default value false
{
    var sideKick: String =""
    var isMale : Boolean  = true
    init {
        if( name =="Clark" && age<40) throw ExceptionInInitializerError("Invalid age") // == with strings compares the actual value of the strings
    }
    constructor(name:String, age:Int, isMale: Boolean,isMarried: Boolean ) :this(name,age,isMarried)
    {
        this.isMale= isMale
    }
    override fun sign() = println("$name, $age can Sign documents is married $isMarried and is female $isMale")

}

class Supe(name:String,age:Int, isMale: Boolean,isMarried: Boolean): Person(name,age,isMale,isMarried)
{
    companion object{
        @JvmStatic
        fun main(args:Array<String>)
        {
            val notWW = Supe("SuperGirl", 90,false,false)
            notWW.sign()
            notWW.sideKick = "MartianMan"
            System.out.println(notWW.sideKick)
        }
    }
}

data class User(val name:String, val id : Int)

fun main(args:Array<String>)
{
    val p3 =Supe("Wonder Woman",4543,true, false)
//    val p2 =Person("Louis",50, true)
//    val p =Person("Clark",30)
    p3.sign()

    val u1 = User("Abhinit", 1)
    System.out.println(u1)
    System.out.println(u1.name)


    val cloneu1 = u1.copy(id =4)
    System.out.println("$cloneu1")

    val u2 = User("Ashish", 2)
    val (name,id ) = u2;
    System.out.println("$name has id $id")
    val cu2 =  u2.copy()
    System.out.println("u2 hashcode ${u2.hashCode()}  \n cu2 hashcode ${cu2.hashCode()} \n comapre u2 and cu2 using equals ${u2.equals(cu2)}")
    //p.name = "Superman"  This throws error as val cannot change
}