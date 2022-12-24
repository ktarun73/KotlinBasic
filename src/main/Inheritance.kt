open class Car(val name: String , val brand: String){

    open var range: Double=0.0
    fun extendRange(amount: Double){
        if(amount>0){
            range+=amount
        }
    }
    open fun drive(distance: Double){
        println("$brand $name Drove for $distance KM")
    }
}

class ElectricCar(name: String , brand: String , batteryLife: Double)
    : Car(name,brand){

    override var range=10.0
    override fun drive(distance: Double) {
        println("Drove for $distance KM on electricity")
    }
    fun drive(){
        println("Drove for $range KM on electricity")
    }


}

fun main() {
    var myCar=Car("A3","Audi")
    var myECar=ElectricCar("S-Model","Tesla",85.0)
    myCar.drive(200.0)
    myECar.drive(200.0)

}