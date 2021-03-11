package br.com.alura.br.com.alura.livro

/**
 * extends functions
 */
fun List<Livro?>.imprimeComMarcadores() {
    val textoFormatado = this
        .filterNotNull()//.filter { it != null }
        .joinToString(separator = "\n") {
        " -> ${it.titulo} de ${it.autor}"
    }
    println("###### Lista de Livros ###### \n${textoFormatado}")
}