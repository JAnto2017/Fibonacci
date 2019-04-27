
public class calculoFibonacci {
	
	private long[] vec;
	
	//-----------------------------------------------
	public calculoFibonacci(int _n) {
		this.vec = new long[_n];
	}
	
	//-----------------------------------------------
	public long[] fibo(long _l) {
		
		//calculoFibonacci cF = 
		new calculoFibonacci((int) _l);
		
		vec[0] = 1;
		vec[1] = 1;
		
		try {
			
			for(int i=2;i<=vec.length-1;i++) {
				vec[i] = vec[i-2] + vec[i-1]; 
			}
			
		} catch(IndexOutOfBoundsException e) {
			e.printStackTrace();
			System.err.println("error en excepción vector");
		}
		
		
		return vec;
	}

}
