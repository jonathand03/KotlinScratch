import pacoteA.simpleFunc
import pacoteA.Thing
import pacoteA.CoinSide.HEAD
import pacoteB.*

fun main(args: Array<String>){
    val a: Int  = 15
    val b: Int  = 13
    kotlin.io.println(Sum(15,3))
    val thing = Thing("Ball")
    println(thing.name)
    println(HEAD)
    println(simpleFunc("Hello"))
    println("A($a) + B($b) | Soma = ${Sum(a,b)} |  Sub = ${Sub(a,b)}" )

}