package com.ut

fun main() {

//    //for loop
//    for(i in 1..5){
//        println("value of i : $i")
//    }
//
//    //
//    var skills = listOf("Kotlin", "java")
//
//    for ( skill in skills){
//        println("skill: $skill")
//    }
//
//    //while loop
//    var count = 0;
//    while(count < 5){
//        println("count value is: $count")
//        count++
//    }
//
//    var x = 5;
//    do{
//        println("value is: $x")
//        x--
//    } while (x > 0)

    //break and continue
    for( i in 1..10){
        if( i%2 == 0) {
            continue
        }
        println("Odd value : $i")
    }

    for( i in 1..10){
        if( i == 5) {
            break
        }
        println("value : $i")
    }

    //looping through the maps
    var ages = mapOf("venkat" to 25, "kubra" to 22);

    for ((name, age) in ages){
        println("$name is $age years old")
    }


}