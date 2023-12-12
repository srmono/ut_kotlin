fun main() {

//    val tgame = Tennis()
//
//    playGame(tgame)
//    doSomethingWithGame(tgame)

    //var p = Student()

    var p = PostGraduate()
    p.grade = 90
}

open class Persn

abstract class Student: Persn(){
    abstract var grade: Int
}

class UndeGraduate(override var grade: Int): Student()

class PostGraduate: Student(){
    override var grade:Int = 0
}

//fun playGame(game: Game){
//    game.play()
//}
//fun doSomethingWithGame(game: Game){
//    println("${game.name}")
//}
//
//abstract class Game(var name: String){
//    abstract fun play()
//}
//
//abstract class BallGame(name: String): Game(name){
//    override fun play(){
//        println("Playing Tenning")
//    }
//}
//
//class Tennis: BallGame("Tennis") {
//    override fun play(){
//        println("Playing Tenning")
//    }
//}

