package programs;


public class tocheckvowels{

private static void tocheckvowels(String name) {
		int vowelcount = 0;
		int whitespce=0;
		for(int index = 0; index < name.length(); index++) {
			switch(name.charAt(index)) {
			case 'a' :
			case 'e' :
			case 'i' :
			case 'o' :
			case 'u' :
				vowelcount++;
				break;
			case ' ' :
				whitespce++;
			}
		}
			System.out.println(vowelcount);
			System.out.println(whitespce);
			System.out.println( name.length() - (vowelcount + whitespce));
		}
	
		public static void main(String[] args) {

			String name = "Amisha Bhandarge";
			tocheckvowels(name.toLowerCase());
		}
}
	