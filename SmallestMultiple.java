public class SmallestMultiple{
	public SmallestMultiple(){
		System.out.println(init());
	}

	public int init(){
		int num = 220;
		while(true){
			num += 220;
			for(int i = 12; i < 20; i++){
				if(num % i != 0)
					break;
				if(i == 19)
					return num;
			}
		}
	}

	public static void main(String[] args){
		SmallestMultiple smallestMultiple = new SmallestMultiple();
	}
}