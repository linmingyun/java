package xml;

public class Search {
	
	public static void main(String[] args) {
		String str = "abbcccdddd";
		char[] c = new char[str.length()];
		int[] cs = new int[str.length()];
		for(int i=0; i<cs.length; i++){
			cs[i] = 0;
		}
		for(int i=0; i<str.length(); i++){
			if(i == 0){
				c[i] = str.charAt(i);
				cs[i] = 1;
			}else{
				int j;
				for(j=0; j<c.length; j++){
					if(str.charAt(i) == c[j]){
						cs[j]++;
						break;
					}
				}
				if(j == c.length){
					c[i] = str.charAt(i);
					cs[i] = 1;
				}
			}
		}
		for(int i=0; i<cs.length-1; i++){//Ñ¡ÔñÅÅÐò
			int maxIndex = i;
			for(int j=i+1; j<cs.length; j++){
				if(cs[maxIndex] < cs[j])maxIndex = j;
			}
			if(maxIndex != i){
				int temp;
				temp = cs[i];
				cs[i] = cs[maxIndex];
				cs[maxIndex] = temp;
				char ch;
				ch = c[i];
				c[i] = c[maxIndex];
				c[maxIndex] = ch;
			}
		}
		for(int i=0; i<c.length; i++){
			System.out.print(c[i]+" ");
		}
		System.out.println();
		for(int i=0; i<cs.length; i++){
			System.out.print(cs[i]+" ");
		}
	}
}