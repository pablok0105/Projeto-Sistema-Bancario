package sistema.bancario.testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import sistema.bancario.ContaInvestimento;

@DisplayName("Testes Classe Conta Investimento")
class ContaInvestimentoTest {

	ContaInvestimento ci;

	@BeforeEach
	void setUp() throws Exception {

		ci = new ContaInvestimento();

	}

	@DisplayName("Teste Abrir Conta Investimento")
	@Test
	public void testAbrirContaoP() {

		boolean b;

		b = ci.abrirContaI(ci.validarNome("Pablo Emanuel"), ci.validarNome("12345"));
		assertTrue(b);

		b = ci.abrirContaI(ci.validarNome("Pablo Emanuel Pablo Pablo Pablo Pablo"), ci.validarNumeroI("123346678"));
		assertFalse(b);

	}

	@DisplayName("Teste Taxa")
	@Test
	public void testTaxacao() {

		double n1 = 0;
		double a = 2;
		// Conta Investimento inicia com 0.0 reais

		if (n1 == ci.Taxacao(3.0)) {

			assertEquals(0.0, ci.getSaldo());

		}

		if (n1 == ci.Taxacao(ci.Depositar(4.0))) {

			assertEquals(1.0, ci.getSaldo());

		}

		if (n1 == ci.Taxacao(2.0)) {

			assertEquals(ci.getSaldo(), 0.0);
		
		}
		
		if (n1 == ci.Taxacao(2.0)) {

			assertNotEquals(ci.getSaldo(), 1.0);
		
		}

	}

	@DisplayName("Teste Dados Poupanca")
	@Test
	public void testMostrarDadosPoupanca() {

		boolean b;

		b = ci.mostrarDadosInvestimento(2);
		assertTrue(b);
		b = ci.mostrarDadosInvestimento(1);
		assertFalse(b);
		b = ci.mostrarDadosInvestimento(3);
		assertFalse(b);
	}

	@DisplayName("Teste Deposito Poupanca")
	@Test
	public void testDepositoPoupanca() {

		// NumeroBoleto = a;
		// Saldo = b ;
		// ValorBoleto = c;

		if (ci.abrirContaI("pablo", "12345")) {

			ci.Depositar(10.0);

			assertEquals(10.0, ci.getSaldo());

		}
	}

	@DisplayName("Teste Saque Investimento")
	@Test
	public void testSaqueInvestimento() {

		boolean a;
		double b;

		if (ci.abrirContaI("pablo", "12345")) {
			a = ci.Sacar(10.0);
			assertFalse(a);
		}

		if (ci.abrirContaI("pablo", "12345")) {
			a = ci.Sacar(0.0);
			assertTrue(a);
		}

		if (ci.abrirContaI("pablo", "12345")) {
			b = ci.Depositar(ci.Taxacao(50.0));
			a = ci.Sacar(47.0);
			assertTrue(a);
		}

		if (ci.abrirContaI("pablo", "12345")) {
			b = ci.Depositar(ci.Taxacao(50.0));
			a = ci.Sacar(50.0);
			assertFalse(a);
		}

	
	}
	
	@DisplayName("Teste Validaçao de Numero Investimento")
	@Test
	public void testValidarNumero() {

		String n;

		n = ci.validarNumeroI("123");
		assertEquals("123", n);

		n = ci.validarNumeroI("123");
		assertNotEquals("12", n);

		n = ci.validarNumeroI("1234");
		assertEquals(null, n);

	}
}