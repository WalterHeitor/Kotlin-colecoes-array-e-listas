package br.com.alura.br.com.alura.livro

class Prateleira(
    val genero: String,
    val livros: List<Livro>
) {
    fun organozarPorAutor(): List<Livro> {
        return livros.sortedBy { it.autor }
    }
    fun organozarPorAnoPublicacao(): List<Livro>{
       return livros.sortedBy { it.anoPublicacao }
    }
}