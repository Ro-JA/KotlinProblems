
data class Client(val name: String, val age: Int, val balance: Int) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Client

        if (name != other.name) return false
        if (age != other.age) return false

        return true
    }
}

fun main() {
    val name = readln()
    val age = readln().toInt()
    val balance = readln().toInt()
    val name2 = readln()
    val age2 = readln().toInt()
    val balance2 = readln().toInt()
    val client = Client(name, age, balance)
    val client2 = Client(name2, age2, balance2)
    println(client == client2)

}
