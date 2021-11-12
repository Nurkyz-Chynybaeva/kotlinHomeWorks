
fun main(){
    println("enter the first number")
    val a1 = readLine().parseToInt()

    println("Введите знак операции: ")
    val symbols = readLine()

    println("Введите второе число: ")
    val a2 = readLine().parseToInt()


    when(symbols) {
        "+" -> print(a1 + a2)
        "-" -> print(a1 - a2)
        "*" -> print(a1 * a2)
        "/" -> println(div(a1 , a2))
        else -> {
            println("strictly enter sign!!")
        }
    }
}


private fun div(a1: Int, a2: Int): String {
    return try {
        "res= ${a1 / a2}"
    } catch (e: ArithmeticException) {
        "На 0 делить нельзя!!!"
    }
}

private fun String?.parseToInt(): Int {
    if (this == "") return 0
    if (this == null) return 0

    try {
        return this.toInt()
    } catch (e: NumberFormatException) {
        return 0
        println("введите только number")
    }
}
