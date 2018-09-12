package atm;

import org.junit.Test;

import org.junit.Assert;

public class AtmTest {
	@Test
	public void shouldDoSomething() {
		// Arrange
		Atm underTest = new Atm(23456.00);
		// act
		double balance = underTest.balance;
		//assert
		Assert.assertEquals(23456.00, balance, 0.005);
	}

}
