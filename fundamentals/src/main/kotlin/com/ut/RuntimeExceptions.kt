package com.ut

import java.lang.ArithmeticException
import java.lang.IllegalArgumentException

fun main() {
    val nums: Array<Int> = arrayOf(5);

    //println(nums[0])
//   try {
//       var num:Int = nums[1]
//   } catch (t: Throwable){
//       println(t.message)
//   }

//    var ans = try {
//       var x = nums[1]
//    } catch (t: Throwable){
//        println(t.message)
//        0
//    } finally {
//        println("Inside finally")
//    }
//
//    println("The answer is $ans")


    // Throw
    divide(5,0)

    try {
        var res = divide(10,0)
        println("Result: $res")
    }catch (e: IllegalArgumentException){
        println("Error: ${e.message}")
    } catch (e: ArithmeticException) {
        println("Arithmetic Exception: ${e.message}")
    }

    //custom exception

}

fun divide(a: Int, b: Int): Int{
//    if( b == 0){
//        throw IllegalArgumentException("Cant divide by Zero")
//    }
    return a/b
}