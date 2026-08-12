import kotlin.system.exitProcess

var saldo = 100.5 // Float

fun main() {
    inicio()
}

fun inicio() {
    println("Escolha uma opção:")
    println("1 - Ver saldo")
    println("2 - Fazer depósito")
    println("3 - Fazer saque")
    println("4 - Sair")

    val escolha = readLine()?.toIntOrNull()

    when (escolha) {
        1 -> verSaldo()
        2 -> fazerDeposito()
        3 -> fazerSaque()
        4 -> sair()
        else -> erro()
    }
}

fun verSaldo() {
    println("Seu saldo atual é: $saldo")
    inicio()
}

fun fazerDeposito() {
    print("Qual o valor para depósito? ")
    val deposito = readLine()?.toFloatOrNull()
    // Usando readln e Elvis operator -> Operador de coalescência nula
    // val deposito = readln().toFloatOrNull() ?: 0.0

    if (deposito == null) {
        println("Por favor, informe um número válido.")
        fazerDeposito()
    } else {
        saldo += deposito
        verSaldo()
    }
}

fun fazerSaque() {
    print("Qual o valor para saque? ")
    val saque = readLine()?.toFloatOrNull()

    if (saque == null) {
        println("Por favor, informe um número válido.")
        fazerSaque()
    } else {
        saldo -= saque
        verSaldo()
    }
}

fun erro() {
    println("Por favor, informe um número entre 1 e 4.")
    inicio()
}

fun sair() {
    print("Você deseja sair? (S/N)")
    // Usando readln e Elvis operator -> Operador de coalescência nula 
    val confirma = readln().uppercase()
    // Locale -> Localização do usuário para converter para maiúsculo
    //val confirma = readLine()?.uppercase(Locale.getDefault())

    when (confirma) {
        "S" -> exitProcess(0) //Hasta la vista, baby
        "N" -> inicio() // Volta para o início
        else -> sair()
    }
}
