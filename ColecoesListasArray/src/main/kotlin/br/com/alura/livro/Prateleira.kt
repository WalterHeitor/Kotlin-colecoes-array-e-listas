package br.com.alura.br.com.alura.livro

class Prateleira(
    val genero: String,
    val livros: MutableList<Livro>
) {
    fun organozarPorAutor(): MutableList<Livro>{
        livros.sortBy { it.autor }
        return livros
    }
    fun organozarPorAnoPublicacao(): MutableList<Livro>{
        livros.sortBy { it.anoPublicacao }
        return livros
    }
}