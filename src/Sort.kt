fun bubbleSort(arr:IntArray):IntArray{
    var swap = true
    while(swap){
        swap = false
        for(i in 0 .. arr.size-1){
            if(arr[i] > arr[i+1]){
                val temp = arr[i]
                arr[i] = arr[i+1]
                arr[i + 1] = temp

                swap = true
            }
        }
    }
    return arr
}

fun main(args: Array<String>) {
    val l = println()!!
    val list = println()!!.toString()
    for (k in list) println("$k ")
}



//fun sort(sampleArray:IntArray){
//    var n=sampleArray.size
//    var temp:Int
//    for(i in 0..n-1){
//        var indexOfMin = i
//        for(j in n-1 downTo  i){
//            if(sampleArray[j]< sampleArray[indexOfMin])
//                indexOfMin=j
//        }
//        if(i!=indexOfMin){
//            temp = sampleArray[i]
//            sampleArray[i]= sampleArray[indexOfMin]
//            sampleArray[indexOfMin]=temp
//        }
//    }
//}
//
//fun main(arg: Array<String>) {
//    println("Before Sort")
//    var A = intArrayOf(1, 7, 3, 19, 9, 4, 8, 2)
//    for (i in A) print(i)
//
//    sort(A)
//
//    println("Sorted array is : ")
//        for (i in A) print(i)
//}













