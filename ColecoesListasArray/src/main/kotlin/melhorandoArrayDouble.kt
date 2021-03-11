package br.com.alura

fun melhorandoArrays() {
    val salarios: DoubleArray = doubleArrayOf(1000.0, 1500.0, 2000.0, 2500.0, 3000.0)

    val aumento = 1.2
    var indice = 0
    for (salario in salarios) {
        salarios[indice] = salario * aumento
        indice++
    }
    println(salarios.contentToString())
    val acrecimo = 1.5
    for (indice1 in salarios.indices) {

        salarios[indice1] = salarios[indice1] * acrecimo
    }
    println(salarios.contentToString())

    val dobro = 2.0
    salarios.forEachIndexed { i, salario ->
        salarios[i] = salario * dobro
    }
    println(salarios.contentToString())
}