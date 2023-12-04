package com.ut

fun main(args: Array<String>){
    for(a in args){
        println(a)
    }

    var value:Int = sum(b=23, a=45)
    println(value)

    doNothing();

    val name: String? = null
    println(name?.length)
}

fun sum(a: Int, b: Int) = a + b;

fun doNothing(){
    println("Called for nothing");
}

//fun sum(a: Int, b: Int): Int{
//    println(a)
//    return a + b
//}