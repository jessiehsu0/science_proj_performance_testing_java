public class projjava {
	public static void main(String args[]){
		long sum = 0;
		long start = System.nanoTime();
		for(int i=0; i<1000000; i++){
			//System.out.println("The value of i is: "+i);
			sum++;
		}
		long finish = System.nanoTime();
		long timeElapsed = finish - start;
		System.out.println("Total elapsed time =" + timeElapsed);
	}
}
