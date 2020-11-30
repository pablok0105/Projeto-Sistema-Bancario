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

}
