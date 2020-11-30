package principal;

import sistema.bancario.Conta;
import sistema.bancario.ContaInvestimento;
import sistema.bancario.ContaPoupanca;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// Menu

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int n;
		int numero;
		ContaPoupanca cp = null;
		ContaInvestimento ci = null;

		do {
			System.out.println(
					" __________________\r" + "|   Tela Inicial   | \r|------------------|\r|                  |");

			System.out.println("|1. Abrir conta    |");
			System.out.println("|2. Sacar          |");
			System.out.println("|3. Depositar      |");
			System.out.println("|4. Saldo          |");
			System.out.println("|5. Dados Bancários|");
			System.out.println("|6. Gerar Boleto   |");
			System.out.println("|7. Pagar Boleto   |");
			System.out.println("|8. Fechar tudo    |");
			System.out.println("|__________________|\r");

			n = scan.nextInt();

			Conta co = new Conta();

			co.validarEntrada(n);

			if (n == 1) {
				System.out.println(" _______________________\r"
						+ "|         Conta         | \r|-----------------------|\r|                       |");
				System.out.println(
						"|1. Conta Poupanca      |\n|2. Conta Investimento  |" + "\r|_______________________|\r");
				numero = scan.nextInt();

				if (numero != 1 && numero != 2) {
					System.out.println("Opcção inválida, tente novamente <<");
				}

				else if (numero == 1) {

					cp = new ContaPoupanca();

					cp.abrirContaP(cp.validarNome("Pablo Emanuel Poupa"), cp.validarNumeroP("12345"));

				}

				if (numero == 2) {

					ci = new ContaInvestimento();
					ci.abrirContaI(ci.validarNome("Pablo Emanuel Invest"), ci.validarNumeroI("543"));

				}

			}

			else if (n == 2) {
				System.out.println(
						" ________________________________\r|             Saque              | \r|--------------------------------|\r|                                |");
				System.out.println(
						"|1. Sacar da Conta Poupanca      |\n|2. Sacar da Conta Investimento  |\r|________________________________|\r");
				numero = scan.nextInt();

				if (numero == 1) {

					if (cp == null) {

						System.out.println("Não é possível acessar essa opção sem abrir uma Conta Poupança!");
					}

					else {

						System.out.println("Seu saldo na Poupança era de: " + cp.getSaldo());
						cp.Sacar(10);
						System.out.println("Seu atual na Poupança é: " + cp.getSaldo());

					}
				}

				if (numero == 2) {

					if (ci == null) {

						System.out.println("Não é possível acessar essa opção sem abrir uma Conta Investimento!");
					}

					else {

						System.out.println("Seu saldo na Poupança era de: " + ci.getSaldo());
						ci.Sacar(10.0);
						System.out.println("Seu saldo na Conta investimento é de: " + ci.getSaldo());

					}
				}

				if (numero != 1 && numero != 2) {
					System.out.println("Opcção inválida, tente novamente <<");
				}
			}

			else if (n == 3) {

				System.out.println("1. Depositar na Conta Poupanca\n2. Depositar na Conta Investimento");

				numero = scan.nextInt();

				if (numero == 1) {

					if (cp == null) {

						System.out.println("Não é possível acessar essa opção sem abrir uma Conta Poupança!");
					}

					else {
						System.out.println("Seu saldo na Poupança era de: " + cp.getSaldo());

						cp.Depositar(20.0);

						System.out.println("Seu atual na Poupança é: " + cp.getSaldo());

					}
				}

				if (numero == 2) {

					if (ci == null) {

						System.out.println("Não é possível acessar essa opção sem abrir uma Conta Investimento!");
					}

					else {

						System.out.println("Seu saldo na Investimento era de: " + ci.getSaldo());
						ci.Depositar(ci.Taxacao(20.0));
						
						
					}

				}

				if (numero != 1 && numero != 2) {
					System.out.println("Opcção inválida, tente novamente <<");
				}

			}

			else if (n == 4) {

				System.out.println("1. Saldo da Conta Poupanca\n2. Saldo da Conta Investimento");
				numero = scan.nextInt();

				if (numero == 1) {

					if (cp == null) {

						System.out.println("Não é possível acessar essa opção sem abrir uma Conta Poupança!");
					}

					else {
						System.out.println("Seu saldo na Poupança é: " + cp.getSaldo());
					}
				}

				if (numero == 2) {

					if (ci == null) {

						System.out.println("Não é possível acessar essa opção sem abrir uma Conta Investimento!");
					}

					else {
						System.out.println("Seu saldo na Conta Investimento é: " + ci.getSaldo());
					}
				}

				if (numero != 1 && numero != 2) {
					System.out.println("Opcção inválida, tente novamente <<");
				}

			}

			else if (n == 5) {
				System.out.println("1. Dados Conta Poupança\n2. Dados Conta Investimento\n3. Conhecer Banco");
				numero = scan.nextInt();

				if (numero == 1) {

					if (numero != 1 && numero != 2 && numero != 3) {
						System.out.println(">> Opcção inválida, tente novamente <<");
					}

					else if (cp == null) {

						System.out.println("Não é possível acessar essa opção sem abrir uma Conta Poupança!");
					}

					else {

						cp.mostrarDadosPoupanca(numero);
					}
				}

				if (numero == 2) {

					if (ci == null) {

						System.out.println("Não é possível acessar essa opção sem abrir uma Conta investimento!");
					}

					else {

						ci.mostrarDadosInvestimento(numero);
					}
				}

				if (numero == 3) {

					Conta conta = new Conta();
					conta.mostrarDadosBanco(numero);

				}

			}

			else if (n == 6) {

				if (cp == null) {

					System.out.println("Não é possível acessar essa opção sem abrir uma Conta Poupança!");
				}

				else {

					cp.gerarBoleto(cp.validarNumeroBoleto("123456781245674"));
				}

			}

			else if (n == 7) {

				if (cp == null) {
					System.out.println("Não é possível acessar essa opção sem abrir uma Conta Poupança!");

				}

				else {
					cp.pagarBoleto(cp.getNumeroBoleto(), cp.getSaldo(), cp.getValorBoleto());
				}

			}

			else if (n == 8) {

				co.Fechar(n);
				break;
			}

		} while (n != 8);

	}
}