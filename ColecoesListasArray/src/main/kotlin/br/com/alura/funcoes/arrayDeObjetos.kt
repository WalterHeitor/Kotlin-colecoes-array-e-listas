package br.com.alura.br.com.alura.funcoes

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
    }

    fun calculaAumentoRelativo(salario: BigDecimal, aumento: BigDecimal) =
        if (salario < "2000.0".toBigDecimal()) {
            salario + "500.0".toBigDecimal()
        } else {
            //2 casas decimais e arredonda para cima
            (salario * aumento).setScale(2, RoundingMode.UP)
        }

    fun bigDecimalArrayOf(vararg valores:String) : Array<BigDecimal> {
        return Array<BigDecimal>(valores.size) { i ->
            valores[i].toBigDecimal()
        }
    }

    /**
     * extends function
     */
    fun Array<BigDecimal>.somatoria(): BigDecimal{
       return this.reduce { acumulador, valor ->
            acumulador + valor
        }
    }

