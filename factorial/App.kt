import kotlin.io.readLine
import kotlin.text.toInt

// *** função para calcular o factorial
// Obs: Factorial de 0 é igual a 1
fun factorial(n: Int): Int = if (n == 0) 1 else (n * factorial(n - 1))

fun main() {

    var numero: Int

    // Leitura dos dados
    print("\n#Digita um número:  ")
    numero = readLine()!!.toInt()

    // Imprimindo o resultado
    print("\n#Factorial = ${factorial(numero)}\n")
}
