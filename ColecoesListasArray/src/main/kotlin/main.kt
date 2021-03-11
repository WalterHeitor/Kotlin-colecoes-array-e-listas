package br.com.alura

fun main(){
    val idades = IntArray(4)
    idades[0] = 25
    idades[1] = 32
    idades[2] = 17
    idades[3] = 42

    var maiorIdade = 0
    for (idade in idades){
        if(idade > maiorIdade){
            maiorIdade = idade
        }
    }
    println(maiorIdade)



}