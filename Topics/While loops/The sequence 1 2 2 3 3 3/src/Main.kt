fun main() {
    var repeatNumb = 0
    var count = 0
    val sizeList = readln().toInt()
    if (sizeList > repeatNumb) {
        while (count > sizeList) {
            for (i in 1..sizeList) {
                count++
                repeat(i) {
                    print(i)
                }
            }
        }
    } else {
        print(repeatNumb)
    }
}