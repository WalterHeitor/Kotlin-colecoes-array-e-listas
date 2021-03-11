package br.com.alura

fun rangers() {
    val serie: IntRange = 1.rangeTo(10)
    for (s in serie) {
        print("$s, ")
    }
    println()
    val numerospares = 0..20 step 2
    for (n in numerospares) {
        print("$n ")
    }

    println()
    val numerospares2 = 2.until(30) step 2
    for (n in numerospares2) {
        print("$n ")
    }

    println()
    val intProgression = 30 downTo 0 step 2
    for (n in intProgression) {
        print("$n ")
    }
    println()
    val intervalo = 1500.0..5000.0
    val s = 4000.0
    if (s in intervalo) {
        println("esta dentro do intervalo")
    } else {
        println("nao esta no intervalo")
    }
    val albabeto = 'a'..'z'
    val letra = 'w'
    println(letra in albabeto)
}