package br.com.alura

fun constrindoArrays() {
    val idades = IntArray(4)
    idades[0] = 25
    idades[1] = 32
    idades[2] = 17
    idades[3] = 42

    var maiorIdade = 0
    for (idade in idades) {
        if (idade > maiorIdade) {
            maiorIdade = idade
        }
    }
    println("maior idade: $maiorIdade")

    var menorNumero = Int.MAX_VALUE
    val numeros: IntArray = intArrayOf(37, 23, 42, 62, 25, 17)
    numeros.forEach { numero ->
        if (numero < menorNumero) {
            menorNumero = numero
        }
    }
    println("menor numero $menorNumero")
}