import org.w3c.dom.css.Rect

fun main() {

    val point = Point(10,20)

    //Destructure data class
    val (x,y) = point

    println("$x, $y")

    // Destructure an Array
    val numbers = intArrayOf(1,2,3)

    val(a,b,c) = numbers

    println("a: $a, b: $b, c: $c")

//    //Destructuring maps
//    val person = mapOf("name" to "Venkat", "age" to 90)
//
//    val (name, age) = person


    //Destructuring function paramers

    val rect = Rectangle(30, 30)

    val area = calcArea(rect)

    println("Area: $area")

}

data class Rectangle(val width: Int, val height: Int)

fun calcArea(rectangle: Rectangle): Int{
    //Destructuring
    val (width, height) = rectangle;

    return width * height
}


data class Point(val x: Int, val y: Int)

