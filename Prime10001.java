public class Prime10001{
	public Prime10001(){
		System.out.println(init());
	}

	public int init(){
		int primeCount = 2;
		int prime = 3;
		boolean isPrime = true;
		while(true){
			prime += 2;
			for(int x = 3; x <= prime / 3; x += 2){
				if(prime % x == 0){
					isPrime = false;
					break;
				}
			}
			if(isPrime){
				primeCount++;
				if(primeCount == 10001)	
					return prime;
			}
			isPrime = true;
		}
	}

	public static void main(String[] args){
		Prime10001 prime10001 = new Prime10001();
	}
}