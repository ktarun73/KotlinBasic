import java.lang.ArithmeticException
import java.lang.Exception

fun main() {

//    val numbers : IntArray = intArrayOf(1,2,3,4)
//    val nums : IntArray

//    for (i in numbers){
//        println(i)
//    }
//    for((index,value) in numbers.withIndex()){
//        println("$index: $value")
//    }
//    val nums : IntArray = intArrayOf(1,2,3,4)
//    val len=nums.size
//    for(i in nums.indices ){
//        println("$i : ${nums[i]}")
//
//    }

//    val months= mutableListOf("Jan","Feb","Mar","Apr","May")
//    println(months)
//    months.add("Jun")
//    months.add("Jul")
//    months.add("Aug")
//    months.add("Sep")
//    months.add("Oct")
//    months.add("Nov")
//    months.add("Dec")
////    months.remove("Jan")
//    println(months)
//    val fruits= mutableSetOf("Orange","Orange","Apple","Mango")
//    println(fruits.size)
//    println(fruits)

//    val weekDays = mutableMapOf(1 to "Monday",2 to "Tuesday",3 to "Wednesday")
//    for(key in weekDays.keys){
//        println("$key is to ${weekDays[key]}")
//    }
//    println("${weekDays.size}")


//    var arrList= arrayListOf(1,2)
//    var ad = ArrayList<Int>()
//    ad.add(1)
//    ad.add(2)
//    ad.add(3)
//    ad.add(4)

//    val list= ArrayList<Double>(5)
//    list.add(1.0)
//    list.add(2.0)
//    list.add(3.0)
//    list.add(4.0)
//    list.add(5.0)
//    var avg = 0.0
//    for(i in list){
//        avg+=i
//    }
//    println("${avg/list.size}")

    //Lambda Expressions
//    val sum={a:Int , b:Int -> a+b}
//    print(sum(10,2))





//    val fruitsMap = mapOf("Fav" to Fruits("Mango",150) ,
//        "Fav2" to Fruits("Grape",90))
//    println(fruitsMap)


//    val fruits= arrayOf(Fruits("Apple",150),
//        Fruits("Strawberry",250))
//    println(fruits.contentToString())



//    var obj: Any?="Obj"
////    obj=null
//    var str: String?=obj as String?
//    println(str)

//    val location: Any="Kotlin"
//    val safeString: String?=location as? String
//    val safeInt:Int?=location as? Int
//    println(safeString)
//    println(safeInt)

//    var a=10
//    try {
//        var b=10/0
//        println(b)
//    }
//    catch (e: Exception){
//        println(e)
//
//    }
//    finally {
//      println("Completed")
//    }

//    println(getNum("121"))
//    println(getNum("12123e"))

    try {
        val a=IntArray(5)
        a[5]=10
    }
    catch (e: ArithmeticException){
        println("ArithmeticException")
    }
    catch (e: ArrayIndexOutOfBoundsException){
        println("ArrayIndexOutOfBoundsException")
    }
    catch (e: Exception){
        println("Exception")
    }





}

//fun getNum(str: String):Int{
//    return try {
//        Integer.parseInt(str)
//    } catch (e: Exception){
//        println(e)
//        0
//    }
//}

//data class Fruits(var name:String ,var price:Int){
//    override fun toString(): String {
//        return "$name : $price "
//    }
//}
