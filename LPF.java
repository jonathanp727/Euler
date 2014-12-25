public class LPF{

	long num;
	int urMom;
	boolean bobbers;

	public LPF(long num){
		bobbers = true;
		this.num = num;
		urMom = 0;

		init();
		System.out.println(urMom);
	}

	public void init(){
		for(int i = 5; i <= num; i += 2){
			for(int x = 3; x < i / 3; x += 2){
				if(i % x == 0){
					bobbers = false;
					break;
				}
			}
			if(bobbers && num % i == 0){
				num /= i;
				urMom = i;
			}
			bobbers = true;	
		}		
	}

	public static void main(String[] args){
		LPF runner = new LPF(600851475143l);
	}
}
