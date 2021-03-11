package br.com.alura

import java.math.BigDecimal
import java.math.RoundingMode

fun main(){

    val salarios = bigDecimalArrayOf("1000.32", "2000.5", "3000.654", "4000.98", "5000.50")

//        = Array<BigDecimal>(5) { BigDecimal.ZERO }
//    salarios[0] = "1000".toBigDecimal()
//    salarios[1] = "2000".toBigDecimal()

    println(salarios.contentToString())

    val aumento = "1.1".toBigDecimal()
    //funcao map retorna lista de bigdecimal por isso muda o retorno de toTyedArray
    val salariosComAumento: Array<BigDecimal> = salarios
        .map {salario ->
            if(salario < "2000.0".toBigDecimal()){
                salario + "500.0".toBigDecimal()
            }else {
                //2 casas decimais e arredonda para cima
                (salario * aumento).setScale(2, RoundingMode.UP)
            }
        }
        .toTypedArray()

    println(salariosComAumento.contentToString())

}

fun bigDecimalArrayOf(vararg valores:String) : Array<BigDecimal>{
    return Array<BigDecimal>(valores.size){i ->
        valores[i].toBigDecimal()
    }
}





