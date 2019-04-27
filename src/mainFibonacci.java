import java.util.Scanner;

/**
 * 
 */

/**
 * @author Jose Antonio
 *
 */
public class mainFibonacci {
	private long num;
	private static long[] vector;
	private static Scanner teclado;
	
	//--------------------------------------------------------------------
	/**
	 * 
	 */
	public mainFibonacci() {
		// TODO Auto-generated constructor stub
		this.num = 0l;
		this.setVector(null);
	}
	
	//--------------------------------------------------------------------
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mainFibonacci mF = new mainFibonacci();
		teclado = new Scanner(System.in);
		
		System.out.print("Intro número máximo de repeticiones = ");
		mF.setNum(teclado.nextLong());
		
		setVector(new long[(int) mF.num]);
		
		calculoFibonacci cF = new calculoFibonacci((int) mF.getNum());
		
		setVector(cF.fibo(mF.getNum()));
		
		try {
			//imprimir los resultados
			for(byte k=0;k<=getVector().length-1;k++) {
				System.out.println(getVector()[k]);
			}
		}catch(IndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("error en el vector impresión");
		}
		
	}

	//--------------------------------------------------------------------
	public long getNum() {
		return num;
	}
	
	//--------------------------------------------------------------------
	public void setNum(long num) {
		this.num = num;
	}

	public static long[] getVector() {
		return vector;
	}

	public static void setVector(long[] vector) {
		mainFibonacci.vector = vector;
	}
	
	
}
