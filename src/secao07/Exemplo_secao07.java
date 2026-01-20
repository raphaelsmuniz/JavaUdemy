package secao07;

public class Exemplo_secao07 {

	public static void main(String[] args) {

		String original = "abcde FGHIJ ABC abc DEFG    ";
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2, 9);
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("abc", "xy");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		String s = "potato apple lemon";
		String[] vect = s.split(" ");
		//String word1 = vect[0];
		//String word2 = vect[1];
		//String word3 = vect[2];
		
		
		System.out.println("original: -" + original + "-");
		System.out.println("toLowercase: -" + s01 + "-");
		System.out.println("toUpperrcase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("substring(2): -" + s04 + "-");
		System.out.println("substring(2,9): -" + s05 + "-");
		System.out.println("replace('a', 'x'): -" + s06 + "-");
		System.out.println("replace('abc', 'xy'): -" + s07 + "-");
		System.out.println("indexOf('bc'): -" + i + "-");
		System.out.println("lastIndexOf('bc'): -" + j + "-");
		
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
	}

}
