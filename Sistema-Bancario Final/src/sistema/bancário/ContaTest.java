package sistema.bancario.testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import sistema.bancario.Conta;

@DisplayName("Testes Classe Conta")
class ContaTest {

	Conta co;

	@BeforeEach
	public void setUp() throws Exception {

		co = new Conta();
	}
@DisplayName("Teste Saque")
	@Test
	public void testSacar() {

		boolean b;

		b = co.Sacar(0.0);
		assertTrue(b);

		b = co.Sacar(1.0);
		assertFalse(b);

	}
@DisplayName("Teste Deposito")
	@Test
	public void testDepositar() {

		double a;

		a = co.Depositar(10.0);
		assertEquals(10.0, a);
		assertEquals(co.getSaldo(), a);
		
	}
	@DisplayName("Teste Validaçao de Nome")
	@Test
	public void testValidarNome() {

		String p1, p2;
		p1 = co.validarNome("Pablo");
		co.getTitular();

		assertEquals(co.getTitular(), p1);

		p2 = co.validarNome("Pablo Santana Da Silva Neto Pablo Santana Da Silva Neto Pablo Santana Da Silva Neto");
		assertEquals(null, p2);
	}
	
	@DisplayName("Teste Validaçao de Entrada")
	@Test
	public void testvalidarEntrada() {

		boolean r, r1, r3, r4;

		r = co.validarEntrada(0);
		assertTrue(r);

		r1 = co.validarEntrada(3);
		assertFalse(r1);

		r3 = co.validarEntrada(9);
		assertTrue(r3);

		r4 = co.validarEntrada(8);
		assertFalse(r4);

	}
	
	@DisplayName("Teste Dados Banco")
	@Test
	public void testMostrarDadosBanco() {

		boolean b;

		b = co.mostrarDadosBanco(3);
		assertTrue(b);

		b = co.mostrarDadosBanco(1);
		assertFalse(b);

		b = co.mostrarDadosBanco(2);
		assertFalse(b);

		b = co.mostrarDadosBanco(0);
		assertFalse(b);

	}
}

