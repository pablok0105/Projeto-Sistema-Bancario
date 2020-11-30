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

}