package Control

/** @brief: Utilizando laço de repetição com estrutura condicional dentro do loop
 *  @author: Francisco Jonathan Lima Drumond
 *  Também utilizei as funções downTo (Decremento) e step (Incremento Personalizado)
 */
fun main(args : Array<String>){
    for(i in 1..10){
        print(if(i < 10) "$i, " else "$i")
    }
    println()
    for(i in 10 downTo 1){
        print(if(i > 1) "$i, " else "$i")
    }
    println()
    for(i in 0  ..100 step 5){
        print("$i ")
    }
    println()
    val alunos = arrayListOf("Jonathan", "Lucas", "Mario", "Adsom")
    for((indice,aluno) in alunos.withIndex()){
        println("${indice+1} ==> $aluno")
    }
}