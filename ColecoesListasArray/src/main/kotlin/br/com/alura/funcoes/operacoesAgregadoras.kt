package br.com.alura.br.com.alura.funcoes

fun operacoesAgregadoras() {
    val idades: IntArray = intArrayOf(10, 12, 93, 18, 40, 67, 5, 10)
    val maiorIdade = idades.max()
    println("maiorIdade $maiorIdade")
    val menorIdade = idades.min()
    println("menor idade $menorIdade")
    val media: Double = idades.average()
    println("media $media")
    val maiores = idades.all { it > 18 }
    println("Todos sao maiores de 18? $maiores")
    val existeMaior = idades.any { it >= 18 }
    println("existe maior de 18? $existeMaior")
    val listMaiores = idades.filter { it >= 18 }
    println("Lista maior de 18? $listMaiores")
    val busca = idades.find { it >= 18 }
    println("buscar maior de 18? $busca")
}