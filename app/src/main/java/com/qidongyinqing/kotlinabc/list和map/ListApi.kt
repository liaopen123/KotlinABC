package list和map

import java.util.*

fun main() {

    listDemo()
    mapDemo()
}



fun listDemo() {
    var number = 1..100 step 2
    for (num in number ){

        print("\n$num")
    }
    val reversed = number.reversed()

    number.count()

    val list = listOf<String>("1", "2", "3") //创建list
    for ((index, item) in list.withIndex()){

    }
}


fun mapDemo() {
    var map = TreeMap<String,String>()
    map["好"] = "good"

    print(map["好"])
}
