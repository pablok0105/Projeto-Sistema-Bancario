package sistema.bancario;

public class Conta {

	private String titular;
	private String tipoConta;
	private String numeroConta;
	private double saldo;
	private double taxa;
	private double valorBoleto;
	private String numeroBoleto;

	public boolean Sacar(double valor) {

		if (valor <= this.getSaldo()) {
			this.setSaldo(this.getSaldo() - valor);

			System.out.println("Saque realizado!");

			return true;

		} else {

			System.out.println("Você não possui o suficiente para sacar!");
			return false;

		}
	}

	public double Depositar(double valor) {

		setSaldo(getSaldo() + valor);

//      valor = 10
//   	getSaldo = 10

		return valor;

	}

	public String validarNome(String titular) {

		int max = 30;

		if (titular.length() <= max) {

			System.out.println("Nome aceito (OK)");

			this.setTitular(titular);
			return titular;

		} else {

			System.out.println("Nome rejeitado (X)");
			System.out.println("Nome pode ter no máximo 15 caracteres!\r");

			return null;

		}
	}

	public String validarNumeroP(String numero) { // conta

		int max = 5;

		if (numero.length() <= max) {

			System.out.println("Numero aceito (OK)");

			this.setNumeroConta(numero);

			return numero;

		} else {
			System.out.println("Numero rejeitado(X)");
			System.out.println("Numero pode ter no máximo 5 caracteres!\r");

			return null;

		}
	}
	
		public String validarNumeroI(String numero) { // conta

			int max = 3;

			if (numero.length() <= max) {

				System.out.println("Numero aceito (OK)");

				this.setNumeroConta(numero);

				return numero;

			} else {
				System.out.println("Numero rejeitado(X)");
				System.out.println("Numero pode ter no máximo 5 caracteres!\r");

				return null;

			}

	}

	public String validarBoleto(String numero) {

		int maximo = 15;

		if (numero.length() == maximo) {

			System.out.println("Boleto Gerado com sucesso");

			setNumeroBoleto(numero);
			return numero;

		} else {

			System.out.println("Numero inválido para um Boleto, coloque exatamente 15 caracteres");

			return null;

		}

	}

	public boolean validarEntrada(int a) {

		if (a == 0 || a > 8) {

			System.out.println("Informe um numero válido");

			return true;
		}

		return false;

	}

	public boolean mostrarDadosBanco(int a) {

		if (a == 3) {

			System.out.println(
					"_______________________________________________________________________________________________________________________");
			System.out.println("|Olá. nós somos do Banco 007 ");
			System.out
					.println("|Um banco criado por Pablo Emanuel e Manoel alfredo para alanvacar sua vida financeira");
			System.out.println("|Obrigado por Confiar em nossos serviços");
			System.out.println(
					"|Aqui você pode sacar,depositar, ver saldo, adicionar e pagar boletos quanto quiser, e muitas mais funcionalidades!");
			System.out.println("|se ja abriu, Aproveite!");
			System.out.println("|Se não abriu uma conta, Abra!");
			System.out.println(
					"_______________________________________________________________________________________________________________________");
			return true;
		}

		else {

			return false;
		}

	
}
	
	public boolean Fechar(int n) {
		
		if(n == 8 ) {
			
			System.out.println("Você Saiu!");
			return true;	
		}
		
		else {
			
			return false;
		}
		
		
		
	}
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public String getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;

	}

	public double getValorBoleto() {
		return valorBoleto;
	}

	public void setValorBoleto(double valorBoleto) {
		this.valorBoleto = valorBoleto;
	}

	public String getNumeroBoleto() {
		return numeroBoleto;
	}

	public void setNumeroBoleto(String numeroBoleto) {
		this.numeroBoleto = numeroBoleto;
	}

}