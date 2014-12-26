public class LPP{
	public LPP(){
		System.out.println(init());
	}

	public int init(){
		int num;
		int hNum = 0;
		String string;
		for(int i = 999; i > 0; i--){
			for(int x = 999; x > 0; x--){
				num = x * i;
				if(num < hNum)
					break;
				string = Integer.toString(num);
				for(int r = 0; r <= string.length() / 2; r++){
					if(!(string.charAt(r) == string.charAt(string.length() - r - 1)))
						break;
					if(r == string.length() / 2)
						hNum = num;
				}
			}
		}
		return hNum;
	}

	public static void main(String[] args){
		LPP lpp = new LPP();
	}
}