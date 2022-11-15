fun main(args: Array<String>){
    val a: Int = 10
    val b: Double = 3.14
    val c: Byte = 120
    val d: Boolean = true

    val arrayNumbers = arrayOf(a,b,c,d)
    for(i in arrayNumbers.indices){
        println(arrayNumbers[i])
    }
}