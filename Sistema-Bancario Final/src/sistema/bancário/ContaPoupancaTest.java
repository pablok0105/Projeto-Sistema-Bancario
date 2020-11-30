package sistema.bancario.testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import sistema.bancario.ContaPoupanca;

@DisplayName("Testes Classe Conta Poupanca")
class ContaPoupancaTest {

	ContaPoupanca cp;

	@BeforeEach
	public void setUp() throws Exception {

		cp = new ContaPoupanca();
	}
	
	@DisplayName("Teste Validaçao do Numero do Boleto")
	@Test
	public void testvalidarNumeroBoleto() {

		String e, e1;

		e = cp.validarNumeroBoleto("123456789234567");
		assertEquals(cp.getNumeroBoleto(), e);

		e1 = cp.validarNumeroBoleto("123456789");
		assertEquals(null, e1);

	}

	@DisplayName("Teste Abrir Conta Poupanca")
	@Test
	public void testAbrirContaoP() {

		boolean b;

		b = cp.abrirContaP(cp.validarNome("Pablo Emanuel"), cp.validarNome("12345"));
		assertTrue(b);

		b = cp.abrirContaP(cp.validarNome("Pablo Emanuel Pablo Pablo Pablo Pablo"), cp.validarNumeroP("123456"));
		assertFalse(b);

	}
	@DisplayName("Teste Gerar Boleto")
	@Test
	public void testGerarBoleto() {

		boolean a;

		a = cp.gerarBoleto(cp.validarNumeroBoleto("123456789123456"));
		assertTrue(a);

		a = cp.gerarBoleto(cp.validarNumeroBoleto("123"));
		assertFalse(a);

		a = cp.gerarBoleto(cp.validarNumeroBoleto("12345678912345678"));
		assertFalse(a);

	}
	
	@DisplayName("Teste Pagar Boleto")
	@Test
	public void testPagarBoleto() {

		// NumeroBoleto = a;
		// Saldo = b ;
		// ValorBoleto = c;

		String a1;

		a1 = cp.validarNumeroBoleto("123456789123456");

//							(numeroBoleto, Saldo, ValorBoleto)
		assertEquals(cp.pagarBoleto(null, 0.0, 0.0), 1);
		assertEquals(cp.pagarBoleto(a1, 10.0, 5.0), 2);
		assertEquals(cp.pagarBoleto(a1, 5.0, 10.0), 3);

	}
	@DisplayName("Teste Deposito Poupanca")
	@Test
	public void testDepositoPoupanca() {

		// NumeroBoleto = a;
		// Saldo = b ;
		// ValorBoleto = c;

		if (cp.abrirContaP("pablo", "12345")) {

			cp.Depositar(10.0);
			assertEquals(60.0, cp.getSaldo());

}}
	
		@DisplayName("Teste Saque Poupanca")
	@Test
	public void testSaquePoupanca() {

		boolean a;

		if (cp.abrirContaP("pablo", "12345")) {
			a = cp.Sacar(10.0);
			assertTrue(a);
		}

		if (cp.abrirContaP("pablo", "12345")) {
			a = cp.Sacar(60.0);
			assertFalse(a);
		}

		if (cp.abrirContaP("pablo", "12345")) {
			a = cp.Sacar(50.0);
			assertTrue(a);
		}

	}
		@DisplayName("Teste Dados Poupanca")
	@Test
	public void testMostrarDadosPoupanca() {

		boolean b;

		b = cp.mostrarDadosPoupanca(1);
		assertTrue(b);
		b = cp.mostrarDadosPoupanca(2);
		assertFalse(b);
		b = cp.mostrarDadosPoupanca(3);
		assertFalse(b);
	}

	@DisplayName("Teste Validaçao de Numero")
	@Test
	public void testValidarNumero() {

		String n;
		
		n = cp.validarNumeroP("123");
		assertEquals("123", n);
		
		n = cp.validarNumeroP("1234");
		assertNotEquals("123" , n);
		
		n = cp.validarNumeroP("123456");
		assertEquals(null , n);
		
	}
}
