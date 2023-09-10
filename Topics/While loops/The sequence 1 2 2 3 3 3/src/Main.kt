fun main() {
    var count = 0
    val sizeList = readln().toInt()
    if (sizeList > count) {
        for (i in 1..sizeList) {
            count++
            repeat(i) {
                print(i)
            }
            if (count == sizeList) {
                break
            }
        }
    } else {
        print(count)
    }
}