package br.com.alura.br.com.alura.livro

data class Livro (
    val titulo: String,
    val autor: String,
    val anoPublicacao: Long,
    val editora: String? = null

)