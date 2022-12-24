interface Drivable {
    val maxSpeed: Double
    fun drive(): String
    fun brake(){
        println("The drivable is breaking")
    }
}

open class Car(override val maxSpeed:Double, val name: String, val brand: String)
    : Drivable{

    open var range: Double=0.0
    fun extendRange(amount: Double){
        if(amount>0){
            range+=amount
        }
    }

    override fun drive(): String {
        TODO("Not yet implemented")
    }
    open fun drive(distance: Double){
        println("$brand $name Drove for $distance KM")
    }

    override fun brake() {
        super.brake()
        println("Normal car")
    }
}

class ElectricCar(override val maxSpeed: Double, name: String, brand: String) :
    Car(maxSpeed,name,brand){

        

}
