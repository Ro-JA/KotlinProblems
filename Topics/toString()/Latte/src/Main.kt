class Latte(val milk: String, cost: Int, volume: Int) : Coffee(cost, volume) {
    override fun toString(): String {
        return "Latte ${super.toString()} $milk"
    }
}