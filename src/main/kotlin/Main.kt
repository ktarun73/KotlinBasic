
fun main() {
    // Variables
//    print("Hello World")
//    val name="Tarun"
//    print("My name is $name")
//    println(name[name.length-1])
//    var myStr: String = "Android Masterclass"
//    val myFloat: Float = 13.3F
//    var myDouble: Double = 3.14159265358979
//    var myByte: Byte= 25
//    var myInt: Int = 2020
//    var myLong : Long = 18881234567
//    var myBoolean : Boolean = true
//    var myChar : Char = 'a'

    // Arithmetic Operators(+ - * / %)
//    val a=10
//    val b=3
//    val res=a+b
//    print("$res")
//    val mod=a%b
//    print("$mod")

    //Comparison Operator (== != < > <= <=)

//    val a=10
//    val b=20
//
//    val isEqual=a==b
//    println("$isEqual")
//    val isNotEqual = a!=b
//    println("$isNotEqual")
//    println( "isGreater : ${a>b}")
//    println("isSmaller : ${a<b}")

    // Increment / Decrement Operator (++ --)

//    var num=10
//    println("${num++}")
//    println("${++num}")
//    println("${num--}")
//    println("${--num}")

    // IF / Else

//    var age=30
//    if (age>=18){
//        println("You may drive now")
//    }
//    else if (age>=23) {
//        println("You may Drink now")
//    }
//    else{
//        println("You are too young")
//    }

    //When
//    var season=3
//    when(season){
//        1 -> println("Spring")
//        2 -> println("Summer")
//        3 -> {
//            println("Fall")
//            println("Autumn")
//        }
//        4 -> println("Winter")
//        else -> println("Invalid season")
//    }

//    var x: Any ="10"
//    when(x){
//        is Int -> println("Integer")
//        is Double -> println("Double")
//        is String -> println("String")
//        else -> println("None of the above")
//    }

//    var x: Any ="10"
//    var res= when(x){
//        is Int -> "Integer"
//        is Double -> "Double"
//        is String -> "String"
//        else -> "None of the above"
//    }
//    println(res)

    //Loops
    // while / do-while

//    var a=1
//    while (a<=10){
//        println(a)
//        a++
//    }
//    var z=10
//    do {
//        println(z)
//        z--
//    }while (z>=1)
    //For

//    for (i in 1..10){
//        println(i)
//    }
//    println()
//    println()
//    println()
//    println()
//    for(i in 1 until 10){
//        println(i)
//    }
//    println()
//    println()
//    println()
//    println()
//
//    for (i in 10 downTo 1){
//        println(i)
//    }
//
//    println()
//    println()
//    println()
//    println()
//
//    for(i in 1 until 10 step 2){
//        println(i)
//    }
//    println()
//    println()
//    println()
//    println()
//
//    for(i in 10 downTo 1 step 2){
//        println(i)
//    }


//    for(i in 0 until 10000){
//        if(i==9001){
//            println("Its over 9000")
//        }
//    }
//
//    var humidityLevel = 80
//    var humidity = "humid"
//    while (humidityLevel>60){
//        humidityLevel-=5
//        if(humidityLevel==60){
//            humidity="comfy"
//        }
//    }
//    println(humidity)

    // Nullables

//    var name : String = "Hello"
//    name=null
//    var nullableName: String? = "Hello"
//    nullableName=null

//    var len=name.length
//    var len2=nullableName?.length
//    nullableName?.let { println(it.length) }
//    nullableName?.let { println(it.length) }

//    print(nullableName?.length)

//    var a : String?=null
//    val len=a.length

//    var age: Int?=null
//    val str = age?:"Invalid"
//    println("Age is $str")

    var nullableName : String? = "Tarun"
//    nullableName=null
//    println(nullableName?.length)

    var name = nullableName?: "Guest"
    println("name is $name")


}
