
data class User(var id: Long , var name: String)

fun main() {
    val user1=User(1,"Tarun")
    val name=user1.name
    println(name)
    val user2=User(2,"Tarun")
    println(user1.name == user2.name)
    println("$user1")
    val user=user1.copy(name="Vikram")
    println(user)

}