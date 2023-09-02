
public class StringEg {

	public static void main(String[] args) {
		String literal ="Amisha";
		String literal1 ="Bhandarge";	
		String literal2 ="Amisha";
		String literal3 ="ami sha";
		
		
		String object1 = new String ("hello");
		String object2 = new String ("Hello");
		String object3 = new String ("Hello");
		
		//System.out.println(object1 == object2);  false
		System.out.println(object2 == object3); //false
		System.out.println(literal == literal2); //true  ...==addrs
		System.out.println(literal.charAt(3)); //s
		System.out.println(literal.concat(" say hi")); //Amisha say hi
		System.out.println(literal); //Amisha
		System.out.println(literal.length()); //6
		System.out.println(literal.indexOf('a')); //5
		System.out.println("     hi".stripLeading()); //hi
		System.out.println("     hi             ".stripTrailing()); 
		System.out.println("    hello   all    ".strip());
		
		System.out.println("     ".isEmpty()); //false
		System.out.println("".isEmpty()); //true
		
		System.out.println(" ".isBlank()); //true
		System.out.println("appy".compareTo("appi")); //16
		
		char arr[] = literal.toCharArray(); //'J','a','n',' ','a',ni
		char letters[] = {'h', 'h', 'u'};
		String str = new String(letters);
			System.out.print(str);
		System.out.println("lower".toUpperCase());
		System.out.println("HELLOdsf".toLowerCase());
	}

}
