
fun main(){
    println("Введите число: ")
    val num = readLine()!!.toInt()

    val x0 = num / 1000 % 10
    val x1 = num / 100 % 10
    val x2 = num / 10 % 10
    val x3 = num % 10

    val res = x0+x1 == x2+x3

    if (r != null){
         return "error"
        }
    println(r)



}