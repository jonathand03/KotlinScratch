package Control

fun main(args: Array<String>){
    val note: Double = 5.7
    val note2: Double = 7.1
/* Diversas formas de escrever o IF e ELSE */
    //Tradicional
        if(note > 7) {
            println("Approved!")
        }
        else {
            println(":(")
        }
    //Como expressao dentro de print
        println(if(note > 7) "Approved!" else "Not yet!")
    // Ou tambem
        //val majorValue =if(note2 > note ) note2 else note
    //Ou tambem
        val majorValue1 =if(note2 > note ){
            println("Pode conter qualquer bloco codigo aqui no IF")
            note2
        } else {
            println("Pode conter qualquer bloco codigo aqui no ELSE")
            note
        }
        println("O maior valor é $majorValue1")

        if(note in 7.0..10.0){
            println("Aluno aprovado")
        }else if(note in 5.0..6.9){
            println("Avaliação final")
        }else{
            println("Reprovado")
        }
    //Utilizando a estrutura When ( SWITCH )
    when(note2){
        in 7.0..10.0 -> println("Aluno aprovado")
        in 5.0..6.9 ->  println("Avaliação final")
        else ->  println("Reprovado")
    }

}