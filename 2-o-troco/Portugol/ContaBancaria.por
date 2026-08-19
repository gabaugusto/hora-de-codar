programa {
	
   	real saldo = 150.00// Float

	funcao inicio() {

		inteiro opcao 
	
		escreva("Escolha uma opção:\n")
		escreva("1. Ver saldo\n")
		escreva("2. Fazer depósito\n")
		escreva("3. Fazer saque\n")
		escreva("4. Sair\n")
		leia(opcao)

		escreva("A opção selecionada foi: " +opcao + "\n")

    		se (opcao == 1) {
    			verSaldo()
    		} senao se (opcao == 2) {
				fazerDeposito()
    		} senao se (opcao == 3) {
				fazerSaque()
    		} senao se (opcao == 4) {
				sair()
    		} senao {
				erro()
    		}

	}

	funcao verSaldo(){
	    escreva("Seu saldo atual é: ", saldo, "\n")
	    inicio()
	}
	
	funcao fazerDeposito() {

		real deposito
		
		escreva("Qual o valor para depósito? ")
		leia(deposito)
		
		se (deposito <= 0){
			escreva("Por favor, informe um número válido.\n")
			fazerDeposito()
		} senao {
			saldo = saldo + deposito
			verSaldo()
		}
	}
	
	funcao fazerSaque(){
	
		real saque
	
		escreva("Qual o valor para saque? ")
		leia(saque)
	
		se (saque <= 0){
	        escreva("Por favor, informe um número válido.\n")
	        fazerSaque()
		} senao {
			saldo = saldo - saque
			verSaldo()
		}
	}

	funcao erro() {
		escreva("Opção Inválida")
		inicio()
	}

	funcao sair(){
		escreva("Programa encerrado")
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 47; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
