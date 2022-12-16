
fun main(){
//    println("Hello World")
//    val i:Byte =123
//    println(i.toString())
//
//    val myStr="Hello"
//    val firstCharInStr=myStr[0]
//    println(firstCharInStr)

//    val a=12
//    val b=10
//    val c=a+b
//    val d:Float= (a.toFloat()/b.toFloat())
//    println("$c\n$d")

//    val isEqual= 5==3
//    println("isEqual is $isEqual")

//    println("is 5 greater than 3 : ${5>3}")

//    val a=10
//    val b=12
//    if (a>b){
//        println("a is greater")
//    }else if (a<b){
//        println("b is greater")
//    }
//    else{
//        println("equal")
//    }

//    var name="Tarun"
//    if(name=="Tarun") {
//        println("Tarun")
//    }
//    else{
//        println("qwerty")
//    }

//     val season=3
//    when(season){
//        1 -> println("spring")
//        2 -> println("Summer")
//        3 -> {
//            println("Fall")
//            println("Autumn")
//        }
//        4 -> println("Winter")
//        else -> println("Invalid")
//    }

//    val month=3
//    when(month){
//        in 3..5 -> println("Spring")
//        in 6..8 -> println("Summer")
//        in 9..11 -> println("Fall")
//        12, 1, 2 -> println("Winter")
//        else -> println("Invalid")
//    }

//    val x : Any = 13.12
//    when(x){
//        is Int -> println("Integer")
//        is Double -> println("Double")
//        is Float -> println("Float")
//        else -> println("None of above")
//    }

//    var a=1
//    while (a<=10){
//        print("$a ")
//        a++
//    }
//    var a=1
//    do {
//        print("$a")
//        a++
//    }while(a<=10)


//    for(num in 1..10){
//        println("$num")
//    }

//    for(i in 10 downTo 1 step 2){
//        print("$i ")
//    }

//    for(i in 0..10000){
//        print("$i ")
//        if(i>9000){
//            print("Over 9000")
//            break
//        }
//    }
//
//
//    var humidity = "humid"
//    var humidityLevel = 80
//    while(humidity=="humid"){
//        humidityLevel-=5
//        println("humidity decreased")
//        if(humidityLevel<60){
//            println("Its comfy now")
//            humidity="comfy"
//        }
//    }
//
//
//    println(humidity)
//    myFunc()
//    myFunc()
//    println(add(10,20))
//    println(avg(10.0,20.0))
//    var name: String="Tarun"
//    name=null

//     var nullableName : String? ="Tarun"
//    nullableName=null
//    var len2=nullableName?.length
//    var str=nullableName?.toLowerCase()
//    println(nullableName?.toLowerCase())

//    if(nullableName!=null){
//        var len=nullableName.length
//    }else{
//        null
//    }
    var nullableName: String?="Tarun"
//    nullableName=null
//    val len=name?.length
//    name?.let {  println(it.length) }
    var name=nullableName ?: "Guest"
    println("name is $name")

    nullableName!!.toLowerCase()





}

//fun myFunc(){
//    print("called from myFunc")
//}

//fun add(a: Int,b:Int) : Int{
//    return a+b
//}

//fun avg(a: Double,b: Double): Double{
//    return (a+b)/2
//}
