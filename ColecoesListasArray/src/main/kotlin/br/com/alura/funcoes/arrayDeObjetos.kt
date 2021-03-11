package br.com.alura.br.com.alura

import java.math.BigDecimal
import java.math.RoundingMode


    fun arrayDeObjetos() {
        val salarios = bigDecimalArrayOf("1000.32", "2000.5", "3000.654", "4000.98", "5000.50")

//        = Array<BigDecimal>(5) { BigDecimal.ZERO }
//    salarios[0] = "1000".toBigDecimal()
//    salarios[1] = "2000".toBigDecimal()

        println(salarios.contentToString())

        val aumento = "1.1".toBigDecimal()
        //funcao map retorna lista de bigdecimal por isso muda o retorno de toTyedArray
        val salariosComAumento: Array<BigDecimal> = salarios
            .map { salario -> calculaAumentoRelativo(salario, aumento) }
            .toTypedArray()

        println(salariosComAumento.contentToString())

        val gastoInicial = salariosComAumento.somatoria()
        println("gasto inicial $gastoInicial")

        val meses = 6.toBigDecimal()
        val gastototal = salariosComAumento.fold(gastoInicial) { acumulador, salario ->
            acumulador + (salario * meses).setScale(2, RoundingMode.UP)
        }

        println("gasto total $gastototal")

        println("media 2: ${salariosComAumento
            .sorted()
            .takeLast(3)
            .toTypedArray()
            .media()}")

        val salarioOrdenados = salariosComAumento.sorted()

        val tresUltimosSalarios: Array<BigDecimal> = salarioOrdenados
            .takeLast(3) // takeLast retorna uma lista
            .toTypedArray()
        val media = tresUltimosSalarios.media()
        println("media $media")



    }






