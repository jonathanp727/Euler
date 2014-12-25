import java.util.ArrayList;

public class LPF{

	long bigDick = 600851475143l;
	ArrayList<Integer> lol;
	int urMom;

	public LPF(){
		lol = new ArrayList<Integer>();
		urMom = 0;
		getPrimes();
		for(int i = 0; i < lol.size(); i++){
			if(bigDick % lol.get(i) == 0){
				urMom = Math.max(urMom, lol.get(i));
			}
		System.out.println(urMom);
		}
	}

	private void getPrimes(){
		boolean bobbyboy = false;
		for(int i = 1; i < bigDick / 2; i++){
			for(int x = 1; x < i; x++){
				if(i % x == 0)
					bobbyboy = true;
			}
			if(!bobbyboy)
				lol.add(new Integer(i));
			bobbyboy = false;
		}
	}

	public static void main(String[] args){
		LPF runner = new LPF();
	}
}