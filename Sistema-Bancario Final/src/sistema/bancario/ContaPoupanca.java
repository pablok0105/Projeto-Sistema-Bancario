package sistema.bancario;

public class ContaPoupanca extends Conta {


	public ContaPoupanca() {
		super();

		setTaxa(0.0);

	}

	public String validarNumeroBoleto(String numeroB) {

		int maximo = 15;

		if (numeroB.length() == maximo) {

			System.out.println("Boleto Gerado com sucesso\r");
			setNumeroBoleto(numeroB);

			return numeroB;

		} else {

			System.out.println("Numero inválido para um Boleto, coloque exatamente 15 caracteres");

			return null;

		}

	}

	public boolean abrirContaP(String a, String b) {

		if (a != null || b != null) {

			setTitular(a);
			setNumeroConta(b);

			setSaldo(50.00);
			setTipoConta("Conta Poupança");
			System.out.println(">> Conta Poupança Criada <<");

			return true;
		} else {

			return false;
		}

	}

	public boolean mostrarDadosPoupanca(int a) {

		if (a == 1) {

			System.out.println(
					" ________________________________\r|      Dados Conta Poupança      | \r|--------------------------------|\r|                           "
							+ "     |");

			System.out.println("|Nome: " + getTitular());
			System.out.println("|Numero da Conta: " + getNumeroConta());
			System.out.println("|" + getTipoConta() + "                  |");
			System.out.println("|________________________________|\r");
			return true;
		}

		else {

			return false;
		}

	}

	public boolean gerarBoleto(String a) {

		if (a != null) {

			setValorBoleto(15.0);
			setNumeroBoleto("123456781245674");

			System.out.println("Numero Boleto: " + getNumeroBoleto());
			System.out.println("Valor do Boleto: R$" + getValorBoleto());

			return true;
		} else {

			return false;
		}

	}

	public int pagarBoleto(String a, double b, double c) {

		setNumeroBoleto(a);
		setSaldo(b);
		setValorBoleto(c);

		if (a == null) {

			System.out.println("Não existe boletos para pagar!");

			return 1;
		}

		else if (b >= c && a != null) {

			setSaldo(b - c);
			setValorBoleto(c - c);

			setNumeroBoleto(null);

			System.out.println("boleto pago");

			System.out.println("Numero Boleto: - " + getNumeroBoleto());
			System.out.println("Valor do Boleto: R$" + getValorBoleto());

			return 2;

		}

		else {
			System.out.println("Você não possui Saldo o suficiente para Pagar o Boleto, deposite e tente novamente.");
			System.out.println("Numero Boleto: " + getNumeroBoleto());
			System.out.println("Valor do Boleto: R$" + getValorBoleto());

			return 3;

		}

	}
}
