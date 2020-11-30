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

}