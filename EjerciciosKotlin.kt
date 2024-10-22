package org.example.HLC

//Ejercicios Java --> Kotlin

fun main1(){
        val vida = 100;
        val personaje = "Naruto";
       println("El personaje " + personaje + " tiene " + vida + " puntos de vida.");
    }

fun main2(){
    val cofres = arrayOf("Espada", "Escudo", "Poción")
    for (cofre in cofres) {
        println("Has encontrado: $cofre")
    }
}

class Personaje(var nombre: String, var vida: Int, var ataque: Int) {
    fun mostrarInfo() {
        println("Nombre: $nombre, Vida: $vida, Ataque: $ataque")
    }


        fun main3(args: Array<String>) {
            val goku = Personaje("Goku", 100, 50)
            goku.mostrarInfo()

    }
}

fun main4() {
    println(multiplicar(5))

    val operacion: Operacion = object : Operacion {
        override fun sumar(a: Int, b: Int): Int {
            return a + b
        }
    }

    println(operacion.sumar(3, 4))
}

fun multiplicar(num: Int): Int {
    return num
}

interface Operacion {
    fun sumar(a: Int, b:Int):Int
}



    fun main5(args: Array<String>) {
        val goku = Personaje2("Goku", 100, 20)
        val vegeta = Personaje2("Vegeta", 80, 25)
        while (goku.vida > 0 && vegeta.vida > 0) {
            goku.vida -= vegeta.ataque
            vegeta.vida -= goku.ataque
            println("Vida de Goku: " + goku.vida)
            println("Vida de Vegeta: " + vegeta.vida)
        }
        if (goku.vida <= 0) {
            println("Vegeta ha ganado el combate.")
        } else {
            println("Goku ha ganado el combate.")
        }
    }


class Personaje2(var nombre: String, var vida: Int, var ataque: Int)
{

}