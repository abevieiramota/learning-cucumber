package br.com.abevieiramota.cucumber;

import static org.junit.Assert.assertEquals;

import cucumber.api.java8.En;

public class CalculadoraSteps implements En {

	private Calculadora calculadora;
	private Integer pesoDoBereu;
	private Integer caloriasCalculadas;

	public CalculadoraSteps() {
		
		this.calculadora = new Calculadora();
		
		Given("^the bereu enters his weight (\\d+)KG$", (Integer peso) -> {
			this.pesoDoBereu = peso;
		});

		When("^the bereu executes calculate$", () -> {
			this.caloriasCalculadas = this.calculadora.calculate(this.pesoDoBereu);
		});

		Then("^the system must show (\\d+)Kcals$", (Integer esperado) -> {
			assertEquals(esperado, this.caloriasCalculadas);
		});
	}

}
