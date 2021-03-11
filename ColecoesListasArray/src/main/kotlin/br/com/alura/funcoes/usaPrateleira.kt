package br.com.alura.br.com.alura.funcoes

import br.com.alura.br.com.alura.livro.Prateleira
import br.com.alura.br.com.alura.livro.imprimeComMarcadores
import br.com.alura.br.com.alura.livro.listaDeLivros

fun usaPrateleira(){
    val prateleira = Prateleira(genero = "Literatura", livros = listaDeLivros)
    val p1  = prateleira
    val p2 = prateleira
    val porAutor = p1.organozarPorAutor()               //tem que criar 2 vaviaveis pois pratelera e unica referencia
    val porAnoPublicacao = p2.organozarPorAnoPublicacao()
    porAutor.imprimeComMarcadores()
    porAnoPublicacao.imprimeComMarcadores()
}