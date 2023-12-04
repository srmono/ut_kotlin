package com.ut

//var num:Int = 3;
//val num:Int = 3; read only, val can't be reassigned

var num = 3;
var longnum = num.toLong();
var isTrue: Boolean = true
var name: String = "Venkat"

val y: Any = 42.0;

val integerVal: Int? = y as? Int

fun main(){
    println(integerVal)
    num =  4;
    println(num)

}