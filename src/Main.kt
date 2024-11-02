import java.sql.SQLOutput
import java.text.DecimalFormat

fun main() {

    // ELABORADO POR: ING. WILLIAM ALEXANDER MATALLANA PORRAS


    // comentarios de 1 linea
    /*

    Comentarios multilinea

     */

    // variables -> var  variables que cambian
    // constantes -> val variables que no cambian

    /*
    // variables de tipo implicitas

    println("VARIABLES DE TIPO IMPLICITAS")
    var numero = 45  // Variable de tipo entero

    var decimal = 12.5   // variable coma flotante

    var texto = "Hola mundo"

     val fecha = "2024-10-15"

    val pi = 3.1416


    println("El numero entero es: ${numero}")
    println("El numero decimal es: ${decimal}")
    println("El texto es: ${texto}")
    println("La primer constante es: ${fecha}")
    println("El numero PI: ${pi}")
*/
    /*
    // Variables explicitas

    println("VARIABLES DE TIPO EXPLICITAS")
    var numero1:Int = 56

    var resultado:Double = 25.8

    var caracter:Char = 'a'

    println("La primer variable explicita es: ${numero1}")
    println("La segunda vaiable explicita es: ${resultado}")
    println("La tercer varibles explicita es: ${caracter}")

    var n1 = 45
    var n2:Int = 67

    var suma = n1+n2
    var resta = n1-n2
    var multi = n1*n2

    println("LA SUMA ENTRE ${n1} Y ${n2}  ES: ${suma}")
    println("LA RESTA ENTRE ${n1} Y ${n2} ES: ${resta}")
    println("LA MULTIPLICACION ENTRE ${n1} Y ${n2} ES: ${multi}")
*/
    /*
    // CONVERSIONES ENTRE DATOS

    var total = "10"

    var convertir = total.toInt()*20

    println("EL VALOR CONVERTIDO ES: ${convertir} ")

    println("OPCION 1 - TRADFICIONAL MENSAJES \n MULTI \n LINEA \n")
    println("""
        OPCION 2
        KOTLIN
        MENSAJES
        MULTI
        LINEA
    """.trimIndent())
*/

    /*
    // INGRESAR DATOS POR TECLADO

    println("Ingrese el primer valor de tipo entero")
    var n1 = readln().toInt()

    println("INGRESE EL SEGUNDO VALOR DE TIPO ENTERO")
    var n2 = readln().toInt()

    var res = n1+n2

    println("EL RESULTADO DE SUMAR ${n1} CON ${n2} ES: ${res}")


    var raiz = Math.sqrt(n1.toDouble())



    println("LA RAIZ DE ${n1} ES: ${raiz}")

    // Redondeo de un numero
    println("LA RAIZ DE ${n1} ES: ${Math.round(raiz)}")

    //Redondeo de un numero arriba
    println("LA RAIZ DE ${n1} ES: ${Math.ceil(raiz)} CON REDONDEO ARRIBA")

    // Redondeo abajo
    println("LA RAIZ DE ${n1} ES: ${Math.floor(raiz)} CON REDONDEO ABAJO")

    //Formato a los numeros

    println("LA RAIZ DE ${n1} ES: ${DecimalFormat("#.###").format(raiz)}")
*/

    /*
        // CONDICIONALES IF -ELSE

        println("INGRESE SU EDAD")
        var edad = readln().toInt()

        if (edad > 0 && edad <= 10) {
            println("ES UN NIÑO")
        } else if (edad > 10 && edad <= 18) {
            println("ES ADOLESCENTE")
        } else {
            println("ES ADULTO")
        }
    */
    /*
        // WHEN

        println("INGRESE LA OPCION QUE DESEA")
        var opcion = readln().toInt()


        when(opcion){

            1 -> {
                println("Bienvenido a esta opcion")
                println("selecciono opcion 1")

            }
            2-> {
                println("Bienvenido a esta opcion")
                println("selecciono opcion 2")
            }
            3 -> println("seleccion opcion 3")

            else-> println("no existe la opcion")

        }
    */

    // ciclos for
    /*
        for (i in 1 .. 100) {

            println(i)
        }


        for (j in 1 .. 100 step 3) {

            println(j)
        }


        for (x in 100 downTo  1 step 3) {
            println(x)
        }
    */
    /*
    println("INGRESE LA TABLA QUE DESEA")
    var tabla = readln().toInt()

    for (i in 1..10){
        println("${tabla} x ${i} = ${(tabla*i)}")
    }
*/
    /*
        // While

        var z = 1

        while(z<=10){

            println(z)
            z+=1

        }
        */

    // do while

    var m = 100

    do{
        println(m)
        m--

    }while(m>=1)














}