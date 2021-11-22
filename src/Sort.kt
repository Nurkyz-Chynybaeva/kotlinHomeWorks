fun sort(sampleArray: IntArray) {
    val n = sampleArray.size
    var temp: Int
    for (i in 0 until n) {
        var indexOfMin = i
        for (j in n - 1 downTo i) {
            if (sampleArray[j] < sampleArray[indexOfMin])
                indexOfMin = j
        }
        if (i != indexOfMin) {
            temp = sampleArray[i]
            sampleArray[i] = sampleArray[indexOfMin]
            sampleArray[indexOfMin] = temp
        }
    }
}

fun main(arg: Array<String>) {
    println("Before Sort")
    val A = intArrayOf(1, 7, 3, 19, 9, 4, 8, 2)
    for (i in A) print(i)

    sort(A)

    println("Sorted array is : ")
    for (i in A) print(i)
}

