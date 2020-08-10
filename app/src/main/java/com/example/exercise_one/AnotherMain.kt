package com.example.exercise_one
//<!--        android:theme="@style/AppTheme">-->
//android:onClick="handlePencet"/>
fun main(){
    val formations = mutableListOf<Coordinate>()
    print("Input jumlah antenna :")
    var sumAntenna = readLine()!!.toInt()
    for (i in 1..sumAntenna){
        println("Kordinat antenna ke-$i:")
        print("sumbuh x =")
        val x = readLine()!!.toInt()
        print("sumbuh y =")
        val y = readLine()!!.toInt()
        println("-------- > ($x,$y)")
        formations.add(Coordinate(x, y))
    }

    var hasilArea = setOf<Coordinate>()
    for (i in 0 until formations.size ) {
        for (j in i+1 until formations.size) {
//            println(formations[i].coordinateArea())
            hasilArea += formations[i].coordinateArea().intersect(formations[j].coordinateArea())
        }
    }
    println(hasilArea)

}

data class Coordinate(var x:Int, var y: Int){

    override fun toString(): String {
        return "($x, $y)"
    }

    fun coordinateArea(): MutableSet<Coordinate> {
        var getArea = mutableSetOf<Coordinate>()
        for (i in x-1..x+1){
            for(j in y-1..y+1){
                getArea.add(Coordinate(i, j))
            }
        }
        return getArea
    }


}


//fun main(){
//    println("Start")
//
//    for(i in 1..20){
//        Thread.sleep(1000)
//        println(i)
//    }
//
//    println("Stop")
//}

//fun main(){
//    var AntennaList= mutableListOf<Antenna>()
//    print("Input Jumlah Antenna: ")
//    val antennas = readLine()!!
//    for (i in 1..antennas.toInt()) {
//        print("Koordinat antenna ke $i: ")
//        val inAtennaPosition = readLine()!!
//        val antenna = createAntenna(inAtennaPosition.split(",").toTypedArray())
//        AntennaList.add(antenna)
//    }
//    println(AntennaList)
////    val intersectArea = mulitipleCoverArea(AntennaList)
////    println(intersectArea)
//
//
////    for (i in coordinate.first().toInt()-1..coordinate.last().toInt()){
////        for (j in coordinate.first().toInt()..coordinate.last().toInt()+1){
////            coorData = coorData.plusElement(arrayOf(i.toString(),j.toString()))
////        }
////    }
//
//}
//
//class Antenna (val x : Int , val y : Int){
//
//}
//
//fun createAntenna(AntennaPosition: Array<String>):Antenna{
//    return Antenna(AntennaPosition[0].toInt(),AntennaPosition[1].toInt())
//}