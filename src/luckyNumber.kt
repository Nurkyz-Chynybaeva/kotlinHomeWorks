fun main() {
    println("Enter the number a four digit number:")
    val enterNum: Int = readLine()!!.toInt()

    val value1 = enterNum / 1000 % 10
    val value2 = enterNum / 100 % 10
    val value3 = enterNum / 10 % 10
    val value4 = enterNum % 10

    val res = value1 + value2 == value3 + value4

    if (res) {
        println("Lucky number!")
    } else {
        println("Unlucky number")
    }
    println(res)
}