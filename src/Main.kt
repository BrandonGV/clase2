//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {



    //Variables implicitas

    var numero =45 //variable de tipo entero

    var decimal =12.5 //variable coma flotante

    var texto="hola mundo"

   //variables constantes
    val fecha ="2024-10-15"

    val pi = 3.1416

    println("hola el numero es ${numero}")
    println("hola decimal  ${decimal}")
    println("hola texto ${texto}")


    //Variables explicitas

    var numero1:Int = 56

    var resultado:Double =25.8

    var caracter:Char ='a'

    println("La primer variable explicita es ${numero1}")
    println("Las segunda variable explicita es ${resultado}")
    println("la tercer variable explicita es ${caracter}")

    var n1 =45
    var n2:Int = 67

    var suma = n1+n2
    var resto =n1+n2
    var multi = n1*n2

    println("la suma entre ${n1} y ${n2} ES = $")

    var total = "10"

    var convertir = total.toInt()

    println("El valor convertido es : ${convertir}")
    println()



}