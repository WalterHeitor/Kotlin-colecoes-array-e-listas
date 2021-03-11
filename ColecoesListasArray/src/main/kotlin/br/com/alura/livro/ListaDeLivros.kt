package br.com.alura.br.com.alura.livro

fun criarListaDeLivros(){
    var livro1 = Livro(
        "memorias postumas cubas",
        "Maria Clara",
        1988
    )
    var livro2 = Livro(
        "Iracema",
        "rioderleia",
        2014,
        "Editora A"
    )
    var livro3 = Livro(
        "Matematica com tecnologia",
        "Walter",
        1978
    )
    var livro4 = Livro(
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
    livros.remove(livro2)
    println(livros)
}