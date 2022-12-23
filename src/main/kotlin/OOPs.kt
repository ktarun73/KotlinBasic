//import java.lang.IllegalArgumentException

//fun main(){
//    val name=Person("Tarun","Kumar")
//    val na=Person()
//    val n=Person(lastName = "Chauhan")
//    println(name)
//}

//class Person constructor(firstName: String ="Na" , lastName: String="NA"){
//   init {
//       println("Initialized a new person object with "+
//       "First Name = $firstName and Last Name = $lastName")
//   }
//
//}

//class MobilePhone constructor(osName:String , brand: String , model: String){
//    init {
//        println("$brand $model"+
//        " Here the OS is $osName , Brand is $brand and model is $model")
//    }
//}
//
//fun main() {
//    val phone1=MobilePhone("Android","Samsung","S20 Ultra")
//    println(phone1)
//}

//class Person(firstName: String , lastName: String){
//    var firstname: String?=null
//    init {
//        this.firstname=firstname
//        println("First Name = $firstName and Last Name= $lastName ")
//
//    }
//    var age : Int? = null
//    var hobby="Play cricket"
//    fun stateHobby(){
//        println("$firstname\'s  hobby is $hobby")
//    }
//
//    constructor(firstName: String , lastName: String, age: Int):this(firstName,lastName){
//        this.age=age
//    }
//}
//
//fun main() {
//    var p1=Person("p1F","p1L")
//    p1.hobby="watch movies"
//    p1.stateHobby()
//}

//class Car{
//    var company="NA"
//    var model="NA"
//    constructor(company: String,model: String){
//        this.company=company
//        this.model=model
//    }
//
//}

//class Car{
//   var owner : String
//    val brand: String="BMW"
//        get() {
//            return field.uppercase()
//        }
//    var maxSpeed : Int = 250
//        get() = field
//        set(value) {
//            field=if (value>0) value else throw IllegalArgumentException("Invalid Speed")
//        }
//    var model : String = "M5"
//        private set
//    init {
//        owner="Tarun"
//    }
//
//
//}
//
//fun main() {
//    var car=Car()
//    car.maxSpeed=-1
//}

//class MobilePhone(osName: String, brand: String, model: String){
//    init {
//        println("The phone $model from $brand uses $osName as its Operating System")
//    }
//    var battery=10
//    fun chargeBattery(chargeLevel: Int){
//        if(chargeLevel<battery){
//            println("Already Charged above $chargeLevel")
//            return
//        }
//        var calc=0
//        while (battery<chargeLevel){
//            calc++
//            battery++
//        }
//        println("Battery is now charged by $calc%")
//        println("Now battery is $battery% charged")
//
//    }
//}
//
//fun main() {
//    var mobile=MobilePhone("Android","Samsung","S20 Ultra")
//    mobile.chargeBattery(30)
//}
