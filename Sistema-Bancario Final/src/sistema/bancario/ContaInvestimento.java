package sistema.bancario;

public class ContaInvestimento extends Conta {

	public boolean validador1;

	public ContaInvestimento() {
		super();

		setSaldo(0.0);

	}

	public double Taxacao(double saldo) {

		setTaxa(3.0);

		if (saldo >= getTaxa()) {

			saldo = saldo - getTaxa();


			return saldo;

		}

		else if (getSaldo() < getTaxa()) {

				setSaldo(0.0);
				
				System.out.println("O valor minimo para depositar de 2,50");
				
				
				saldo = 0.0;
			}

			return saldo;

	}

	public boolean abrirContaI(String a, String b) {

		if (a != null && b != null) {

			setTitular(a);
			setNumeroConta(b);

			setTipoConta("Conta Investimento");
			setSaldo(0.0);
			System.out.println(">> Conta Investimento Criada <<");

			return true;
		}

		else {

			return false;
		}

	}

	public boolean mostrarDadosInvestimento(int a) {

		if (a == 2) {

			System.out.println(
					" ________________________________\r|    Dados Conta Investimento    | \r|--------------------------------|\r|                           "
							+ "     |");

			System.out.println("|Nome: " + getTitular());
			System.out.println("|Numero da Conta: " + getNumeroConta());
			System.out.println("|" + getTipoConta() + "              |");
			System.out.println("|________________________________|\r");
			return true;
		}

		else {

			return false;
		}

	}
	

}