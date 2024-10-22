package org.example
import java.security.SecureRandomParameters
import kotlin.random.Random

fun main(args: Array<String>) {
    println("Elige opcion: 1-10")
    var opcion = readLine()!!.toInt()

    if (opcion==1){
        println("Hola mundo")
    } else if (opcion==2){
        var vida : Int=100;
        println("La vida del personaje es " + vida)
    } else if (opcion==3){
        val c : Int=0;
        var total:Int = 0;
        while (c!=3){
            var numero = readLine()!!.toInt()
            total=total+numero*5;
        }

        println("El daño total del ataque es " + total)
    } else if (opcion==4){
    var moneda: Int=0;
        for (i in 1..10){
            moneda=moneda+5;
            println("En el turno"+i+"hay un total de " + moneda)
        }
    }else if (opcion==5){
        var nivel : Int=0;
        println("¿Que nivel es tu personaje?")
        nivel=readLine()!!.toInt()

        if (nivel<10){
    println("Personaje principiante")
        } else if (20>nivel&&nivel>10){
            println("Personaje intermedio")
        } else if (nivel>20){
            println("Personaje avanzado")
        }
    } else if (opcion==6){
        println("¿Cual es el ataque del personaje?")
        var ataque:Int = readLine()!!.toInt()

        if (ataque>50){
            println("Golpe critico, has hecho "+ataque*2+" de daño")
        }
    } else if (opcion==7){
        println("Inserte vida de su personaje")
        var vidaP:Int = readLine()!!.toInt()

        println("Inserte ataque de su personaje")
        var ataqueP:Int = readLine()!!.toInt()

        println("Inserte vida de su enemigo")
        var vidaE :Int = readLine()!!.toInt()

        println("Inserte ataque de su enemigo")
        var ataqueE :Int = readLine()!!.toInt()

        println("La curacion sera de:")
        var curacion : Int = readLine()!!.toInt()


        while (vidaE>0||vidaP>0){
            var random= Random
            val numeroR = random.nextInt(1, 3)

            println("¿Que quieres hacer?")
            println("1- Atacar")
            println("2- Curarse")
            var opcion:Int = readLine()!!.toInt()

            if (opcion==1){
                vidaE=vidaE-ataqueP
            } else if (opcion==2){
                vidaP=vidaE+curacion
            }

            if (numeroR==1){
                vidaP=vidaP-ataqueE
                println("El enemigo ha atacado")

            } else if (numeroR==2){
                vidaE=vidaE+curacion
                println("El enemigo se ha curado")
            }

            println("Tu vida es de "+ vidaP + "y la vida de tu enemigo es de "+ vidaE)

        }
    } else if (opcion==8){
        val inventario = mutableListOf<String>()

        while (true) {
            println("¿Qué quieres hacer?")
            println("1- Añadir objeto")
            println("2- Eliminar objeto")
            println("3- Mostrar lista de objetos")


            val opcion: Int = readLine()!!.toInt()

                if (opcion==1) {
                    println("Introduce el objeto que quieres añadir:")
                    val objeto = readLine()!!.toString()
                    inventario.add(objeto)
                    println("$objeto añadido al inventario.")
                }
                if (opcion==2){
                    println("Introduce el objeto que quieres eliminar:")
                    val objeto = readLine()!!.toString()
                    if (inventario.remove(objeto)) {
                        println("$objeto eliminado del inventario.")
                    } else {
                        println("$objeto no se encuentra en el inventario.")
                    }
                }
                if (opcion==3) {
                    println("Objetos en el inventario:")
                    if (inventario.isEmpty()) {
                        println("El inventario está vacío.")
                    } else {
                        inventario.forEach { println(it) }
                    }
                } else if(opcion==4){
                    break;
            break;
        }
            }
        }else if (opcion==9){
            while (true){
        println("¿Que ocurre en la batalla?")
        println("1- Ganas")
        println("2- Pierdes")
        println("3- Mostrar nivel y Exp")
                println("4- Salir")



                val opcion: Int = readLine()!!.toInt()
        var Experiencia: Int=0
        var nivel :Int=0


        if (opcion==1){
            Experiencia=Experiencia+50;
            if (Experiencia>=200){
                nivel=nivel+1;
                println("Obtuviste 50 de exp")
            }else if (opcion==2) {
                println("Obtuviste 0 de exp")
            }else if(opcion==3) {
                println("EXP: $Experiencia")
                println("Nivel: $nivel")
            } else if(opcion==4){
                break;
            }
            }
        }
    } else if (opcion==10){
        while (true) {
            val miembro1Ataque: Int = 100
            val miembro2Ataque: Int = 30
            val miembro3Ataque: Int = 65

            var enemigovida: Int = 500

            println("¿Que quieres hacer?")
            println("1- Atacar")
            println("2- Ver la vida del enemigo")
            println("3- Salir")


            val opcion: Int = readLine()!!.toInt()
            if (opcion == 1) {
                enemigovida = enemigovida - miembro1Ataque - miembro3Ataque - miembro2Ataque
                if (enemigovida <= 0) {
                    println("Habeis ganado")
                    break;
                }
            } else if (opcion == 2) {
                println("La vida del enemigo es: $enemigovida")
            } else if (opcion == 3) {
                break;
            }
        }
    }
    }

