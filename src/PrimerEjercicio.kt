//Función para encontrar el IMC
fun calcularIMC(peso: Double, alturaMetros: Double): Double {
    return peso / (alturaMetros * alturaMetros)
}
// Se inicializan los limites
fun obtenerClasificacionIMC(imc: Double): String {
    return when {
        imc >= 40.00 -> "Obesidad mórbida"
        imc >= 35.00 -> "Obesidad media"
        imc >= 30.00 -> "Obesidad leve"
        imc >= 25.00 -> "Sobrepeso"
        imc >= 18.50 -> "Normal"
        imc >= 17.00 -> "Delgadez leve"
        imc >= 16.00 -> "Delgadez moderada"
        else -> "Delgadez severa"
    }
}
//Función para leer la entrada de teclado, se convierten a dobuble , se crea un if para solo aceptar valores mayores a 0
fun main() {
    println("Calculadora de IMC")
    println("Ingrese su peso en kilogramos:")
    val peso = readLine()?.toDoubleOrNull() ?: 0.0

    println("Ingrese su altura en metros (ejemplo: 1.75):")
    val altura = readLine()?.toDoubleOrNull() ?: 0.0

    if (peso <= 0 || altura <= 0) {
        println("Ingrese valores válidos mayores a 0")
        return
    }
// Se operan los valores ingresados y se obtiene la calificación en base a los limites estipulados
    val imc = calcularIMC(peso, altura)
    val clasificacion = obtenerClasificacionIMC(imc)


    println("\nResultados:")
    println("Su IMC es: %.2f".format(imc))
    println("Clasificación: $clasificacion")
}