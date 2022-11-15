package Operators

data class Carro(val marca: String = "Sem marca",val modelo: String = "Sem modelo")

fun main(args: Array<String>){
    val (marca,modelo) = Carro("Ford", "Fusion")
    print("$marca, $modelo")
}