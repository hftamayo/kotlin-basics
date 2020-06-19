package com.tamayo.basicsalutation

fun main(args: Array<String>){
    println("Hola a todos")
    println("primer programa en Kotlin")

    val nombre = "Herbert Fernandez Tamayo"
    println(nombre)

    var salarioSemanal: Int = 100
    var salamrioMensual: Int = salarioSemanal * 4
    println(salarioSemanal)
    println(salamrioMensual)

    println()

    val apples = 6
    val oranges = 5
    val fruits: Int = apples + oranges
    println(fruits)

    println()
    val weeks: Int = 138
    val years: Double = weeks / 52.0
    //concatenaciones
    println("years entre weeks son: " + years)
    println("ejemplo de concatenacion: " + nombre)

    //string interpolation
    println("1/4 de las manzanas disponiles es ${apples / 4}")
    println("otro ejemplo de concatenar $nombre")
    println("$weeks semanas traducidas a anios son: $years anios")

    //caracter escaping
    println("mi nombre es \$nombre")

    //var = variable, val = constante

    /*idealmente el codigo no deberia tener warnings
    que se ubican en la parte derecha
     */
}
