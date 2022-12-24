abstract class Mammal(private val name:String,private val origin:String,
                        private val weight: Double)
{
    abstract var maxSpeed: Double
    abstract fun run()
    abstract fun breadth()

    fun displayDetails(){
        println("Mammal(name='$name', origin='$origin', weight=$weight, maxSpeed=$maxSpeed)")
    }
}

class Human(name: String, origin: String, weight: Double, override var maxSpeed: Double)
    : Mammal(name, origin, weight)
{
    override fun run() {
        println("Runs on two legs")

    }

    override fun breadth() {
        println("Breadth through mouth or nose")
    }
}
 class Elephant(name: String,origin: String,weight: Double,override var maxSpeed: Double)
     : Mammal(name, origin, weight){

     override fun run() {
         println("Runs on four legs")

     }

     override fun breadth() {
         println("Breadth through trunk")
     }
     
 }

fun main() {
    val human=Human("Tarun","India",90.0,28.0)
    val elephant=Elephant("Rosy","Thailand",2400.0,15.0)
    human.displayDetails()
    elephant.displayDetails()


}