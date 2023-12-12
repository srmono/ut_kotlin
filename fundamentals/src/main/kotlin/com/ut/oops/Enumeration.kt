//fun main() {
//
////    val err = ErrorCode.NetworkError
////
////    println(err.errorCode)
//
//
//    var season: Season = Season.Autumn
//
//    //season = season.next()
//
//
////    for(s:Season in Season.values()){
////        println("${s.name} has ordinal ${s.ordinal}")
////    }
//
////    var nextSeason = when(season){
////        Season.Spring -> Season.Summer
////        Season.Summer -> Season.Autumn
////        Season.Autumn -> Season.Winter
////        Season.Winter -> Season.Spring
////    }
////
////    println("next season : $nextSeason")
//}
//
//enum class Season() {
//    Spring {
//            override fun next(): Season{
//              return Summer
//          }
//           },
//    Summer{
//        fun next(): Season{
//            return Autumn
//        }
//    },
//    Autumn{
//        fun next(): Season{
//            return Winter
//        }
//    },
//    Winter{
//        fun next(): Season{
//            return Spring
//        }
//    }
//}
//
////enum class Season() {
////    Spring,
////    Summer,
////    Autumn,
////    Winter
////}
//
//
////enum class ErrorCode(val errorCode: Int){
////    None(0),
////    DbError(100),
////    NetworkError(500),
////    UnknownError(1)
////}
//
