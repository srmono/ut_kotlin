package com.ut

fun main() {

    // When expression
    val dayOfWeek = 3;

    when(dayOfWeek){
        1 -> println("Sunday")
        2 -> println("Monday")
        3 -> println("Tue")
        4 -> println("Wed")
        5 -> println("Thu")
        6 -> println("Fri")
        7 -> println("Sat")
        else -> println("Invalid day")
    }

// conditional expression:

    val x = 10;

    val result = if(x > 0) "Pos" else "Neg"

// Smart cast

val value: Any = "Venkat"

if(value is String){
    println(value.length)
}    else{
    println("Not a string")
}

val score = 75

    when (score){
        in 90..100 -> println("A")
        in 80 until 90 -> println("B")
        in 70 until 80 -> println("C")
        else -> println("D")
    }


//    val name: String? = null;
//
//    val result = if(name != null){
//        "Length of name : ${name.length}"
//    } else {
//        "Name is null"
//    }
//
//    println(result)


//    var count = 6;
//
//    if( count < 5){
//        println("Count is less than 5 ")
//    } else if( count < 10){
//        println("Count is less than 10 ")
//    } else{
//        println("Count is less than 5 ")
//    }
//
    //switch case
}