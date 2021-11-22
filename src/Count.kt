fun main(args: Array<String>) {
    var count = 0
    println("enter the number:")
    var num = readLine()!!.toInt()
    while (num != 0) {
        num /= 10
        ++count
    }
    println("Number of digits: $count")
}