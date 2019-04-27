import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testCalculoFibonacci {
	
	calculoFibonacci cF;
	static final int a = 4;
	long[] esperado;
	long[] calculado;
	
	@Test
	public void testFibo() {
		//fail("Not yet implemented");
		
		esperado = new long[a];
		calculado = new long[a];
		
		cF = new calculoFibonacci(a);
		
		calculado = cF.fibo(a);
		
		esperado[0] = 1;
		esperado[1] = 1;
		esperado[2] = 2;
		esperado[3] = 3;
		
		//CTRL + SPACE en JUnit permite abrir la ayuda
			
		assertArrayEquals(esperado,calculado);
		
	}
	
	@Test(timeout = 100)
	public void testTiempoFibo() {
		cF = new calculoFibonacci(a);
		cF.fibo(a);
		
		//assertTimeout(1.0, cF.fibo(a));
	}

}
