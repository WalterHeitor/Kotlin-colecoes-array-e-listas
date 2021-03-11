package br.com.alura.br.com.alura.livro

fun listarLivrosNulos(){
    listaDeLivrosNulos.imprimeComMarcadores()

    listaDeLivros
        .groupBy { it.editora ?: "Editora desconhecida"}
        .forEach { (editora, livros) ->    //editora chave do mapa ... livro conteudo do mapa () parametros
println("$editora: ${livros.joinToString { it.titulo }}")
        }
}