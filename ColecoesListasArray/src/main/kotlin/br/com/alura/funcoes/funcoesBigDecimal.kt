package br.com.alura.br.com.alura.funcoes

import java.math.BigDecimal
import java.math.RoundingMode

/**
 * extends function
 */
fun Array<BigDecimal>.somatoria(): BigDecimal {
    return this.reduce { acumulador, valor ->
        acumulador + valor
    }
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
fun Array<BigDecimal>.media(): BigDecimal{
 return if(this.isEmpty()){
     BigDecimal.ZERO
 }else{
     this.somatoria() / this.size.toBigDecimal()
 }
}