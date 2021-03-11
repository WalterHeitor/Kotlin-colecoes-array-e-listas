package br.com.alura.br.com.alura.livro

fun criarListaDeLivros(){
    val livro1 = Livro(
        "memorias postumas cubas",
        "Maria Clara",
        1988
    )
    val livro2 = Livro(
        "Iracema",
        "rioderleia",
        2014,
        "Editora A"
    )
    val livro3 = Livro(
        "Matematica com tecnologia",
        "Walter",
        1978
    )
    val livro4 = Livro(
        "java para objetos",
        "heitor",
        1980,
        "editora B"
    )
    val livros: MutableList<Livro> = mutableListOf(livro1, livro2, livro3, livro4)

    livros.add(
        Livro("Sacarana",
        "Roberta",
        1990,
        "Editora C")
    )
    println(livros)
    livros.imprimeComMarcadores()
    livros.remove(livro2)
    println(livros)
    livros.imprimeComMarcadores()



}
/**
 * extends functions
 */
fun MutableList<Livro>.imprimeComMarcadores(){
    val textoFormatado = this.joinToString(separator = "\n") {
        " -> ${it.titulo} de ${it.autor}"
    }
    println("###### Lista de Livros ###### \n${textoFormatado}")
}



