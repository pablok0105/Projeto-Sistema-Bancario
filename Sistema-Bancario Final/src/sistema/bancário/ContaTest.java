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
}

